package com.lukieoo.akademiaandroida.core.di

import androidx.room.Room
import com.lukieoo.akademiaandroida.core.database.AppDatabase
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module

val databaseModule = module {
    single {
        Room.databaseBuilder(
            androidContext(),
            AppDatabase::class.java, "appDatabase.db"
        ).build()
    }

    single {
        get<AppDatabase>().episodeDao()
    }
}