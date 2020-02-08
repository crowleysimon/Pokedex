package com.crowleysimon.cache.mapper

import com.crowleysimon.cache.model.CachedPokemon
import com.crowleysimon.data.model.PokemonEntity
import javax.inject.Inject

class CachedPokemonMapper @Inject constructor() : CacheMapper<CachedPokemon, PokemonEntity> {

  override fun mapFromCached(cached: CachedPokemon): PokemonEntity {
    return PokemonEntity(
        title = cached.title,
        link = cached.link,
        pubDate = cached.pubDate,
        description = cached.description,
        image = cached.image,
        read = cached.read,
        feedUrl = cached.feedUrl,
        author = cached.author,
        category = cached.category,
        channel = cached.channel,
        copyright = cached.copyright,
        generator = cached.generator,
        pokedexIndex = cached.pokedexIndex,
        lastBuildDate = cached.lastBuildDate,
        managingEditor = cached.managingEditor,
        ttl = cached.ttl,
        feedTitle = cached.feedTitle
    )
  }

  override fun mapToCached(entity: PokemonEntity): CachedPokemon {
    return CachedPokemon(
        title = entity.title,
        link = entity.link,
        pubDate = entity.pubDate,
        description = entity.description,
        image = entity.image,
        read = entity.read ?: false,
        feedUrl = entity.feedUrl,
        author = entity.author,
        category = entity.category,
        channel = entity.channel,
        copyright = entity.copyright,
        generator = entity.generator,
        pokedexIndex = entity.pokedexIndex,
        lastBuildDate = entity.lastBuildDate,
        managingEditor = entity.managingEditor,
        ttl = entity.ttl,
        feedTitle = entity.feedTitle
    )
  }
}