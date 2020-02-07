package com.crowleysimon.data.repository

import com.crowleysimon.data.model.PokemonEntity

interface PokemonCache {

    suspend fun insert(pokemon: PokemonEntity)

    suspend fun insertAll(pokemon: List<PokemonEntity>)

    suspend fun getAllPokemon(): List<PokemonEntity>

    suspend fun getPokemon(pokedexIndex: Int): PokemonEntity

    suspend fun delete(pokemon: PokemonEntity)

    suspend fun update(pokemon: PokemonEntity)
}