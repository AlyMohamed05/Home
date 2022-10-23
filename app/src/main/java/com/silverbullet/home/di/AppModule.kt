package com.silverbullet.home.di

import android.content.Context
import com.silverbullet.home.bluetooth.BluetoothHandler
import com.silverbullet.home.bluetooth.BluetoothHandlerImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideBluetoothManger(@ApplicationContext context: Context): BluetoothHandler{
        return BluetoothHandlerImpl(context)
    }
}