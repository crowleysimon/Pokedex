package com.crowleysimon.presentation

import android.app.Application
import timber.log.Timber

class PokedexApp : Application() {

  override fun onCreate() {
    super.onCreate()
    configureTimber()
  }

  private fun configureTimber() {
    if (BuildConfig.BUILD_TYPE == "debug") {
      Timber.plant(Timber.DebugTree())
    } else {
      //Timber.plant(ReleaseTree())
    }
  }
}