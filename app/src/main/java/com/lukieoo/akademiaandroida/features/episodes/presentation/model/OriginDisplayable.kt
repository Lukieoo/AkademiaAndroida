package com.lukieoo.akademiaandroida.features.episodes.presentation.model

import com.lukieoo.akademiaandroida.features.episodes.domain.model.Origin

data class OriginDisplayable(
    val name: String,
    val url: String
)
{
    constructor(origin: Origin) : this(
        name = origin.name,
        url = origin.url
    )
}