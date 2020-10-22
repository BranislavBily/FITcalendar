package com.branislavbily.fitcalendar.di

import com.branislavbily.fitcalendar.viewModel.LoginFragmentViewModel
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {
    viewModel {
        LoginFragmentViewModel()
    }
}