package com.lukieoo.akademiaandroida.features.episodes.data.repository

import com.lukieoo.akademiaandroida.core.api.RickAndMortyApi
import com.lukieoo.akademiaandroida.core.network.NetworkStateProvider
import com.lukieoo.akademiaandroida.features.episodes.EpisodesRepository
import com.lukieoo.akademiaandroida.features.episodes.data.local.EpisodeDao
import com.lukieoo.akademiaandroida.features.episodes.data.local.model.EpisodesCached
import com.lukieoo.akademiaandroida.features.episodes.domain.model.Episode

class EpisodeRepositoryImpl(
    private val api: RickAndMortyApi,
    private val episodeDao: EpisodeDao,
    private val networkStateProvider: NetworkStateProvider

) : EpisodesRepository {

    override suspend fun getEpisodes(): List<Episode> {
        return if (networkStateProvider.isNetworkAvailable()) {
            getEpisodesFromRemote()
                .also { saveEpisodesToLocal(it) }
        } else {
            getEpisodesFromLocal()
        }
    }
    private suspend fun getEpisodesFromRemote(): List<Episode> {
        return api.getEpisodes()
            .results
            .map { it.toEpisode() }
            .also { saveEpisodesToLocal(it) }
    }

    private suspend fun saveEpisodesToLocal(episodes: List<Episode>) {
        episodes.map { EpisodesCached(it) }
            .toTypedArray()
            .let { episodeDao.saveEpisodes(*it) }
    }

    private suspend fun getEpisodesFromLocal(): List<Episode> {
        return episodeDao.getEpisodes()
            .map { it.toEpisode() }
    }
}