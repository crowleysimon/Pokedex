package com.crowleysimon.remote.model.pokemon

import com.squareup.moshi.Json

data class MovesItem(
    @Json(name = "version_group_details")
    val versionGroupDetails: List<VersionGroupDetailsItem> = emptyList(),
    @Json(name = "move")
    val move: Move
)