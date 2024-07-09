package com.assignment.simplenotess.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.assignment.simplenotess.data.model.Note;
import com.assignment.simplenotess.data.repository.NotesRepository;
import dagger.hilt.android.lifecycle.HiltViewModel;
import kotlinx.coroutines.Dispatchers;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\bJ\u000e\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\bJ\u0006\u0010\u0011\u001a\u00020\u000eJ\u000e\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\bR\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\n8F\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/assignment/simplenotess/viewmodel/NotesViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/assignment/simplenotess/data/repository/NotesRepository;", "(Lcom/assignment/simplenotess/data/repository/NotesRepository;)V", "mutableNotes", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/assignment/simplenotess/data/model/Note;", "notes", "Landroidx/lifecycle/LiveData;", "getNotes", "()Landroidx/lifecycle/LiveData;", "addNotes", "", "note", "deleteNotes", "loadNotes", "updateNotes", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel
public final class NotesViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final com.assignment.simplenotess.data.repository.NotesRepository repository = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.assignment.simplenotess.data.model.Note>> mutableNotes = null;
    
    @javax.inject.Inject
    public NotesViewModel(@org.jetbrains.annotations.NotNull
    com.assignment.simplenotess.data.repository.NotesRepository repository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.util.List<com.assignment.simplenotess.data.model.Note>> getNotes() {
        return null;
    }
    
    public final void loadNotes() {
    }
    
    public final void addNotes(@org.jetbrains.annotations.NotNull
    com.assignment.simplenotess.data.model.Note note) {
    }
    
    public final void updateNotes(@org.jetbrains.annotations.NotNull
    com.assignment.simplenotess.data.model.Note note) {
    }
    
    public final void deleteNotes(@org.jetbrains.annotations.NotNull
    com.assignment.simplenotess.data.model.Note note) {
    }
}