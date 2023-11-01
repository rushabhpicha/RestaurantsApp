package com.tps.challenge.dagger

import com.example.technicalchallenge1.Constants
import com.google.gson.GsonBuilder
import com.tps.challenge.network.TPSCallService
import com.tps.challenge.network.TPSCoroutineService
import com.tps.challenge.network.TPSRxService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

/**
 * Provides Network communication related instances.
 */
@Module
@InstallIn(SingletonComponent::class)
class NetworkModule {
    @Provides
    fun provideTPSCallService(): TPSCallService {
        val gson = GsonBuilder().create()
        val retrofit = Retrofit.Builder()
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .addConverterFactory(GsonConverterFactory.create(gson))
            .baseUrl(Constants.BASE_URL)
            .build()
        return retrofit.create(TPSCallService::class.java)
    }

    @Provides
    fun provideCoroutineTPSService(): TPSCoroutineService {
        val gson = GsonBuilder().create()
        val retrofit = Retrofit.Builder()
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .addConverterFactory(GsonConverterFactory.create(gson))
            .baseUrl(Constants.BASE_URL)
            .build()
        return retrofit.create(TPSCoroutineService::class.java)
    }

    @Provides
    fun provideRxTPSService(): TPSRxService {
        val gson = GsonBuilder().create()
        val retrofit = Retrofit.Builder()
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .addConverterFactory(GsonConverterFactory.create(gson))
            .baseUrl(Constants.BASE_URL)
            .build()
        return retrofit.create(TPSRxService::class.java)
    }
}
