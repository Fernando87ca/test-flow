package com.raywenderlich.android.data.db.mapper;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003H&J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH&J\u001c\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u0010\u0010\f\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH&\u00a8\u0006\r"}, d2 = {"Lcom/raywenderlich/android/data/db/mapper/DbMapper;", "", "mapDbForecastsToDomain", "", "Lcom/raywenderlich/android/domain/model/Forecast;", "forecasts", "Lcom/raywenderlich/android/data/db/entities/DbForecast;", "mapDbLocationDetailsToDomain", "Lcom/raywenderlich/android/domain/model/LocationDetails;", "locationDetails", "Lcom/raywenderlich/android/data/db/entities/DbLocationDetails;", "mapDomainForecastsToDb", "mapDomainLocationDetailsToDb", "app_debug"})
public abstract interface DbMapper {
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.raywenderlich.android.data.db.entities.DbLocationDetails mapDomainLocationDetailsToDb(@org.jetbrains.annotations.NotNull()
    com.raywenderlich.android.domain.model.LocationDetails locationDetails);
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.raywenderlich.android.domain.model.LocationDetails mapDbLocationDetailsToDomain(@org.jetbrains.annotations.NotNull()
    com.raywenderlich.android.data.db.entities.DbLocationDetails locationDetails);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<com.raywenderlich.android.data.db.entities.DbForecast> mapDomainForecastsToDb(@org.jetbrains.annotations.NotNull()
    java.util.List<com.raywenderlich.android.domain.model.Forecast> forecasts);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<com.raywenderlich.android.domain.model.Forecast> mapDbForecastsToDomain(@org.jetbrains.annotations.NotNull()
    java.util.List<com.raywenderlich.android.data.db.entities.DbForecast> forecasts);
}