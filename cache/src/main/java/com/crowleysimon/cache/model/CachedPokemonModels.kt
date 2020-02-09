package com.crowleysimon.cache.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class CachedPokemon(
    val locationAreaEncounters: List<CachedLocationAreaEncountersItem> = emptyList(),
    val types: List<CachedTypesItem> = emptyList(),
    val baseExperience: Int = 0,
    val heldItems: List<CachedHeldItems> = emptyList(),
    val weight: Int = 0,
    val isDefault: Boolean = false,
    val sprites: CachedSprites,
    val abilities: List<CachedAbilities> = emptyList(),
    val gameIndices: List<CachedGameIndicesItem> = emptyList(),
    val species: CachedSpecies,
    val stats: List<CachedStatsItem> = emptyList(),
    val moves: List<CachedMovesItem> = emptyList(),
    val name: String = "",
    @PrimaryKey val id: Int = 0,
    val forms: List<CachedFormsItem> = emptyList(),
    val height: Int = 0,
    val order: Int = 0
)

@Entity
data class CachedAbilities(val isHidden: Boolean = false, val slot: Int = 0, val cachedAbility: CachedAbility)

@Entity
data class CachedAbility(val name: String = "", val url: String = "")

@Entity
data class CachedConditionValues(val name: String = "", val url: String = "")

@Entity
data class CachedEncounterDetails(
  val cachedConditionValues: List<CachedConditionValues> = emptyList(),
  val chance: Int = 0,
  val cachedMethod: CachedMethod,
  val maxLevel: Int = 0,
  val minLevel: Int = 0
)

@Entity
data class CachedFormsItem(val name: String = "", val url: String = "")

@Entity
data class CachedGameIndicesItem(val gameIndex: Int = 0, val version: CachedVersion)

@Entity
data class CachedHeldItems(val cachedItem: CachedItem, val versionDetails: List<CachedVersionDetailsItem> = emptyList())

@Entity
data class CachedItem(val name: String = "", val url: String = "")

@Entity
data class CachedLocationArea(val name: String = "", val url: String = "")

@Entity
data class CachedLocationAreaEncountersItem(
  val versionDetails: List<CachedVersionDetailsItem>?,
  val cachedLocationArea: CachedLocationArea
)

@Entity
data class CachedMethod(val name: String = "", val url: String = "")

@Entity
data class CachedMove(val name: String = "", val url: String = "")

@Entity
data class CachedMoveLearnMethod(val name: String = "", val url: String = "")

@Entity
data class CachedMovesItem(
  val cachedVersionGroupDetails: List<CachedVersionGroupDetailsItem> = emptyList(),
  val cachedMove: CachedMove
)

@Entity
data class CachedSpecies(val name: String = "", val url: String = "")

@Entity
data class CachedSprites(
  val backShinyFemale: String = "",
  val backFemale: String = "",
  val backDefault: String = "",
  val frontShinyFemale: String = "",
  val frontDefault: String = "",
  val frontFemale: String = "",
  val backShiny: String = "",
  val frontShiny: String = ""
)

@Entity
data class CachedStat(val name: String = "", val url: String = "")

@Entity
data class CachedStatsItem(val cachedStat: CachedStat, val baseStat: Int = 0, val effort: Int = 0)

@Entity
data class CachedType(val name: String = "", val url: String = "")

@Entity
data class CachedTypesItem(val slot: Int = 0, val cachedType: CachedType)

@Entity
data class CachedVersion(val name: String = "", val url: String = "")

@Entity
data class CachedVersionDetailsItem(val cachedVersion: CachedVersion, val rarity: Int = 0)

@Entity
data class CachedVersionGroup(val name: String = "", val url: String = "")

@Entity
data class CachedVersionGroupDetailsItem(
  val levelLearnedAt: Int = 0,
  val cachedVersionGroup: CachedVersionGroup,
  val cachedMoveLearnMethod: CachedMoveLearnMethod
)