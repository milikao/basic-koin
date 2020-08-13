package com.welton.basickoin

import android.widget.Toast
import androidx.fragment.app.Fragment
import org.koin.androidx.viewmodel.ext.android.sharedViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel

class LoginPasswordFragment : Fragment() {
    private val loginViewModel by viewModel<LoginViewModel>()
    private val parametersViewModel by sharedViewModel<ParametersViewModel>()
    override fun onResume() {
        super.onResume()
        Toast.makeText(context, loginViewModel.logged(), Toast.LENGTH_LONG).show()
    }
}
