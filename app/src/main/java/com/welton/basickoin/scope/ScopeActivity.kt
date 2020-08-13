package com.welton.basickoin.scope

import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import com.welton.basickoin.R

import kotlinx.android.synthetic.main.activity_scope.*
import org.koin.android.ext.android.getKoin
import org.koin.android.ext.android.inject
import org.koin.core.parameter.parametersOf
import org.koin.core.qualifier.named

class ScopeActivity : AppCompatActivity() {
    val ourSession = getKoin().createScope("ourSession", named("session"))
    val userSession : UserSession by ourSession.inject()
    val presenter : Presenter by inject { parametersOf("ourSession") }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_scope)
        setSupportActionBar(toolbar)

        fab.setOnClickListener { view ->
            Snackbar.make(view, presenter.userSession.mySession(), Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }
    }
}
