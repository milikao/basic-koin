package com.welton.basickoin

import android.widget.Toast
import androidx.fragment.app.Fragment
import org.koin.androidx.viewmodel.ext.android.viewModel

class LoginPasswordFragment : Fragment() {
    private val loginViewModel by viewModel<LoginViewModel>()

    override fun onResume() {
        super.onResume()
        Toast.makeText(context, loginViewModel.toString(), Toast.LENGTH_LONG).show()
    }
}
