package com.assignment.simplenotess.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.assignment.simplenotess.data.repository.NotesRepository;
import com.assignment.simplenotess.helpers.PreferencesHelper;
import com.google.android.gms.auth.api.identity.SignInCredential;
import dagger.hilt.android.lifecycle.HiltViewModel;
import kotlinx.coroutines.Dispatchers;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\r\u001a\u00020\u000eH\u0002J\u0006\u0010\u000f\u001a\u00020\u000eJ\u0010\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u000e\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0012R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8F\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\nR\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/assignment/simplenotess/viewmodel/LoginViewModel;", "Landroidx/lifecycle/ViewModel;", "preferencesHelper", "Lcom/assignment/simplenotess/helpers/PreferencesHelper;", "notesRepository", "Lcom/assignment/simplenotess/data/repository/NotesRepository;", "(Lcom/assignment/simplenotess/helpers/PreferencesHelper;Lcom/assignment/simplenotess/data/repository/NotesRepository;)V", "isLoggedIn", "Landroidx/lifecycle/LiveData;", "", "()Landroidx/lifecycle/LiveData;", "mIsLoggedIn", "Landroidx/lifecycle/MutableLiveData;", "checkLoginStatus", "", "logout", "saveLoginInfo", "credential", "Lcom/google/android/gms/auth/api/identity/SignInCredential;", "singInResult", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel
public final class LoginViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final com.assignment.simplenotess.helpers.PreferencesHelper preferencesHelper = null;
    @org.jetbrains.annotations.NotNull
    private final com.assignment.simplenotess.data.repository.NotesRepository notesRepository = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> mIsLoggedIn = null;
    
    @javax.inject.Inject
    public LoginViewModel(@org.jetbrains.annotations.NotNull
    com.assignment.simplenotess.helpers.PreferencesHelper preferencesHelper, @org.jetbrains.annotations.NotNull
    com.assignment.simplenotess.data.repository.NotesRepository notesRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.lang.Boolean> isLoggedIn() {
        return null;
    }
    
    public final void singInResult(@org.jetbrains.annotations.NotNull
    com.google.android.gms.auth.api.identity.SignInCredential credential) {
    }
    
    private final void checkLoginStatus() {
    }
    
    public final void logout() {
    }
    
    private final void saveLoginInfo(com.google.android.gms.auth.api.identity.SignInCredential credential) {
    }
}