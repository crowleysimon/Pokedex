package com.crowleysimon.remote.model.pokemon

import com.squareup.moshi.Json

data class EncounterDetailsItem(
    @Json(name = "condition_values")
    val conditionValues: List<ConditionValuesItem> = emptyList(),
    @Json(name = "chance")
    val chance: Int = 0,
    @Json(name = "method")
    val method: Method,
    @Json(name = "max_level")
    val maxLevel: Int = 0,
    @Json(name = "min_level")
    val minLevel: Int = 0
)