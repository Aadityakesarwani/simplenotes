package com.assignment.simplenotess.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.assignment.simplenotess.data.model.Note
import com.assignment.simplenotess.data.repository.NotesRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import javax.inject.Inject

@HiltViewModel
class NotesViewModel @Inject constructor(private val repository: NotesRepository) : ViewModel() {

    private val mutableNotes = MutableLiveData<List<Note>>()
    val notes: LiveData<List<Note>> get() = mutableNotes

    fun loadNotes() {
        viewModelScope.launch {
            val notesList = withContext(Dispatchers.IO) {
                repository.getAllNotes()
            }
            mutableNotes.postValue(notesList)
        }
    }

    fun addNotes(note: Note) {
        viewModelScope.launch {
            withContext(Dispatchers.IO) {
                repository.addNote(note)
                loadNotes()
            }
        }
    }

    fun updateNotes(note: Note) {
        viewModelScope.launch {
            withContext(Dispatchers.IO) {
                repository.updateNote(note)
                loadNotes()
            }
        }
    }


    //delete notes upon long click on notes item
    fun deleteNotes(note: Note) {
        viewModelScope.launch {
            withContext(Dispatchers.IO) {
                repository.deleteNote(note)
                loadNotes()
            }
        }
    }
}
