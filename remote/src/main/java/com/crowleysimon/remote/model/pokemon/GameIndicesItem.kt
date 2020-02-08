package com.crowleysimon.remote.model.pokemon

import com.squareup.moshi.Json

data class GameIndicesItem(
    @Json(name = "game_index")
    val gameIndex: Int = 0,
    @Json(name = "version")
    val version: Version
)