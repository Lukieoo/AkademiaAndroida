package com.lukieoo.akademiaandroida.features.characters

import com.lukieoo.akademiaandroida.features.episodes.domain.model.Character

interface CharactersRepository {
    suspend fun getCharacters(): List<Character>
}