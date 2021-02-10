package com.lukieoo.akademiaandroida.features.episodes.domain.model

import com.google.gson.annotations.SerializedName

data class Episode(
    val airDate: String,
    val characters: List<Any>,
    val episode: String,
    val id: Int,
    val name: String,
    val url: String
)