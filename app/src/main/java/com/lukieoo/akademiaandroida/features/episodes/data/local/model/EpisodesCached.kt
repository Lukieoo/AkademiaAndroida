package com.lukieoo.akademiaandroida.features.episodes.data.local.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.lukieoo.akademiaandroida.features.episodes.domain.model.Episode

@Entity
data class EpisodesCached(
    @PrimaryKey
    val id: Int,
    val airDate: String,
    val characters: List<Any>,
    val episode: String,
    val name: String,
    val url: String
) {


    constructor(
        episode: Episode
    ) : this(
        id = episode.id,
        characters = episode.characters,
        episode = episode.episode,
        url = episode.url,
        airDate = episode.airDate,
        name = episode.name
    )
    companion object
    fun toEpisode() =
        Episode(
            id = id,
            characters = characters,
            episode = episode,
            url = url,
            airDate = airDate,
            name = name
        )
}