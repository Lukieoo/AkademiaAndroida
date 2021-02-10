package com.lukieoo.akademiaandroida.features.locations.domain

import com.lukieoo.akademiaandroida.core.base.UseCase
import com.lukieoo.akademiaandroida.features.episodes.domain.model.Location
import com.lukieoo.akademiaandroida.features.locations.LocationsRepository

class GetLocationsUseCase(private val locationsRepository: LocationsRepository) :
    UseCase<List<Location>, Unit>() {

    override suspend fun action(params: Unit): List<Location> {
        return locationsRepository.getLocations()
    }


}