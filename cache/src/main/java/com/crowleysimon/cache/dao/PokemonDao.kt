package com.crowleysimon.cache.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import com.crowleysimon.cache.model.CachedPokemon

@Dao
interface PokemonDao {

  @Insert(onConflict = OnConflictStrategy.REPLACE)
  fun insert(pokemon: CachedPokemon): Long

  @Insert(onConflict = OnConflictStrategy.REPLACE)
  fun insertAll(pokemon: List<CachedPokemon>): List<Long>

  @Query("SELECT * FROM CachedPokemon ORDER BY id ASC")
  suspend fun getAllPokemon(): List<CachedPokemon>

  @Query("SELECT * FROM CachedPokemon WHERE id = :pokedexIndex")
  suspend fun getPokemon(pokedexIndex: Int): CachedPokemon

  @Delete
  fun delete(pokemon: CachedPokemon)

  @Update
  fun update(pokemon: CachedPokemon)

}