package com.crowleysimon.remote.model.pokemon

import com.squareup.moshi.Json

data class StatsItem(
    @Json(name = "stat")
    val stat: Stat,
    @Json(name = "base_stat")
    val baseStat: Int = 0,
    @Json(name = "effort")
    val effort: Int = 0
)