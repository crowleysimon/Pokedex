package com.crowleysimon.presentation

import android.app.Application
import com.crowleysimon.presentation.injection.applicationModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin
import timber.log.Timber

class PokedexApp : Application() {

  override fun onCreate() {
    super.onCreate()
    configureTimber()
    startKoin {
      androidContext(this@PokedexApp)
      modules(applicationModule)
    }
  }

  private fun configureTimber() {
    if (BuildConfig.BUILD_TYPE == "debug") {
      Timber.plant(Timber.DebugTree())
    } else {
      //Timber.plant(ReleaseTree())
    }
  }
}