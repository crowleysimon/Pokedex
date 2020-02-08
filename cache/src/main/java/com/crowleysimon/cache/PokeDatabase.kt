package com.crowleysimon.cache

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.crowleysimon.cache.dao.PokemonDao
import com.crowleysimon.cache.model.CachedPokemon

@Database(
  version = 1,
  entities = [
    CachedPokemon::class
  ]
)
abstract class PokeDatabase : RoomDatabase() {

  abstract fun pokeDao(): PokemonDao

  companion object {
    @Volatile
    private var INSTANCE: PokeDatabase? = null

    fun getInstance(context: Context): PokeDatabase {
      return INSTANCE ?: synchronized(this) {
        INSTANCE ?: buildDatabase(context).also { INSTANCE = it }
      }
    }

    private fun buildDatabase(context: Context): PokeDatabase {
      return Room.databaseBuilder(
        context.applicationContext,
        PokeDatabase::class.java,
        "poke-database"
      )
        .fallbackToDestructiveMigration()
        .build()
    }
  }
}