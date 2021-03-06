package com.crowleysimon.cache.model

import androidx.room.TypeConverter
import com.squareup.moshi.JsonAdapter
import com.squareup.moshi.Moshi
import com.squareup.moshi.Types.newParameterizedType

class LocationAreaEncountersTypeConverter {

  companion object {
    private val listMyData by lazy { newParameterizedType(List::class.java, CachedLocationAreaEncountersItem::class.java) }
    private val jsonAdapter: JsonAdapter<List<CachedLocationAreaEncountersItem>> = Moshi.Builder().build().adapter(listMyData)

    @TypeConverter @JvmStatic
    fun stringToLocationAreaEncountersList(data: String) = jsonAdapter.fromJson(data) ?: emptyList()

    @TypeConverter @JvmStatic
    fun locationAreaEncountersListToString(data: List<CachedLocationAreaEncountersItem>) = jsonAdapter.toJson(data) ?: ""

  }

}

class TypesItemConverter {

  companion object {
    private val listMyData by lazy { newParameterizedType(List::class.java, CachedTypesItem::class.java) }
    private val jsonAdapter: JsonAdapter<List<CachedTypesItem>> = Moshi.Builder().build().adapter(listMyData)

    @TypeConverter @JvmStatic
    fun stringToTypesItemList(data: String) = jsonAdapter.fromJson(data) ?: emptyList()

    @TypeConverter @JvmStatic
    fun typesItemListToString(data: List<CachedTypesItem>) = jsonAdapter.toJson(data) ?: ""

  }

}

class HeldItemsConverter {

  companion object {
    private val listMyData by lazy { newParameterizedType(List::class.java, CachedHeldItems::class.java) }
    private val jsonAdapter: JsonAdapter<List<CachedHeldItems>> = Moshi.Builder().build().adapter(listMyData)

    @TypeConverter @JvmStatic
    fun stringToHeldItemsList(data: String) = jsonAdapter.fromJson(data) ?: emptyList()

    @TypeConverter @JvmStatic
    fun heldItemsListToString(data: List<CachedHeldItems>) = jsonAdapter.toJson(data) ?: ""

  }

}

class AbilitiesConverter {

  companion object {
    private val listMyData by lazy { newParameterizedType(List::class.java, CachedAbilities::class.java) }
    private val jsonAdapter: JsonAdapter<List<CachedAbilities>> = Moshi.Builder().build().adapter(listMyData)

    @TypeConverter @JvmStatic
    fun stringToAbilitiesList(data: String) = jsonAdapter.fromJson(data) ?: emptyList()

    @TypeConverter @JvmStatic
    fun abilitiesListToString(data: List<CachedAbilities>) = jsonAdapter.toJson(data) ?: ""

  }

}

class GameIndicesItemConverter {

  companion object {
    private val listMyData by lazy { newParameterizedType(List::class.java, CachedGameIndicesItem::class.java) }
    private val jsonAdapter: JsonAdapter<List<CachedGameIndicesItem>> = Moshi.Builder().build().adapter(listMyData)

    @TypeConverter @JvmStatic
    fun stringToGameIndicesItemList(data: String) = jsonAdapter.fromJson(data) ?: emptyList()

    @TypeConverter @JvmStatic
    fun gameIndicesItemListToString(data: List<CachedGameIndicesItem>) = jsonAdapter.toJson(data) ?: ""

  }

}

class StatsItemConverter {

  companion object {
    private val listMyData by lazy { newParameterizedType(List::class.java, CachedStatsItem::class.java) }
    private val jsonAdapter: JsonAdapter<List<CachedStatsItem>> = Moshi.Builder().build().adapter(listMyData)

    @TypeConverter @JvmStatic
    fun stringToStatsItemList(data: String) = jsonAdapter.fromJson(data) ?: emptyList()

    @TypeConverter @JvmStatic
    fun statsItemListToString(data: List<CachedStatsItem>) = jsonAdapter.toJson(data) ?: ""

  }

}

class MovesItemConverter {

  companion object {
    private val listMyData by lazy { newParameterizedType(List::class.java, CachedMovesItem::class.java) }
    private val jsonAdapter: JsonAdapter<List<CachedMovesItem>> = Moshi.Builder().build().adapter(listMyData)

    @TypeConverter @JvmStatic
    fun stringToMovesItemList(data: String) = jsonAdapter.fromJson(data) ?: emptyList()

    @TypeConverter @JvmStatic
    fun movesItemListToString(data: List<CachedMovesItem>) = jsonAdapter.toJson(data) ?: ""

  }

}

