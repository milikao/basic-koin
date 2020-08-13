package com.welton.basickoin

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_login.*
import org.koin.androidx.viewmodel.ext.android.viewModel
import org.koin.core.parameter.parametersOf
import org.koin.java.KoinJavaComponent.getKoin

class LoginActivity : AppCompatActivity() {

    private val loginViewModel: LoginViewModel by viewModel()
    var id: Int = 0
    var name = ""
    val parametersViewModel: ParametersViewModel by viewModel { parametersOf(id, name) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        id = 10
        name = "koin"
//        parametersViewModel = getViewModel { parametersOf(id, name) }
        setContentView(R.layout.activity_login)
        setSupportActionBar(toolbar)
        fabLeft.setOnClickListener { view ->
                        Snackbar.make(view, loginViewModel.toString(), Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()

//            Snackbar.make(view, parametersViewModel.name, Snackbar.LENGTH_LONG)
//                .setAction("Action", null).show()


            supportFragmentManager.beginTransaction()
                .replace(R.id.container, LoginPasswordFragment())
                .commit()
        }

        fabRight.setOnClickListener { view ->
                        Snackbar.make(view, parametersViewModel.id.toString(), Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()

//            Snackbar.make(view, loginViewModel.toString(), Snackbar.LENGTH_LONG)
//                .setAction("Action", null).show()


            supportFragmentManager.beginTransaction()
                .replace(R.id.container, LoginUsernameFragment())
                .commit()
        }
    }

}
