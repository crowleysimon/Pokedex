package com.crowleysimon.remote

import com.crowleysimon.remote.model.pokemon.PokemonResponse
import retrofit2.http.GET
import retrofit2.http.Path

interface PokemonService {

  @GET("pokemon/{id}") suspend fun getPokemon(@Path("id") id: Int): PokemonResponse

}