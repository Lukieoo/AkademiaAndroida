package com.lukieoo.akademiaandroida.features.locations

import com.lukieoo.akademiaandroida.features.episodes.domain.model.Character
import com.lukieoo.akademiaandroida.features.episodes.domain.model.Location

interface LocationsRepository {
    suspend fun getLocations(): List<Location>
}