package com.lukieoo.akademiaandroida.core.api

import com.lukieoo.akademiaandroida.core.api.model.EpisodeResponse
import retrofit2.http.GET

interface RickAndMortyApi {
    @GET("episodes")
    suspend fun getEpisodes(): EpisodeResponse
}