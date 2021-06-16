package com.raywenderlich.android.domain.repository

import com.raywenderlich.android.domain.model.Location

interface WeatherRepository {

    suspend fun findLocation(location: String): List<Location>

    suspend fun fetchLocationDetails(id: Int)
}