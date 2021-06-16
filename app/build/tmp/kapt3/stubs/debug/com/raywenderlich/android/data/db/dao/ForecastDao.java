package com.raywenderlich.android.data.db.dao;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\bg\u0018\u00002\u00020\u0001J\u0011\u0010\u0002\u001a\u00020\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004J\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004J\u001f\u0010\b\u001a\u00020\u00032\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ\u0019\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0007H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ\u001f\u0010\u0010\u001a\u00020\u00032\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0097@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ\u0019\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0007H\u0097@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000f\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0012"}, d2 = {"Lcom/raywenderlich/android/data/db/dao/ForecastDao;", "", "clearForecasts", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "clearLocationDetails", "getLocationDetails", "Lcom/raywenderlich/android/data/db/entities/DbLocationDetails;", "insertAllForecast", "forecasts", "", "Lcom/raywenderlich/android/data/db/entities/DbForecast;", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertLocationDetails", "locationDetails", "(Lcom/raywenderlich/android/data/db/entities/DbLocationDetails;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateForecasts", "updateLocationDetails", "app_debug"})
public abstract interface ForecastDao {
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Transaction()
    public abstract java.lang.Object updateLocationDetails(@org.jetbrains.annotations.NotNull()
    com.raywenderlich.android.data.db.entities.DbLocationDetails locationDetails, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Insert()
    public abstract java.lang.Object insertLocationDetails(@org.jetbrains.annotations.NotNull()
    com.raywenderlich.android.data.db.entities.DbLocationDetails locationDetails, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Transaction()
    public abstract java.lang.Object updateForecasts(@org.jetbrains.annotations.NotNull()
    java.util.List<com.raywenderlich.android.data.db.entities.DbForecast> forecasts, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Insert()
    public abstract java.lang.Object insertAllForecast(@org.jetbrains.annotations.NotNull()
    java.util.List<com.raywenderlich.android.data.db.entities.DbForecast> forecasts, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "DELETE FROM location_details_table")
    public abstract java.lang.Object clearLocationDetails(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p0);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "DELETE FROM forecasts_table")
    public abstract java.lang.Object clearForecasts(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p0);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT * FROM location_details_table")
    public abstract java.lang.Object getLocationDetails(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.raywenderlich.android.data.db.entities.DbLocationDetails> p0);
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 3)
    public final class DefaultImpls {
        
        @org.jetbrains.annotations.Nullable()
        @androidx.room.Transaction()
        public static java.lang.Object updateLocationDetails(com.raywenderlich.android.data.db.dao.ForecastDao $this, @org.jetbrains.annotations.NotNull()
        com.raywenderlich.android.data.db.entities.DbLocationDetails locationDetails, @org.jetbrains.annotations.NotNull()
        kotlin.coroutines.Continuation<? super kotlin.Unit> p2) {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        @androidx.room.Transaction()
        public static java.lang.Object updateForecasts(com.raywenderlich.android.data.db.dao.ForecastDao $this, @org.jetbrains.annotations.NotNull()
        java.util.List<com.raywenderlich.android.data.db.entities.DbForecast> forecasts, @org.jetbrains.annotations.NotNull()
        kotlin.coroutines.Continuation<? super kotlin.Unit> p2) {
            return null;
        }
    }
}