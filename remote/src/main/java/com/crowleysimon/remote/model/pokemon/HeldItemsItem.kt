package com.crowleysimon.remote.model.pokemon

import com.squareup.moshi.Json

data class HeldItemsItem(
    @Json(name = "item")
    val item: Item,
    @Json(name = "version_details")
    val versionDetails: List<VersionDetailsItem> = emptyList()
)