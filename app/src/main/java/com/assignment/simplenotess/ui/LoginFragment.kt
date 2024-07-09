package com.assignment.simplenotess.ui

import android.content.ContentValues.TAG
import android.content.Intent
import android.content.IntentSender
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import com.assignment.simplenotess.R
import com.assignment.simplenotess.databinding.FragmentLoginBinding
import com.assignment.simplenotess.viewmodel.LoginViewModel
import com.google.android.gms.auth.api.identity.BeginSignInRequest
import com.google.android.gms.auth.api.identity.Identity
import com.google.android.gms.auth.api.identity.SignInClient
import com.google.android.gms.common.api.ApiException
import dagger.hilt.android.AndroidEntryPoint
import kotlin.math.log

//this annotation tells hilt that this fragment will receive dependencies injected by hilt
@AndroidEntryPoint
class LoginFragment : Fragment() {

    //to avoid null pointer exception using two variables nullable and safe.
    private var nullableBinding: FragmentLoginBinding? = null
    private val binding get() = nullableBinding!!
    private val loginViewModel: LoginViewModel by viewModels()


    private lateinit var oneTapClient: SignInClient
    private lateinit var signInRequest: BeginSignInRequest


    private val REQ_ONE_TAP = 2

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        nullableBinding = FragmentLoginBinding.inflate(inflater, container, false)
        binding.lifecycleOwner = viewLifecycleOwner
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        observeLoginStatus()


        oneTapClient = Identity.getSignInClient(requireContext())
        signInRequest = BeginSignInRequest.builder()


            .setPasswordRequestOptions(BeginSignInRequest.PasswordRequestOptions.builder()
                .setSupported(true)
                .build())
            .setGoogleIdTokenRequestOptions(
                BeginSignInRequest.GoogleIdTokenRequestOptions.builder()
                    .setSupported(true)
                    .setServerClientId(getString(R.string.web_client_id))
                    .setFilterByAuthorizedAccounts(false)
                    .build())

            .setAutoSelectEnabled(true)
            .build()

        binding.signInButton.setOnClickListener {
            oneTapClient.beginSignIn(signInRequest)
                .addOnSuccessListener(requireActivity()) { result ->
                    try {

                        startIntentSenderForResult(
                            result.pendingIntent.intentSender, REQ_ONE_TAP,
                            null, 0, 0, 0, null)
                    } catch (e: IntentSender.SendIntentException) {
                        Log.e(TAG, "Couldn't start One Tap UI: ${e.localizedMessage}")
                    }
                }

                .addOnFailureListener(requireActivity()) { e ->
                    Log.d(TAG, e.localizedMessage)
                }
        }
    }

    private fun observeLoginStatus() {
        loginViewModel.isLoggedIn.observe(viewLifecycleOwner, Observer { isLoggedIn ->
            if (isLoggedIn) {
                parentFragmentManager.beginTransaction()
                    .replace(R.id.fragment_container, NotesListFragment())
                    .commit()
            }
        })
    }


    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        when (requestCode) {
            REQ_ONE_TAP -> {
                try {
                    val credential = oneTapClient.getSignInCredentialFromIntent(data)
                    loginViewModel.singInResult(credential)
                } catch (e: ApiException) {
                   Log.e(TAG, "Error: Sign in credential ")
                }
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        nullableBinding = null
    }
}