package com.example.demoapplication

import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.components.ActivityRetainedComponent
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ActivityRetainedScoped
import dagger.hilt.android.scopes.ViewModelScoped
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object SingletonModule {

    @Provides
    fun provideFood(): Food = Food()

    @Provides
    fun provideSpoon(): Spoon = Spoon()

    @Provides
    @Singleton
    fun provideSharedFood(spoon: Spoon): SharedFood = SharedFood(spoon)
}

