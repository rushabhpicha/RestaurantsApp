package com.tps.challenge.dagger

import android.app.Application
import com.example.technicalchallenge1.TCApplication
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
class AppModule constructor(private val application: TCApplication)
