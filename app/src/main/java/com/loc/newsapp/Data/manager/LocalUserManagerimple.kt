package com.loc.newsapp.Data.manager

import android.content.Context
import androidx.compose.ui.tooling.preview.Preview
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.booleanPreferencesKey
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.preferencesDataStore
import com.loc.newsapp.Utils.Constant
import com.loc.newsapp.Utils.Constant.APP_ENTRY
import com.loc.newsapp.Utils.Constant.USER_SETTING
import com.loc.newsapp.domain.manager.LocalUserManager
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

class LocalUserManagerimple(
    private val context: Context


) :LocalUserManager{
    override suspend fun saveAppEntry() {
        TODO("Not yet implemented")
        context.dataStore.edit { settings ->
            settings[PreferencesKeys.APP_ENTRY] = true
        }


    }

    override fun readAppEntry(): Flow<Boolean> {
        TODO("Not yet implemented")
        return context.dataStore.data.map {
            preferences->
            preferences[PreferencesKeys.APP_ENTRY] ?: false
        }
    }


}

private val Context.dataStore:DataStore<Preferences> by preferencesDataStore(name = USER_SETTING)

private object PreferencesKeys{
    val APP_ENTRY = booleanPreferencesKey(name = Constant.APP_ENTRY)
}

