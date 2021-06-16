package com.raywenderlich.android.ui.home.mapper;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003H&J\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00032\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0003H&\u00a8\u0006\u000b"}, d2 = {"Lcom/raywenderlich/android/ui/home/mapper/HomeViewStateMapper;", "", "mapForecastsToViewState", "", "Lcom/raywenderlich/android/ui/home/ForecastViewState;", "forecasts", "Lcom/raywenderlich/android/domain/model/Forecast;", "mapLocationsToViewState", "Lcom/raywenderlich/android/ui/home/LocationViewState;", "locations", "Lcom/raywenderlich/android/domain/model/Location;", "app_debug"})
public abstract interface HomeViewStateMapper {
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<com.raywenderlich.android.ui.home.ForecastViewState> mapForecastsToViewState(@org.jetbrains.annotations.NotNull()
    java.util.List<com.raywenderlich.android.domain.model.Forecast> forecasts);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<com.raywenderlich.android.ui.home.LocationViewState> mapLocationsToViewState(@org.jetbrains.annotations.NotNull()
    java.util.List<com.raywenderlich.android.domain.model.Location> locations);
}