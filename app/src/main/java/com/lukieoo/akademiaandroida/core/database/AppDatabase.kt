package com.lukieoo.akademiaandroida.core.database

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.lukieoo.akademiaandroida.features.episodes.data.local.model.EpisodesCached
import com.lukieoo.akademiaandroida.features.episodes.data.local.EpisodeDao

@Database(entities = [EpisodesCached::class], version = 1)
@TypeConverters(ListConverter::class)
abstract class AppDatabase : RoomDatabase() {
    abstract fun episodeDao(): EpisodeDao
}