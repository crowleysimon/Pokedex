package com.crowleysimon.remote.model.pokemon

import com.squareup.moshi.Json

data class PokemonResponse(
    @Json(name = "location_area_encounters")
    val locationAreaEncounters: List<LocationAreaEncountersItem> = emptyList(),
    @Json(name = "types")
    val types: List<TypesItem> = emptyList(),
    @Json(name = "base_experience")
    val baseExperience: Int = 0,
    @Json(name = "held_items")
    val heldItems: List<HeldItemsItem> = emptyList(),
    @Json(name = "weight")
    val weight: Int = 0,
    @Json(name = "is_default")
    val isDefault: Boolean = false,
    @Json(name = "sprites")
    val sprites: Sprites,
    @Json(name = "abilities")
    val abilities: List<AbilitiesItem> = emptyList(),
    @Json(name = "game_indices")
    val gameIndices: List<GameIndicesItem> = emptyList(),
    @Json(name = "species")
    val species: Species,
    @Json(name = "stats")
    val stats: List<StatsItem> = emptyList(),
    @Json(name = "moves")
    val moves: List<MovesItem> = emptyList(),
    @Json(name = "name")
    val name: String = "",
    @Json(name = "id")
    val id: Int = 0,
    @Json(name = "forms")
    val forms: List<FormsItem> = emptyList(),
    @Json(name = "height")
    val height: Int = 0,
    @Json(name = "order")
    val order: Int = 0
)