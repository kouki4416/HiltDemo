package com.example.demoapplication

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.scopes.ActivityScoped
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(ActivityComponent::class)
object DemoModule {
    @Provides
    @ActivityScoped
    fun activitySharedItem(): ActivitySharedItem = ActivitySharedItem()

    @Provides
    fun activityItem(): ActivityItem = ActivityItem()
}

@Module
@InstallIn(SingletonComponent::class)
object DemoModule2 {
    @Provides
    @Singleton
    fun singletonSharedItem(): SingletonSharedItem = SingletonSharedItem()

    @Provides
    fun singletonItem(): SingletonItem = SingletonItem()
}
