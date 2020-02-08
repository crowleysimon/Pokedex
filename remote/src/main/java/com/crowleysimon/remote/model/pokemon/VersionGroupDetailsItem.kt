package com.crowleysimon.remote.model.pokemon

import com.squareup.moshi.Json

data class VersionGroupDetailsItem(
    @Json(name = "level_learned_at")
    val levelLearnedAt: Int = 0,
    @Json(name = "version_group")
    val versionGroup: VersionGroup,
    @Json(name = "move_learn_method")
    val moveLearnMethod: MoveLearnMethod
)