package com.lukieoo.akademiaandroida.features.data.characters.domain

import com.lukieoo.akademiaandroida.features.data.characters.CharactersRepository
import com.lukieoo.akademiaandroida.features.data.episodes.EpisodesRepository
import com.lukieoo.akademiaandroida.features.data.episodes.domain.model.GetEpisodesUseCase
import io.mockk.coVerify
import io.mockk.mockk
import kotlinx.coroutines.GlobalScope
import org.junit.Test
import org.junit.jupiter.api.Assertions.*

internal class GetCharactersUseCaseTest{
    @Test
    fun `when use case is invoked than execute getCharacters method from repository`() {
        //given
        val repository = mockk<CharactersRepository>(relaxed = true)
        val useCase = GetCharactersUseCase(repository)
        //when
        useCase(
            params = Unit,
            scope = GlobalScope
        )
        //then
        coVerify {
            repository.getCharacters()
        }
    }
}