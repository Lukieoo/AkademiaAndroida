package com.lukieoo.akademiaandroida.features.data.episodes.domain.model

data class Location(
    val id: Int,
    val name: String,
    val dimension: String,
    val residents: List<String>,
    val type: String,
    val url: String
)