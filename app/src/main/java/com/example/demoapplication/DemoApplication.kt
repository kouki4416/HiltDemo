package com.example.demoapplication

import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class DemoApplication : android.app.Application(){
    override fun onCreate() {
        super.onCreate()
    }
}