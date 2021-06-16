package com.raywenderlich.android.ui.home;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0017B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\b\u0010\u000b\u001a\u00020\fH\u0016J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\fH\u0016J\u0018\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\fH\u0016J\u0014\u0010\u0015\u001a\u00020\u000e2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\u0016R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/raywenderlich/android/ui/home/ForecastAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/raywenderlich/android/ui/home/ForecastAdapter$ForecastViewHolder;", "layoutInflater", "Landroid/view/LayoutInflater;", "imageLoader", "Lcom/raywenderlich/android/util/image_loader/ImageLoader;", "(Landroid/view/LayoutInflater;Lcom/raywenderlich/android/util/image_loader/ImageLoader;)V", "forecasts", "", "Lcom/raywenderlich/android/ui/home/ForecastViewState;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setData", "", "ForecastViewHolder", "app_debug"})
public final class ForecastAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.raywenderlich.android.ui.home.ForecastAdapter.ForecastViewHolder> {
    private final java.util.List<com.raywenderlich.android.ui.home.ForecastViewState> forecasts = null;
    private final android.view.LayoutInflater layoutInflater = null;
    private final com.raywenderlich.android.util.image_loader.ImageLoader imageLoader = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.raywenderlich.android.ui.home.ForecastAdapter.ForecastViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.raywenderlich.android.ui.home.ForecastAdapter.ForecastViewHolder holder, int position) {
    }
    
    public final void setData(@org.jetbrains.annotations.NotNull()
    java.util.List<com.raywenderlich.android.ui.home.ForecastViewState> forecasts) {
    }
    
    public ForecastAdapter(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater layoutInflater, @org.jetbrains.annotations.NotNull()
    com.raywenderlich.android.util.image_loader.ImageLoader imageLoader) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/raywenderlich/android/ui/home/ForecastAdapter$ForecastViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "imageLoader", "Lcom/raywenderlich/android/util/image_loader/ImageLoader;", "(Landroid/view/View;Lcom/raywenderlich/android/util/image_loader/ImageLoader;)V", "setItem", "", "forecast", "Lcom/raywenderlich/android/ui/home/ForecastViewState;", "app_debug"})
    public static final class ForecastViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final com.raywenderlich.android.util.image_loader.ImageLoader imageLoader = null;
        
        public final void setItem(@org.jetbrains.annotations.NotNull()
        com.raywenderlich.android.ui.home.ForecastViewState forecast) {
        }
        
        public ForecastViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView, @org.jetbrains.annotations.NotNull()
        com.raywenderlich.android.util.image_loader.ImageLoader imageLoader) {
            super(null);
        }
    }
}