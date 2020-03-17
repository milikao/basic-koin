package com.welton.basickoin

import androidx.lifecycle.ViewModel

class LoginViewModel(val userRepository: UserRepository) : ViewModel(){

    fun logged() = "logado"
}