package com.raywenderlich.android.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ\u0019\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J\u001f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u0015\u001a\u00020\u0016H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0017R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0018"}, d2 = {"Lcom/raywenderlich/android/data/WeatherRepositoryImpl;", "Lcom/raywenderlich/android/domain/repository/WeatherRepository;", "weatherApiClient", "Lcom/raywenderlich/android/data/network/client/WeatherApiClient;", "apiMapper", "Lcom/raywenderlich/android/data/network/mapper/ApiMapper;", "backgroundDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "forecastDao", "Lcom/raywenderlich/android/data/db/dao/ForecastDao;", "dbMapper", "Lcom/raywenderlich/android/data/db/mapper/DbMapper;", "(Lcom/raywenderlich/android/data/network/client/WeatherApiClient;Lcom/raywenderlich/android/data/network/mapper/ApiMapper;Lkotlinx/coroutines/CoroutineDispatcher;Lcom/raywenderlich/android/data/db/dao/ForecastDao;Lcom/raywenderlich/android/data/db/mapper/DbMapper;)V", "fetchLocationDetails", "", "id", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "findLocation", "", "Lcom/raywenderlich/android/domain/model/Location;", "location", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class WeatherRepositoryImpl implements com.raywenderlich.android.domain.repository.WeatherRepository {
    private final com.raywenderlich.android.data.network.client.WeatherApiClient weatherApiClient = null;
    private final com.raywenderlich.android.data.network.mapper.ApiMapper apiMapper = null;
    private final kotlinx.coroutines.CoroutineDispatcher backgroundDispatcher = null;
    private final com.raywenderlich.android.data.db.dao.ForecastDao forecastDao = null;
    private final com.raywenderlich.android.data.db.mapper.DbMapper dbMapper = null;
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object findLocation(@org.jetbrains.annotations.NotNull()
    java.lang.String location, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.raywenderlich.android.domain.model.Location>> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object fetchLocationDetails(int id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    public WeatherRepositoryImpl(@org.jetbrains.annotations.NotNull()
    com.raywenderlich.android.data.network.client.WeatherApiClient weatherApiClient, @org.jetbrains.annotations.NotNull()
    com.raywenderlich.android.data.network.mapper.ApiMapper apiMapper, @org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.CoroutineDispatcher backgroundDispatcher, @org.jetbrains.annotations.NotNull()
    com.raywenderlich.android.data.db.dao.ForecastDao forecastDao, @org.jetbrains.annotations.NotNull()
    com.raywenderlich.android.data.db.mapper.DbMapper dbMapper) {
        super();
    }
}