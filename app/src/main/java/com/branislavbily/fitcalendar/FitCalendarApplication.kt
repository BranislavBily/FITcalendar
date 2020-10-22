package com.branislavbily.fitcalendar

import android.app.Application
import com.branislavbily.fitcalendar.di.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class FitCalendarApplication: Application() {
    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidLogger()
            androidContext(this@FitCalendarApplication)
            modules(viewModelModule)
        }
    }
}