package com.meshmap.social.firebase

import android.app.Application
import com.google.firebase.FirebaseApp
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

class FirebaseInitializer : Application() {
    override fun onCreate() {
        super.onCreate()
        FirebaseApp.initializeApp(this)
        Firebase.auth.signInAnonymously()
    }
}