package com.branislavbily.fitcalendar.viewModel

import android.util.Log
import com.branislavbily.fitcalendar.dataBinding.rxjava.LifecycleViewModel

class LoginFragmentViewModel: LifecycleViewModel() {

    fun logIn() {
        Log.i("Ide", "Funguje")
    }
}