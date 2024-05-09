package com.sideprojhub.hub.android.di

import android.app.Application
import com.bumptech.glide.Glide
import com.bumptech.glide.RequestManager
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent


@Module
@InstallIn(SingletonComponent::class)
object GlideModule {

    @Provides
    fun provideGlideInstance(application: Application) : RequestManager = Glide.with(application)

}