package com.lukieoo.akademiaandroida.core.app

import android.app.Application
import com.lukieoo.akademiaandroida.core.di.koinInjector
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class App :Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin()
    }

    private fun startKoin() {
         startKoin {
             androidContext(this@App)
             modules(koinInjector)
         }
    }
}