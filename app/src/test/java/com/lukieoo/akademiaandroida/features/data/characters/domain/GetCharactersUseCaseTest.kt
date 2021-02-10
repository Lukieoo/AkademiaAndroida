package com.lukieoo.akademiaandroida.features.data.characters.domain

import com.lukieoo.akademiaandroida.features.characters.CharactersRepository
import com.lukieoo.akademiaandroida.features.characters.domain.GetCharactersUseCase
import io.mockk.coVerify
import io.mockk.mockk
import kotlinx.coroutines.GlobalScope
import org.junit.Test

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