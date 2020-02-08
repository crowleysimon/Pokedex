package com.crowleysimon.remote.model.pokemon

import com.squareup.moshi.Json

data class Ability(
  @Json(name = "name")
  val name: String = "",
  @Json(name = "url")
  val url: String = ""
)