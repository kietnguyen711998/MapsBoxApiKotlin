package com.example.mapsboxapikotlin

import android.app.Application
import com.mapbox.mapboxsdk.Mapbox

class Application : Application() {
    override fun onCreate() {
        super.onCreate()
        Mapbox.getInstance(this, getString(R.string.mapbox_access_token))
    }
}