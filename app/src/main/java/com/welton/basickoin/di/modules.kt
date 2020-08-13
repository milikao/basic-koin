package com.welton.basickoin.di

import com.welton.basickoin.*
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appModule = module {

    single { RetrofitLoginService() }
    single { UserRepository(get(), get()) }
    factory { UserLocalDataSource() }
    factory { UserRemoteDataSource(get()) }

    viewModel { LoginViewModel(get()) }
    viewModel { (id: Int, name: String) -> ParametersViewModel(id, name, get()) }

}