package com.example.sharedprefexpo.di.module

import android.content.Context
import com.example.sharedprefexpo.preferences.AppPreferences
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class PreferenceModule {

    @Provides
    @Singleton
    fun getPreferenceManager(context: Context) = AppPreferences(context)
}
