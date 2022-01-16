package com.example.loginregisterfaerbase.ui.login


import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.google.firebase.auth.FirebaseAuth
import kotlinx.coroutines.launch

class LoginViewModel : ViewModel() {
    val auth = FirebaseAuth.getInstance()
    fun login(email: String, password: String){
        viewModelScope.launch {
            auth.signInWithEmailAndPassword(email, password)
        }
    }

}