package com.loc.newsapp.di

import android.app.Application
import com.loc.newsapp.Data.manager.LocalUserManagerimple
import com.loc.newsapp.domain.manager.LocalUserManager
import com.loc.newsapp.domain.manager.usecase.AppEntryUseCases
import com.loc.newsapp.domain.manager.usecase.ReadAppEntry
import com.loc.newsapp.domain.manager.usecase.SaveAppEntry
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import java.lang.Appendable
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

fun provideLocalUserManager(application: Application):LocalUserManager = LocalUserManagerimple(application)



@Provides
@Singleton
fun provideAppEntryUseCases(localUserManager: LocalUserManager) =AppEntryUseCases(readAppEntry = ReadAppEntry(localUserManager),
    saveAppEntry = SaveAppEntry(localUserManager)
)


}