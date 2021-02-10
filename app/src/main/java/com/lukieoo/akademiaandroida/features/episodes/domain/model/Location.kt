package com.lukieoo.akademiaandroida.features.episodes.domain.model

data class Location(
    val id: Int,
    val name: String,
    val dimension: String,
    val residents: List<String>,
    val type: String,
    val url: String
)