package com.welton.basickoin

import android.app.Application
import com.welton.basickoin.di.appModule
import com.welton.basickoin.scope.moduleScopeSession
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class MyApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@MyApplication)
            modules(appModule, moduleScopeSession)
        }


    }
}