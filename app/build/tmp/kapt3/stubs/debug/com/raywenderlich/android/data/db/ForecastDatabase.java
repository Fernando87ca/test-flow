package com.raywenderlich.android.data.db;

import java.lang.System;

@androidx.room.Database(entities = {com.raywenderlich.android.data.db.entities.DbLocationDetails.class, com.raywenderlich.android.data.db.entities.DbForecast.class}, version = 1)
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u00a8\u0006\u0006"}, d2 = {"Lcom/raywenderlich/android/data/db/ForecastDatabase;", "Landroidx/room/RoomDatabase;", "()V", "forecastDao", "Lcom/raywenderlich/android/data/db/dao/ForecastDao;", "Companion", "app_debug"})
public abstract class ForecastDatabase extends androidx.room.RoomDatabase {
    public static final com.raywenderlich.android.data.db.ForecastDatabase.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.raywenderlich.android.data.db.dao.ForecastDao forecastDao();
    
    public ForecastDatabase() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/raywenderlich/android/data/db/ForecastDatabase$Companion;", "", "()V", "create", "Lcom/raywenderlich/android/data/db/ForecastDatabase;", "context", "Landroid/content/Context;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.raywenderlich.android.data.db.ForecastDatabase create(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}