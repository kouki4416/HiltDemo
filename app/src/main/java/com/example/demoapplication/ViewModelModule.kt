package com.example.demoapplication

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent

@Module
@InstallIn(ViewModelComponent::class)
object ViewModelModule {
    @Provides
    fun provideViewModelItem(): ViewModelItem = ViewModelItem()

    @Provides
    fun provideViewModelSharedItem(): ViewModelSharedItem = ViewModelSharedItem()
}