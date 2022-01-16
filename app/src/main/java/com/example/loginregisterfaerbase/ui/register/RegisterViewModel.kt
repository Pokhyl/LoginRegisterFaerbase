package com.example.loginregisterfaerbase.ui.register


import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.google.android.gms.tasks.Task
import com.google.firebase.auth.AuthResult
import com.google.firebase.auth.FirebaseAuth
import kotlinx.coroutines.launch

class RegisterViewModel : ViewModel() {
    val auth = FirebaseAuth.getInstance()
    fun register(email: String, password: String) {
println("$email $password  11111111111111")
        var authResalt: Task<AuthResult>? = null
        viewModelScope.launch {
            auth.createUserWithEmailAndPassword(email, password).addOnCompleteListener() {
                if (it.isSuccessful) {
println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!")
                } else {
println("${it.result}?????????????????????????")
                }
            }

        }

    }
}