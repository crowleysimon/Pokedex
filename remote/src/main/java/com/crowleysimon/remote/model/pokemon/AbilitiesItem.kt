package com.crowleysimon.remote.model.pokemon

import com.squareup.moshi.Json

data class AbilitiesItem(
  @Json(name = "is_hidden")
  val isHidden: Boolean = false,
  @Json(name = "slot")
  val slot: Int = 0,
  @Json(name = "ability")
  val ability: Ability
)