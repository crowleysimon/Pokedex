package com.crowleysimon.remote.model.pokemon

import com.squareup.moshi.Json

data class Sprites(
    @Json(name = "back_shiny_female")
    val backShinyFemale: String = "",
    @Json(name = "back_female")
    val backFemale: String = "",
    @Json(name = "back_default")
    val backDefault: String = "",
    @Json(name = "front_shiny_female")
    val frontShinyFemale: String = "",
    @Json(name = "front_default")
    val frontDefault: String = "",
    @Json(name = "front_female")
    val frontFemale: String = "",
    @Json(name = "back_shiny")
    val backShiny: String = "",
    @Json(name = "front_shiny")
    val frontShiny: String = ""
)