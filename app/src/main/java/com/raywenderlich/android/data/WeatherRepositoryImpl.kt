package com.raywenderlich.android.data

import com.raywenderlich.android.data.db.dao.ForecastDao
import com.raywenderlich.android.data.db.mapper.DbMapper
import com.raywenderlich.android.data.network.client.WeatherApiClient
import com.raywenderlich.android.data.network.mapper.ApiMapper
import com.raywenderlich.android.domain.model.Location
import com.raywenderlich.android.domain.repository.WeatherRepository
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.withContext

class WeatherRepositoryImpl(
    private val weatherApiClient: WeatherApiClient,
    private val forecastDao: ForecastDao,
    private val apiMapper: ApiMapper,
    private val dbMapper: DbMapper,
    private val backgroundDispatcher: CoroutineDispatcher
) : WeatherRepository {

    override suspend fun findLocation(location: String) = withContext(backgroundDispatcher) {
        try {
            weatherApiClient.findLocation(location)
                .map(apiMapper::mapApiLocationToDomain)
        } catch (error: Throwable) {
            emptyList<Location>()
        }
    }

    override suspend fun fetchLocationDetails(id: Int) = withContext(backgroundDispatcher) {
        val locationDetails = try {
            apiMapper.mapApiLocationDetailsToDomain(
                weatherApiClient.getLocationDetails(id)
            )
        } catch (error: Throwable) {
            null
        }

        if (locationDetails != null) {
            forecastDao.updateLocationDetails(dbMapper.mapDomainLocationDetailsToDb(locationDetails))
            forecastDao.updateForecasts(dbMapper.mapDomainForecastsToDb(locationDetails.forecasts))
        }
    }
}