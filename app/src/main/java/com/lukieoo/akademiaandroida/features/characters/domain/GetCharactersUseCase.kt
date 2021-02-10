package com.lukieoo.akademiaandroida.features.characters.domain

import com.lukieoo.akademiaandroida.core.base.UseCase
import com.lukieoo.akademiaandroida.features.characters.CharactersRepository
import com.lukieoo.akademiaandroida.features.episodes.domain.model.Character

class GetCharactersUseCase(private val charactersRepository: CharactersRepository) :
    UseCase<List<Character>, Unit>() {

    override suspend fun action(params: Unit): List<Character> {
        return charactersRepository.getCharacters()
    }


}