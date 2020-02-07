package com.crowleysimon.cache.dao

import androidx.room.*
import com.crowleysimon.cache.model.CachedPokemon

@Dao
interface PokemonDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(pokemon: CachedPokemon): Long

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertAll(pokemon: List<CachedPokemon>): List<Long>

    @Query("SELECT * FROM CachedPokemon ORDER BY pokedexIndex ASC")
    suspend fun getAllPokemon(): List<CachedPokemon>

    @Query("SELECT * FROM CachedPokemon WHERE pokedexIndex = :pokedexIndex")
    suspend fun getPokemon(pokedexIndex: Int): CachedPokemon

    @Delete
    fun delete(pokemon: CachedPokemon)

    @Update
    fun update(pokemon: CachedPokemon)

}