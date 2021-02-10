package com.lukieoo.akademiaandroida.mock

import com.lukieoo.akademiaandroida.core.api.model.EpisodeRemote
import com.lukieoo.akademiaandroida.core.api.model.EpisodeResponse
import com.lukieoo.akademiaandroida.core.api.model.ResponseInfo
import com.lukieoo.akademiaandroida.features.episodes.data.local.model.EpisodesCached
import org.jetbrains.annotations.TestOnly

@TestOnly
fun ResponseInfo.Companion.mock() = ResponseInfo(
    count = 10,
    pages = 3,
    next = "Next",
    prev = "String"
)

@TestOnly
fun EpisodeRemote.Companion.mock() = EpisodeRemote(
    id = 1,
    name = "My name",
    airDate = "Somewhere",
    episode = "epsiode code",
    characters = emptyList(),
    url = "url or sth",
)

@TestOnly
fun EpisodesCached.Companion.mock() = EpisodesCached(
    id = 1,
    name = "My name",
    airDate = "Somewhere",
    episode = "epsiode code",
    characters = emptyList(),
    url = "url or sth",
)

fun EpisodeResponse.Companion.mock() = EpisodeResponse(
    info = ResponseInfo.mock(),
    results = listOf(
        EpisodeRemote.mock(),
        EpisodeRemote.mock(),
        EpisodeRemote.mock()
    )
)