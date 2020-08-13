package com.welton.basickoin

import androidx.lifecycle.ViewModel

class ParametersViewModel(val id: Int, val name: String, val userRepository: UserRepository) : ViewModel() {
}