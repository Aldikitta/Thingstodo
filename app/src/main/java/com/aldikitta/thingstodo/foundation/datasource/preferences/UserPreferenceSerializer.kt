package com.aldikitta.thingstodo.foundation.datasource.preferences

import androidx.datastore.core.CorruptionException
import androidx.datastore.core.Serializer
import com.aldikitta.thingstodo.foundation.datasource.preferences.model.UserPreference
import java.io.IOException
import java.io.InputStream
import java.io.OutputStream

object UserPreferenceSerializer : Serializer<UserPreference> {

    override val defaultValue: UserPreference = UserPreference(email = "")

    @Suppress("BlockingMethodInNonBlockingContext")
    override suspend fun readFrom(input: InputStream): UserPreference {
        try {
            return UserPreference.ADAPTER.decode(input)
        } catch (exception: IOException) {
            throw CorruptionException("Cannot read proto", exception)
        }
    }

    @Suppress("BlockingMethodInNonBlockingContext")
    override suspend fun writeTo(t: UserPreference, output: OutputStream) {
        UserPreference.ADAPTER.encode(output, t)
    }

}