class FormsItemConverter {

  companion object {
    private val listMyData by lazy { newParameterizedType(List::class.java, CachedFormsItem::class.java) }
    private val jsonAdapter: JsonAdapter<List<CachedFormsItem>> = Moshi.Builder().build().adapter(listMyData)

    @TypeConverter @JvmStatic
    fun stringToFormsItemList(data: String) = jsonAdapter.fromJson(data) ?: emptyList()

    @TypeConverter @JvmStatic
    fun formsItemListToString(data: List<CachedFormsItem>) = jsonAdapter.toJson(data) ?: ""

  }

}

class ConditionValuesConverter {

  companion object {
    private val listMyData by lazy { newParameterizedType(List::class.java, CachedConditionValues::class.java) }
    private val jsonAdapter: JsonAdapter<List<CachedConditionValues>> = Moshi.Builder().build().adapter(listMyData)

    @TypeConverter @JvmStatic
    fun stringToConditionValuesList(data: String) = jsonAdapter.fromJson(data) ?: emptyList()

    @TypeConverter @JvmStatic
    fun conditionValuesListToString(data: List<CachedConditionValues>) = jsonAdapter.toJson(data) ?: ""

  }

}

class VersionDetailsItemConverter {

  companion object {
    private val listMyData by lazy { newParameterizedType(List::class.java, CachedVersionDetailsItem::class.java) }
    private val jsonAdapter: JsonAdapter<List<CachedVersionDetailsItem>> = Moshi.Builder().build().adapter(listMyData)

    @TypeConverter @JvmStatic
    fun stringToVersionDetailsItemList(data: String) = jsonAdapter.fromJson(data) ?: emptyList()

    @TypeConverter @JvmStatic
    fun versionDetailsItemListToString(data: List<CachedVersionDetailsItem>) = jsonAdapter.toJson(data) ?: ""

  }

}

class VersionGroupDetailsItemConverter {

  companion object {
    private val listMyData by lazy { newParameterizedType(List::class.java, CachedVersionGroupDetailsItem::class.java) }
    private val jsonAdapter: JsonAdapter<List<CachedVersionGroupDetailsItem>> = Moshi.Builder().build().adapter(listMyData)

    @TypeConverter @JvmStatic
    fun stringToVersionGroupDetailsItemList(data: String) = jsonAdapter.fromJson(data) ?: emptyList()

    @TypeConverter @JvmStatic
    fun versionGroupDetailsItemListToString(data: List<CachedVersionGroupDetailsItem>) = jsonAdapter.toJson(data) ?: ""

  }

}

class CachedSpritesConverter {

  companion object {
    private val jsonAdapter: JsonAdapter<CachedSprites> = Moshi.Builder().build().adapter(CachedSprites::class.java)

    @TypeConverter @JvmStatic
    fun stringToCachedSprites(data: String) = jsonAdapter.fromJson(data)

    @TypeConverter @JvmStatic
    fun cachedSpritesToString(data: CachedSprites) = jsonAdapter.toJson(data) ?: ""

  }

}

class CachedSpeciesConverter {

  companion object {
    private val jsonAdapter: JsonAdapter<CachedSpecies> = Moshi.Builder().build().adapter(CachedSpecies::class.java)

    @TypeConverter @JvmStatic
    fun stringToCachedSpecies(data: String) = jsonAdapter.fromJson(data)

    @TypeConverter @JvmStatic
    fun cachedSpeciesToString(data: CachedSpecies) = jsonAdapter.toJson(data) ?: ""

  }

}

class CachedAbilityConverter {

  companion object {
    private val jsonAdapter: JsonAdapter<CachedAbility> = Moshi.Builder().build().adapter(CachedAbility::class.java)

    @TypeConverter @JvmStatic
    fun stringToCachedAbility(data: String) = jsonAdapter.fromJson(data)

    @TypeConverter @JvmStatic
    fun cachedAbilityToString(data: CachedAbility) = jsonAdapter.toJson(data) ?: ""

  }

}

class CachedMethodConverter {

