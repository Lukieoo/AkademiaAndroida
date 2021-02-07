package com.lukieoo.akademiaandroida.core.di

import androidx.room.Room
import com.lukieoo.akademiaandroida.features.room.RickAndMortyDatabase
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module

val databaseModule = module {
    single {
        Room.databaseBuilder(
            androidContext(),
            RickAndMortyDatabase::class.java, "rick_and_morty.db"
        ).build()
    }
}