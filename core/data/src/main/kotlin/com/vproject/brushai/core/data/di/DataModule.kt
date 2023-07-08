package com.vproject.brushai.core.data.di

import com.vproject.brushai.core.data.repository.style.OfflineFirstStyleRepository
import com.vproject.brushai.core.data.repository.style.StyleRepository
import com.vproject.brushai.core.data.repository.userdata.OfflineFirstUserDataRepository
import com.vproject.brushai.core.data.repository.userdata.UserDataRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
interface DataModule {
    @Binds
    fun bindsStyleRepository(
        styleRepository: OfflineFirstStyleRepository,
    ): StyleRepository

    @Binds
    fun bindsUserDataRepository(
        userDataRepository: OfflineFirstUserDataRepository,
    ): UserDataRepository
}