package com.raywenderlich.android.ui.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.raywenderlich.android.domain.repository.WeatherRepository
import com.raywenderlich.android.ui.home.mapper.HomeViewStateMapper
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.FlowPreview
import kotlinx.coroutines.async
import kotlinx.coroutines.channels.BroadcastChannel
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.launch

private const val SEARCH_DELAY_MILLIS = 500L
private const val MIN_QUERY_LENGTH = 2

@FlowPreview
@ExperimentalCoroutinesApi
class HomeViewModel(
    private val weatherRepository: WeatherRepository,
    private val homeViewStateMapper: HomeViewStateMapper
) : ViewModel() {

    val queryChannel = BroadcastChannel<String>(Channel.CONFLATED)

    private suspend fun getLocations(query: String): List<LocationViewState> {
        val locations = viewModelScope.async { weatherRepository.findLocation(query) }

        return homeViewStateMapper.mapLocationsToViewState(locations.await())
    }

    fun fetchLocationDetails(cityId: Int) {
        viewModelScope.launch {
            weatherRepository.fetchLocationDetails(cityId)
        }
    }
}
