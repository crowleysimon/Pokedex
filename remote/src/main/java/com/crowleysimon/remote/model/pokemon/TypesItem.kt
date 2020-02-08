package com.crowleysimon.remote.model.pokemon

import com.squareup.moshi.Json

data class TypesItem(
    @Json(name = "slot")
    val slot: Int = 0,
    @Json(name = "type")
    val type: Type
)