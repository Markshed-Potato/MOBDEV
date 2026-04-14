package com.example.myapplication.data

class LoginRepository {

    fun validateCredentials(email: String, password: String): Boolean {
        val validEmail = "farmer@agrilink.com"
        val validPassword = "agri1234"
        return email == validEmail && password == validPassword
    }
}
