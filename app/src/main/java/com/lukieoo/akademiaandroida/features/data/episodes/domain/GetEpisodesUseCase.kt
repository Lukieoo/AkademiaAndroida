package com.lukieoo.akademiaandroida.features.data.episodes.domain.model

import com.lukieoo.akademiaandroida.core.base.UseCase
import com.lukieoo.akademiaandroida.features.data.episodes.EpisodesRepository

class GetEpisodesUseCase(private val episodesRepository: EpisodesRepository) :
    UseCase<List<Episode>, Unit>() {

    override suspend fun action(params: Unit): List<Episode> {
        return episodesRepository.getEpisodes()
    }


}