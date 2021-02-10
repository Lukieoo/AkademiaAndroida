package com.lukieoo.akademiaandroida.features.episodes

import com.lukieoo.akademiaandroida.features.episodes.domain.model.Episode

interface EpisodesRepository {
    suspend fun getEpisodes(): List<Episode>
}