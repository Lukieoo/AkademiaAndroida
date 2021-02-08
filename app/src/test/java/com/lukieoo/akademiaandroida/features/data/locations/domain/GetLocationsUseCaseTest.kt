package com.lukieoo.akademiaandroida.features.data.locations.domain

import com.lukieoo.akademiaandroida.features.data.episodes.EpisodesRepository
import com.lukieoo.akademiaandroida.features.data.episodes.domain.model.GetEpisodesUseCase
import com.lukieoo.akademiaandroida.features.data.locations.LocationsRepository
import io.mockk.coVerify
import io.mockk.mockk
import kotlinx.coroutines.GlobalScope
import org.junit.Test
import org.junit.jupiter.api.Assertions.*

internal class GetLocationsUseCaseTest {
    @Test
    fun `when use case is invoked than execute getLocations method from repository`() {
        //given
        val repository = mockk<LocationsRepository>(relaxed = true)
        val useCase = GetLocationsUseCase(repository)
        //when
        useCase(
            params = Unit,
            scope = GlobalScope
        )
        //then
        coVerify {
            repository.getLocations()
        }
    }
}