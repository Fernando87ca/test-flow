package com.raywenderlich.android.data.network.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b!\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0085\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0001\u0010\b\u001a\u00020\u0005\u0012\b\b\u0001\u0010\t\u001a\u00020\n\u0012\b\b\u0001\u0010\u000b\u001a\u00020\n\u0012\b\b\u0001\u0010\f\u001a\u00020\n\u0012\b\b\u0001\u0010\r\u001a\u00020\n\u0012\b\b\u0001\u0010\u000e\u001a\u00020\n\u0012\b\b\u0001\u0010\u000f\u001a\u00020\n\u0012\b\b\u0001\u0010\u0010\u001a\u00020\n\u0012\b\b\u0001\u0010\u0011\u001a\u00020\u0012\u00a2\u0006\u0002\u0010\u0013J\t\u0010%\u001a\u00020\u0003H\u00c6\u0003J\t\u0010&\u001a\u00020\nH\u00c6\u0003J\t\u0010\'\u001a\u00020\nH\u00c6\u0003J\t\u0010(\u001a\u00020\nH\u00c6\u0003J\t\u0010)\u001a\u00020\u0012H\u00c6\u0003J\t\u0010*\u001a\u00020\u0005H\u00c6\u0003J\t\u0010+\u001a\u00020\u0005H\u00c6\u0003J\t\u0010,\u001a\u00020\u0005H\u00c6\u0003J\t\u0010-\u001a\u00020\u0005H\u00c6\u0003J\t\u0010.\u001a\u00020\nH\u00c6\u0003J\t\u0010/\u001a\u00020\nH\u00c6\u0003J\t\u00100\u001a\u00020\nH\u00c6\u0003J\t\u00101\u001a\u00020\nH\u00c6\u0003J\u008b\u0001\u00102\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00052\b\b\u0003\u0010\u0007\u001a\u00020\u00052\b\b\u0003\u0010\b\u001a\u00020\u00052\b\b\u0003\u0010\t\u001a\u00020\n2\b\b\u0003\u0010\u000b\u001a\u00020\n2\b\b\u0003\u0010\f\u001a\u00020\n2\b\b\u0003\u0010\r\u001a\u00020\n2\b\b\u0003\u0010\u000e\u001a\u00020\n2\b\b\u0003\u0010\u000f\u001a\u00020\n2\b\b\u0003\u0010\u0010\u001a\u00020\n2\b\b\u0003\u0010\u0011\u001a\u00020\u0012H\u00c6\u0001J\u0013\u00103\u001a\u0002042\b\u00105\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u00106\u001a\u00020\u0012H\u00d6\u0001J\t\u00107\u001a\u00020\u0005H\u00d6\u0001R\u0011\u0010\u000e\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\b\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u000f\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u000b\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0015R\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0015R\u0011\u0010\u0011\u001a\u00020\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\f\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0015R\u0011\u0010\u0010\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0017R\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0017R\u0011\u0010\u0007\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0017R\u0011\u0010\r\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0015\u00a8\u00068"}, d2 = {"Lcom/raywenderlich/android/data/network/model/ApiForecast;", "", "id", "", "weatherState", "", "weatherStateAbbreviation", "windDirection", "date", "minTemp", "", "maxTemp", "temp", "windSpeed", "airPressure", "humidity", "visibility", "predictability", "", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DDDDDDDI)V", "getAirPressure", "()D", "getDate", "()Ljava/lang/String;", "getHumidity", "getId", "()J", "getMaxTemp", "getMinTemp", "getPredictability", "()I", "getTemp", "getVisibility", "getWeatherState", "getWeatherStateAbbreviation", "getWindDirection", "getWindSpeed", "component1", "component10", "component11", "component12", "component13", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "app_debug"})
public final class ApiForecast {
    private final long id = 0L;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String weatherState = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String weatherStateAbbreviation = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String windDirection = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String date = null;
    private final double minTemp = 0.0;
    private final double maxTemp = 0.0;
    private final double temp = 0.0;
    private final double windSpeed = 0.0;
    private final double airPressure = 0.0;
    private final double humidity = 0.0;
    private final double visibility = 0.0;
    private final int predictability = 0;
    
    public final long getId() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getWeatherState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getWeatherStateAbbreviation() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getWindDirection() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDate() {
        return null;
    }
    
    public final double getMinTemp() {
        return 0.0;
    }
    
    public final double getMaxTemp() {
        return 0.0;
    }
    
    public final double getTemp() {
        return 0.0;
    }
    
    public final double getWindSpeed() {
        return 0.0;
    }
    
    public final double getAirPressure() {
        return 0.0;
    }
    
    public final double getHumidity() {
        return 0.0;
    }
    
    public final double getVisibility() {
        return 0.0;
    }
    
    public final int getPredictability() {
        return 0;
    }
    
    public ApiForecast(long id, @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "weather_state_name")
    java.lang.String weatherState, @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "weather_state_abbr")
    java.lang.String weatherStateAbbreviation, @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "wind_direction_compass")
    java.lang.String windDirection, @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "applicable_date")
    java.lang.String date, @com.squareup.moshi.Json(name = "min_temp")
    double minTemp, @com.squareup.moshi.Json(name = "max_temp")
    double maxTemp, @com.squareup.moshi.Json(name = "the_temp")
    double temp, @com.squareup.moshi.Json(name = "wind_speed")
    double windSpeed, @com.squareup.moshi.Json(name = "air_pressure")
    double airPressure, @com.squareup.moshi.Json(name = "humidity")
    double humidity, @com.squareup.moshi.Json(name = "visibility")
    double visibility, @com.squareup.moshi.Json(name = "predictability")
    int predictability) {
        super();
    }
    
    public final long component1() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component5() {
        return null;
    }
    
    public final double component6() {
        return 0.0;
    }
    
    public final double component7() {
        return 0.0;
    }
    
    public final double component8() {
        return 0.0;
    }
    
    public final double component9() {
        return 0.0;
    }
    
    public final double component10() {
        return 0.0;
    }
    
    public final double component11() {
        return 0.0;
    }
    
    public final double component12() {
        return 0.0;
    }
    
    public final int component13() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.raywenderlich.android.data.network.model.ApiForecast copy(long id, @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "weather_state_name")
    java.lang.String weatherState, @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "weather_state_abbr")
    java.lang.String weatherStateAbbreviation, @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "wind_direction_compass")
    java.lang.String windDirection, @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "applicable_date")
    java.lang.String date, @com.squareup.moshi.Json(name = "min_temp")
    double minTemp, @com.squareup.moshi.Json(name = "max_temp")
    double maxTemp, @com.squareup.moshi.Json(name = "the_temp")
    double temp, @com.squareup.moshi.Json(name = "wind_speed")
    double windSpeed, @com.squareup.moshi.Json(name = "air_pressure")
    double airPressure, @com.squareup.moshi.Json(name = "humidity")
    double humidity, @com.squareup.moshi.Json(name = "visibility")
    double visibility, @com.squareup.moshi.Json(name = "predictability")
    int predictability) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}