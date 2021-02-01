package com.lukieoo.akademiaandroida.features.room

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [Episodes::class], version = 1)
abstract class RickAndMortyDatabase : RoomDatabase() {
    abstract fun rickDao(): EpisodesDao
}