  companion object {
    private val jsonAdapter: JsonAdapter<CachedMethod> = Moshi.Builder().build().adapter(CachedMethod::class.java)

    @TypeConverter @JvmStatic
    fun stringToCachedMethod(data: String) = jsonAdapter.fromJson(data)

    @TypeConverter @JvmStatic
    fun cachedMethodToString(data: CachedMethod) = jsonAdapter.toJson(data) ?: ""

  }

}

class CachedVersionConverter {

  companion object {
    private val jsonAdapter: JsonAdapter<CachedVersion> = Moshi.Builder().build().adapter(CachedVersion::class.java)

    @TypeConverter @JvmStatic
    fun stringToCachedVersion(data: String) = jsonAdapter.fromJson(data)

    @TypeConverter @JvmStatic
    fun cachedVersionToString(data: CachedVersion) = jsonAdapter.toJson(data) ?: ""

  }

}

class CachedItemConverter {

  companion object {
    private val jsonAdapter: JsonAdapter<CachedItem> = Moshi.Builder().build().adapter(CachedItem::class.java)

    @TypeConverter @JvmStatic
    fun stringToCachedItem(data: String) = jsonAdapter.fromJson(data)

    @TypeConverter @JvmStatic
    fun cachedItemToString(data: CachedItem) = jsonAdapter.toJson(data) ?: ""

  }

}

class CachedLocationAreaConverter {

  companion object {
    private val jsonAdapter: JsonAdapter<CachedLocationArea> = Moshi.Builder().build().adapter(CachedLocationArea::class.java)

    @TypeConverter @JvmStatic
    fun stringToCachedLocationArea(data: String) = jsonAdapter.fromJson(data)

    @TypeConverter @JvmStatic
    fun cachedLocationAreaToString(data: CachedLocationArea) = jsonAdapter.toJson(data) ?: ""

  }

}

class CachedMoveConverter {

  companion object {
    private val jsonAdapter: JsonAdapter<CachedMove> = Moshi.Builder().build().adapter(CachedMove::class.java)

    @TypeConverter @JvmStatic
    fun stringToCachedMove(data: String) = jsonAdapter.fromJson(data)

    @TypeConverter @JvmStatic
    fun cachedMoveToString(data: CachedMove) = jsonAdapter.toJson(data) ?: ""

  }

}

class CachedStatConverter {

  companion object {
    private val jsonAdapter: JsonAdapter<CachedStat> = Moshi.Builder().build().adapter(CachedStat::class.java)

    @TypeConverter @JvmStatic
    fun stringToCachedStat(data: String) = jsonAdapter.fromJson(data)

    @TypeConverter @JvmStatic
    fun cachedStatToString(data: CachedStat) = jsonAdapter.toJson(data) ?: ""

  }

}

class CachedTypeConverter {

  companion object {
    private val jsonAdapter: JsonAdapter<CachedType> = Moshi.Builder().build().adapter(CachedType::class.java)

    @TypeConverter @JvmStatic
    fun stringToCachedType(data: String) = jsonAdapter.fromJson(data)

    @TypeConverter @JvmStatic
    fun cachedTypeToString(data: CachedType) = jsonAdapter.toJson(data) ?: ""

  }

}

class CachedVersionGroupConverter {

  companion object {
    private val jsonAdapter: JsonAdapter<CachedVersionGroup> = Moshi.Builder().build().adapter(CachedVersionGroup::class.java)

    @TypeConverter @JvmStatic
    fun stringToCachedVersionGroup(data: String) = jsonAdapter.fromJson(data)

    @TypeConverter @JvmStatic
    fun cachedVersionGroupToString(data: CachedVersionGroup) = jsonAdapter.toJson(data) ?: ""

  }

}

class CachedMoveLearnMethodConverter {

  companion object {
    private val jsonAdapter: JsonAdapter<CachedMoveLearnMethod> = Moshi.Builder().build().adapter(CachedMoveLearnMethod::class.java)

    @TypeConverter @JvmStatic
    fun stringToCachedMoveLearnMethod(data: String) = jsonAdapter.fromJson(data)

    @TypeConverter @JvmStatic
    fun cachedMoveLearnMethodToString(data: CachedMoveLearnMethod) = jsonAdapter.toJson(data) ?: ""

  }

}