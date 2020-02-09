package com.crowleysimon.cache

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.crowleysimon.cache.dao.PokemonDao
import com.crowleysimon.cache.model.AbilitiesConverter
import com.crowleysimon.cache.model.CachedAbilityConverter
import com.crowleysimon.cache.model.CachedItemConverter
import com.crowleysimon.cache.model.CachedLocationAreaConverter
import com.crowleysimon.cache.model.CachedMethodConverter
import com.crowleysimon.cache.model.CachedMoveConverter
import com.crowleysimon.cache.model.CachedMoveLearnMethodConverter
import com.crowleysimon.cache.model.CachedPokemon
import com.crowleysimon.cache.model.CachedSpeciesConverter
import com.crowleysimon.cache.model.CachedSpritesConverter
import com.crowleysimon.cache.model.CachedStatConverter
import com.crowleysimon.cache.model.CachedTypeConverter
import com.crowleysimon.cache.model.CachedVersionConverter
import com.crowleysimon.cache.model.CachedVersionGroupConverter
import com.crowleysimon.cache.model.ConditionValuesConverter
import com.crowleysimon.cache.model.FormsItemConverter
import com.crowleysimon.cache.model.GameIndicesItemConverter
import com.crowleysimon.cache.model.HeldItemsConverter
import com.crowleysimon.cache.model.LocationAreaEncountersTypeConverter
import com.crowleysimon.cache.model.MovesItemConverter
import com.crowleysimon.cache.model.StatsItemConverter
import com.crowleysimon.cache.model.TypesItemConverter
import com.crowleysimon.cache.model.VersionDetailsItemConverter
import com.crowleysimon.cache.model.VersionGroupDetailsItemConverter

@Database(
  version = 1,
  entities = [
    CachedPokemon::class
  ]
)
@TypeConverters(
  LocationAreaEncountersTypeConverter::class,
  TypesItemConverter::class,
  HeldItemsConverter::class,
  AbilitiesConverter::class,
  GameIndicesItemConverter::class,
  StatsItemConverter::class,
  MovesItemConverter::class,
  FormsItemConverter::class,
  ConditionValuesConverter::class,
  VersionDetailsItemConverter::class,
  VersionGroupDetailsItemConverter::class,
  CachedSpritesConverter::class,
  CachedSpeciesConverter::class,
  CachedAbilityConverter::class,
  CachedMethodConverter::class,
  CachedVersionConverter::class,
  CachedItemConverter::class,
  CachedLocationAreaConverter::class,
  CachedMoveConverter::class,
  CachedStatConverter::class,
  CachedTypeConverter::class,
  CachedVersionGroupConverter::class,
  CachedMoveLearnMethodConverter::class
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