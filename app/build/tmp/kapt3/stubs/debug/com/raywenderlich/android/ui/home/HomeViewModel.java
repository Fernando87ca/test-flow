package com.raywenderlich.android.ui.home;

import java.lang.System;

@kotlinx.coroutines.ExperimentalCoroutinesApi()
@kotlinx.coroutines.FlowPreview()
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fJ\u001f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0013\u001a\u00020\tH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0015"}, d2 = {"Lcom/raywenderlich/android/ui/home/HomeViewModel;", "Landroidx/lifecycle/ViewModel;", "weatherRepository", "Lcom/raywenderlich/android/domain/repository/WeatherRepository;", "homeViewStateMapper", "Lcom/raywenderlich/android/ui/home/mapper/HomeViewStateMapper;", "(Lcom/raywenderlich/android/domain/repository/WeatherRepository;Lcom/raywenderlich/android/ui/home/mapper/HomeViewStateMapper;)V", "queryChannel", "Lkotlinx/coroutines/channels/BroadcastChannel;", "", "getQueryChannel", "()Lkotlinx/coroutines/channels/BroadcastChannel;", "fetchLocationDetails", "", "cityId", "", "getLocations", "", "Lcom/raywenderlich/android/ui/home/LocationViewState;", "query", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class HomeViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.channels.BroadcastChannel<java.lang.String> queryChannel = null;
    private final com.raywenderlich.android.domain.repository.WeatherRepository weatherRepository = null;
    private final com.raywenderlich.android.ui.home.mapper.HomeViewStateMapper homeViewStateMapper = null;
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.channels.BroadcastChannel<java.lang.String> getQueryChannel() {
        return null;
    }
    
    public final void fetchLocationDetails(int cityId) {
    }
    
    public HomeViewModel(@org.jetbrains.annotations.NotNull()
    com.raywenderlich.android.domain.repository.WeatherRepository weatherRepository, @org.jetbrains.annotations.NotNull()
    com.raywenderlich.android.ui.home.mapper.HomeViewStateMapper homeViewStateMapper) {
        super();
    }
}