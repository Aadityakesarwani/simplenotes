package com.assignment.simplenotess.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.assignment.simplenotess.data.model.Note
import com.assignment.simplenotess.databinding.FragmentNotesBinding
import com.assignment.simplenotess.viewmodel.NotesViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class NotesFragment : Fragment(){

    private var nullableBinding : FragmentNotesBinding? = null
    private val binding get() = nullableBinding!!
    private val notesViewModel: NotesViewModel by viewModels()

    private var noteId: Int? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        nullableBinding = FragmentNotesBinding.inflate(inflater, container, false)
        setHasOptionsMenu(true)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val toolbar = (activity as? AppCompatActivity)?.supportActionBar
        toolbar?.setDisplayHomeAsUpEnabled(true)


        arguments?.let {
            noteId = it.getInt("noteId")
            binding.etNoteContent.setText(it.getString("noteContent"))
        }

        binding.btnSave.setOnClickListener {
            if (noteId == null) {
                saveNote()
            } else {
                updateNote()
            }
        }
    }

    private fun saveNote()
    {
        val noteContent = binding.etNoteContent.text.toString()
        if (noteContent.isBlank()) {
            Toast.makeText(context, "Note content cannot be empty", Toast.LENGTH_SHORT).show()
            return
        }
        val note = Note(content = noteContent)
        notesViewModel.addNotes(note)
        parentFragmentManager.popBackStack()
    }

    private fun updateNote()
    {
        val noteContent = binding.etNoteContent.text.toString()
        if (noteContent.isBlank()) {
            Toast.makeText(context, "Note content cannot be empty", Toast.LENGTH_SHORT).show()
            return
        }

        val note = Note(id = noteId!!, content = noteContent)
        notesViewModel.updateNotes(note)
        parentFragmentManager.popBackStack()
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            android.R.id.home -> {
                parentFragmentManager.popBackStack()
                true
            }

            else -> super.onOptionsItemSelected(item)
        }
    }


    override fun onDestroyView()
    {
        super.onDestroyView()
        val toolbar = (activity as? AppCompatActivity)?.supportActionBar
        toolbar?.setDisplayHomeAsUpEnabled(false)
        nullableBinding = null
    }
}