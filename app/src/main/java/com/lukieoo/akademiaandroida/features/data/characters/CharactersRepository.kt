package com.lukieoo.akademiaandroida.features.data.characters

import com.lukieoo.akademiaandroida.features.data.episodes.domain.model.Character

interface CharactersRepository {
    suspend fun getCharacters(): List<Character>
}