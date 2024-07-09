package com.assignment.simplenotess.ui

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.assignment.simplenotess.R
import com.assignment.simplenotess.adapters.NotesAdapter
import com.assignment.simplenotess.data.model.Note
import com.assignment.simplenotess.databinding.FragmentNotesListBinding
import com.assignment.simplenotess.viewmodel.LoginViewModel
import com.assignment.simplenotess.viewmodel.NotesViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class NotesListFragment: Fragment() {

    private var nullableBinding: FragmentNotesListBinding? = null
    private val binding get() = nullableBinding!!

    private lateinit var adapter: NotesAdapter

    val notesViewModel: NotesViewModel by viewModels()
    val loginViewModel: LoginViewModel by viewModels()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        nullableBinding = FragmentNotesListBinding.inflate(inflater, container, false)
        binding.lifecycleOwner = viewLifecycleOwner
        setHasOptionsMenu(true)
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupRecyclerView()

        observeNotes()

        binding.fabAddNote.setOnClickListener {
            parentFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, NotesFragment())
                .addToBackStack(null)
                .commit()
        }

        notesViewModel.loadNotes()
    }

    private fun setupRecyclerView() {
        val layoutManager = LinearLayoutManager(context)
        binding.recyclerView.layoutManager = layoutManager
        adapter = NotesAdapter(listOf(), { note -> editNote(note) }, { note -> deleteNote(note) })
        binding.recyclerView.adapter = adapter
    }

    private fun observeNotes() {
        notesViewModel.notes.observe(viewLifecycleOwner, Observer { notes ->
            notes?.let {
                adapter.updateNotes(it)
            }
        })
    }

    private fun editNote(note: Note) {
        val fragment = NotesFragment().apply {
            arguments = Bundle().apply {
                note.id?.let { putInt("noteId", it) }
                putString("noteContent", note.content)
            }
        }
        parentFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, fragment)
            .addToBackStack(null)
            .commit()
    }

    private fun deleteNote(note: Note) {
        notesViewModel.deleteNotes(note)
    }


    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.menu_logout, menu)
        super.onCreateOptionsMenu(menu, inflater)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.action_logout -> {
                logout()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

    private fun logout() {
        loginViewModel.logout()
        loginViewModel.isLoggedIn.observe(viewLifecycleOwner, Observer { isLoggedIn ->
            if (!isLoggedIn) {
                parentFragmentManager.beginTransaction()
                    .replace(R.id.fragment_container, LoginFragment())
                    .commit()
            }
        })
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
    }

    override fun onDestroy() {
        super.onDestroy()
        nullableBinding = null
    }

}