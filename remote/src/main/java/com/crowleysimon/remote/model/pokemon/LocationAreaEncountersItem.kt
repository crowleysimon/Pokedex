package com.crowleysimon.remote.model.pokemon

import com.squareup.moshi.Json

data class LocationAreaEncountersItem(
    @Json(name = "version_details")
    val versionDetails: List<VersionDetailsItem>?,
    @Json(name = "location_area")
    val locationArea: LocationArea
)