package com.welton.basickoin

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_login.*
import org.koin.androidx.viewmodel.ext.android.viewModel

class LoginActivity : AppCompatActivity() {

    private val loginViewModel : LoginViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        setSupportActionBar(toolbar)
        fabLeft.setOnClickListener { view ->
            Snackbar.make(view, loginViewModel.toString(), Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()


            supportFragmentManager.beginTransaction()
                .replace(R.id.container, LoginPasswordFragment())
                .commit()
        }

        fabRight.setOnClickListener { view ->
            Snackbar.make(view, loginViewModel.toString(), Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()


            supportFragmentManager.beginTransaction()
                .replace(R.id.container, LoginUsernameFragment())
                .commit()
        }
    }

}
