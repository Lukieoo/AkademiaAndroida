package com.lukieoo.akademiaandroida.features.data.locations

import com.lukieoo.akademiaandroida.features.data.episodes.domain.model.Character
import com.lukieoo.akademiaandroida.features.data.episodes.domain.model.Location

interface LocationsRepository {
    suspend fun getLocations(): List<Location>
}