package com.lukieoo.akademiaandroida.features.data.remote.model


import com.google.gson.annotations.SerializedName
import com.lukieoo.akademiaandroida.features.data.episodes.domain.model.Origin

data class OriginRemote(
    @SerializedName("name") val name: String,
    @SerializedName("url") val url: String
){
    fun toOrigin() = Origin(name, url)
}