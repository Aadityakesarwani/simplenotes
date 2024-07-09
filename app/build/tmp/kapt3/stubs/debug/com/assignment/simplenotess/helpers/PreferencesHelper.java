package com.assignment.simplenotess.helpers;

import android.content.Context;
import android.content.SharedPreferences;
import dagger.hilt.android.qualifiers.ApplicationContext;
import javax.inject.Inject;
import javax.inject.Singleton;

@javax.inject.Singleton
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0011\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0007\u001a\u00020\bJ\b\u0010\t\u001a\u0004\u0018\u00010\nJ\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\nR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/assignment/simplenotess/helpers/PreferencesHelper;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "preferences", "Landroid/content/SharedPreferences;", "clearLoggedInUser", "", "getLoggedInUserId", "", "isLoggedIn", "", "setLoggedInUser", "userId", "Companion", "app_debug"})
public final class PreferencesHelper {
    @org.jetbrains.annotations.NotNull
    private final android.content.SharedPreferences preferences = null;
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String LOGGED_IN = "logged_in";
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String USER_ID = "user_id";
    @org.jetbrains.annotations.NotNull
    public static final com.assignment.simplenotess.helpers.PreferencesHelper.Companion Companion = null;
    
    @javax.inject.Inject
    public PreferencesHelper(@dagger.hilt.android.qualifiers.ApplicationContext
    @org.jetbrains.annotations.NotNull
    android.content.Context context) {
        super();
    }
    
    public final boolean isLoggedIn() {
        return false;
    }
    
    public final void setLoggedInUser(@org.jetbrains.annotations.NotNull
    java.lang.String userId) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getLoggedInUserId() {
        return null;
    }
    
    public final void clearLoggedInUser() {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/assignment/simplenotess/helpers/PreferencesHelper$Companion;", "", "()V", "LOGGED_IN", "", "USER_ID", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}