package com.lukieoo.akademiaandroida.features.data.episodes.presentation.model

import com.lukieoo.akademiaandroida.features.data.episodes.domain.model.Episode

data class EpisodeDisplayable(
    val airDate: String,
    val characters: List<Any>,
    val episode: String,
    val id: Int,
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
}