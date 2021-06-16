package com.raywenderlich.android.data.network.mapper;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&\u00a8\u0006\n"}, d2 = {"Lcom/raywenderlich/android/data/network/mapper/ApiMapper;", "", "mapApiLocationDetailsToDomain", "Lcom/raywenderlich/android/domain/model/LocationDetails;", "apiLocationDetails", "Lcom/raywenderlich/android/data/network/model/ApiLocationDetails;", "mapApiLocationToDomain", "Lcom/raywenderlich/android/domain/model/Location;", "apiLocation", "Lcom/raywenderlich/android/data/network/model/ApiLocation;", "app_debug"})
public abstract interface ApiMapper {
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.raywenderlich.android.domain.model.Location mapApiLocationToDomain(@org.jetbrains.annotations.NotNull()
    com.raywenderlich.android.data.network.model.ApiLocation apiLocation);
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.raywenderlich.android.domain.model.LocationDetails mapApiLocationDetailsToDomain(@org.jetbrains.annotations.NotNull()
    com.raywenderlich.android.data.network.model.ApiLocationDetails apiLocationDetails);
}