package com.crowleysimon.remote.model.pokemon

import com.squareup.moshi.Json

data class VersionDetailsItem(
    @Json(name = "version")
    val version: Version,
    @Json(name = "rarity")
    val rarity: Int = 0
)