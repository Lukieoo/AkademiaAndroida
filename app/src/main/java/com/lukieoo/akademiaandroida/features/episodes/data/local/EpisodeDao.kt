package com.lukieoo.akademiaandroida.features.episodes.data.local

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.lukieoo.akademiaandroida.features.episodes.data.local.model.EpisodesCached

@Dao
interface EpisodeDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun saveEpisodes(vararg episode: EpisodesCached)

    @Query("SELECT * FROM EpisodesCached")
    suspend fun getEpisodes(): List<EpisodesCached>

}