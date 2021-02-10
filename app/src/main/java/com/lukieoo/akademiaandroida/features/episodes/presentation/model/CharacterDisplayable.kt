package com.lukieoo.akademiaandroida.features.episodes.presentation.model

import com.lukieoo.akademiaandroida.features.episodes.domain.model.Character

data class CharacterDisplayable(
    val episode: List<String>,
    val gender: String,
    val id: Int,
    val image: String,
    val location: LocationDisplayable,
    val name: String,
    val origin: OriginDisplayable,
    val species: String,
    val status: String,
    val type: String,
    val url: String
) {
    constructor(character: Character): this(
        episode = character.episode,
        gender = character.gender,
        id = character.id,
        image = character.image,
        location = LocationDisplayable(
            character.location
        ),
        name = character.name,
        origin = OriginDisplayable(
            character.origin
        ),
        species = character.species,
        status = character.status,
        type = character.type,
        url = character.url
    )
}