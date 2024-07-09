package com.assignment.simplenotess.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.assignment.simplenotess.R;
import com.assignment.simplenotess.adapters.NotesAdapter;
import com.assignment.simplenotess.data.model.Note;
import com.assignment.simplenotess.databinding.FragmentNotesListBinding;
import com.assignment.simplenotess.viewmodel.LoginViewModel;
import com.assignment.simplenotess.viewmodel.NotesViewModel;
import dagger.hilt.android.AndroidEntryPoint;

@dagger.hilt.android.AndroidEntryPoint
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u0010\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\b\u0010\u001a\u001a\u00020\u0016H\u0002J\b\u0010\u001b\u001a\u00020\u0016H\u0002J\"\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001e2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\u0018\u0010\"\u001a\u00020\u00162\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&H\u0016J&\u0010\'\u001a\u0004\u0018\u00010(2\u0006\u0010%\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010+2\b\u0010,\u001a\u0004\u0018\u00010-H\u0016J\b\u0010.\u001a\u00020\u0016H\u0016J\u0010\u0010/\u001a\u0002002\u0006\u00101\u001a\u000202H\u0016J\u001a\u00103\u001a\u00020\u00162\u0006\u00104\u001a\u00020(2\b\u0010,\u001a\u0004\u0018\u00010-H\u0016J\b\u00105\u001a\u00020\u0016H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u00068BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\t\u001a\u00020\n8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u000f\u001a\u00020\u00108FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0011\u0010\u0012R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u00066"}, d2 = {"Lcom/assignment/simplenotess/ui/NotesListFragment;", "Landroidx/fragment/app/Fragment;", "()V", "adapter", "Lcom/assignment/simplenotess/adapters/NotesAdapter;", "binding", "Lcom/assignment/simplenotess/databinding/FragmentNotesListBinding;", "getBinding", "()Lcom/assignment/simplenotess/databinding/FragmentNotesListBinding;", "loginViewModel", "Lcom/assignment/simplenotess/viewmodel/LoginViewModel;", "getLoginViewModel", "()Lcom/assignment/simplenotess/viewmodel/LoginViewModel;", "loginViewModel$delegate", "Lkotlin/Lazy;", "notesViewModel", "Lcom/assignment/simplenotess/viewmodel/NotesViewModel;", "getNotesViewModel", "()Lcom/assignment/simplenotess/viewmodel/NotesViewModel;", "notesViewModel$delegate", "nullableBinding", "deleteNote", "", "note", "Lcom/assignment/simplenotess/data/model/Note;", "editNote", "logout", "observeNotes", "onActivityResult", "requestCode", "", "resultCode", "data", "Landroid/content/Intent;", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "inflater", "Landroid/view/MenuInflater;", "onCreateView", "Landroid/view/View;", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onOptionsItemSelected", "", "item", "Landroid/view/MenuItem;", "onViewCreated", "view", "setupRecyclerView", "app_debug"})
public final class NotesListFragment extends androidx.fragment.app.Fragment {
    @org.jetbrains.annotations.Nullable
    private com.assignment.simplenotess.databinding.FragmentNotesListBinding nullableBinding;
    private com.assignment.simplenotess.adapters.NotesAdapter adapter;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy notesViewModel$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy loginViewModel$delegate = null;
    
    public NotesListFragment() {
        super();
    }
    
    private final com.assignment.simplenotess.databinding.FragmentNotesListBinding getBinding() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.assignment.simplenotess.viewmodel.NotesViewModel getNotesViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.assignment.simplenotess.viewmodel.LoginViewModel getLoginViewModel() {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override
    public void onViewCreated(@org.jetbrains.annotations.NotNull
    android.view.View view, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setupRecyclerView() {
    }
    
    private final void observeNotes() {
    }
    
    private final void editNote(com.assignment.simplenotess.data.model.Note note) {
    }
    
    private final void deleteNote(com.assignment.simplenotess.data.model.Note note) {
    }
    
    @java.lang.Override
    public void onCreateOptionsMenu(@org.jetbrains.annotations.NotNull
    android.view.Menu menu, @org.jetbrains.annotations.NotNull
    android.view.MenuInflater inflater) {
    }
    
    @java.lang.Override
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull
    android.view.MenuItem item) {
        return false;
    }
    
    private final void logout() {
    }
    
    @java.lang.Override
    public void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable
    android.content.Intent data) {
    }
    
    @java.lang.Override
    public void onDestroy() {
    }
}