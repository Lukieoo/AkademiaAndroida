package com.lukieoo.akademiaandroida.features.data.episodes

import com.lukieoo.akademiaandroida.features.data.episodes.domain.model.Episode

interface EpisodesRepository {
    suspend fun getEpisodes(): List<Episode>
}