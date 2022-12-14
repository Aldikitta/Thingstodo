package com.aldikitta.thingstodo.features.localized.setting.data

import com.aldikitta.thingstodo.foundation.datasource.preferences.PreferenceManager
import com.aldikitta.thingstodo.model.Language
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class LocalizedSettingEnvironmentRepositoryImpl @Inject constructor(
    private val preferenceManager: PreferenceManager
) :LocalizedSettingEnvironmentRepository {
    override fun getLanguage(): Flow<Language> {
        TODO("Not yet implemented")
    }

    override suspend fun setLanguage(language: Language) {
        TODO("Not yet implemented")
    }
}