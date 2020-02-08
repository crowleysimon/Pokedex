package com.crowleysimon.presentation.injection

import androidx.room.Room
import com.crowleysimon.cache.PokeDatabase
import com.crowleysimon.presentation.BuildConfig
import com.crowleysimon.remote.PokemonServiceFactory
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module

val applicationModule = module(override = true) {

  factory { PokemonServiceFactory.makePokemonService(BuildConfig.DEBUG) }

  single {
    Room.databaseBuilder(androidContext(), PokeDatabase::class.java, "poke-database.db").build()
  }

  factory { get<PokeDatabase>().pokeDao() }

}