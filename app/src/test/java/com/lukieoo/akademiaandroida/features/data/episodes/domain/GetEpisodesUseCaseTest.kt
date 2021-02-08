package com.lukieoo.akademiaandroida.features.data.episodes.domain

import com.lukieoo.akademiaandroida.features.data.episodes.EpisodesRepository
import com.lukieoo.akademiaandroida.features.data.episodes.domain.model.GetEpisodesUseCase
import io.mockk.coVerify
import io.mockk.mockk
import kotlinx.coroutines.GlobalScope
import org.junit.Test
import org.junit.jupiter.api.Assertions.*

internal class GetEpisodesUseCaseTest {

    @Test
    fun `when use case is invoked than execute getEpisodes method from repository`() {
        //given
        val repository = mockk<EpisodesRepository>(relaxed = true)
        val useCase = GetEpisodesUseCase(repository)
        //when
        useCase(
            params = Unit,
            scope = GlobalScope
        )
        //then
        coVerify {
            repository.getEpisodes()
        }
    }
}