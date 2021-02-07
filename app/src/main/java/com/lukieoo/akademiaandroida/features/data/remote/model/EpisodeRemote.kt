package com.lukieoo.akademiaandroida.features.data.remote.model


import com.google.gson.annotations.SerializedName
import com.lukieoo.akademiaandroida.features.data.episodes.domain.model.Episode

data class EpisodeRemote(
    @SerializedName("air_date") val airDate: String,
    @SerializedName("characters") val characters: List<Any>,
    @SerializedName("episode") val episode: String,
    @SerializedName("id") val id: Int,
    @SerializedName("name") val name: String,
    @SerializedName("url") val url: String
) {
    fun toEpisode() = Episode(
        id = id,
        characters = characters,
        episode = episode,
        url = url,
        airDate = airDate,
        name = name
    )
}