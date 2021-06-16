package com.raywenderlich.android.data.db.mapper;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004H\u0016J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u001c\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0016J\u0010\u0010\r\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016\u00a8\u0006\u000e"}, d2 = {"Lcom/raywenderlich/android/data/db/mapper/DbMapperImpl;", "Lcom/raywenderlich/android/data/db/mapper/DbMapper;", "()V", "mapDbForecastsToDomain", "", "Lcom/raywenderlich/android/domain/model/Forecast;", "forecasts", "Lcom/raywenderlich/android/data/db/entities/DbForecast;", "mapDbLocationDetailsToDomain", "Lcom/raywenderlich/android/domain/model/LocationDetails;", "locationDetails", "Lcom/raywenderlich/android/data/db/entities/DbLocationDetails;", "mapDomainForecastsToDb", "mapDomainLocationDetailsToDb", "app_debug"})
public final class DbMapperImpl implements com.raywenderlich.android.data.db.mapper.DbMapper {
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.raywenderlich.android.data.db.entities.DbLocationDetails mapDomainLocationDetailsToDb(@org.jetbrains.annotations.NotNull()
    com.raywenderlich.android.domain.model.LocationDetails locationDetails) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.raywenderlich.android.domain.model.LocationDetails mapDbLocationDetailsToDomain(@org.jetbrains.annotations.NotNull()
    com.raywenderlich.android.data.db.entities.DbLocationDetails locationDetails) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<com.raywenderlich.android.data.db.entities.DbForecast> mapDomainForecastsToDb(@org.jetbrains.annotations.NotNull()
    java.util.List<com.raywenderlich.android.domain.model.Forecast> forecasts) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<com.raywenderlich.android.domain.model.Forecast> mapDbForecastsToDomain(@org.jetbrains.annotations.NotNull()
    java.util.List<com.raywenderlich.android.data.db.entities.DbForecast> forecasts) {
        return null;
    }
    
    public DbMapperImpl() {
        super();
    }
}