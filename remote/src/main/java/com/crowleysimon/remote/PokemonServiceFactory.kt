package com.crowleysimon.remote

import com.squareup.moshi.Moshi
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import okhttp3.logging.HttpLoggingInterceptor.Level.BODY
import okhttp3.logging.HttpLoggingInterceptor.Level.NONE
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import java.util.concurrent.TimeUnit.SECONDS

object PokemonServiceFactory {

  fun makePokemonService(isDebug: Boolean): PokemonService {
    return makePokemonService(makeOkHttpClient(makeLoggingInterceptor(isDebug)), makeMoshi())
  }

  private fun makePokemonService(okHttpClient: OkHttpClient, moshi: Moshi): PokemonService {
    val retrofit = Retrofit.Builder()
      .baseUrl("https://pokeapi.co/api/v2/")
      .client(okHttpClient)
      .addConverterFactory(MoshiConverterFactory.create(moshi))
      .build()
    return retrofit.create(PokemonService::class.java)
  }

  private fun makeOkHttpClient(httpLoggingInterceptor: HttpLoggingInterceptor): OkHttpClient {
    return OkHttpClient.Builder()
      .addInterceptor(httpLoggingInterceptor)
      .connectTimeout(120, SECONDS)
      .readTimeout(120, SECONDS)
      .build()
  }

  private fun makeMoshi() = Moshi.Builder().build()

  private fun makeLoggingInterceptor(isDebug: Boolean): HttpLoggingInterceptor {
    return HttpLoggingInterceptor().apply { level = if (isDebug) BODY else NONE }
  }

}