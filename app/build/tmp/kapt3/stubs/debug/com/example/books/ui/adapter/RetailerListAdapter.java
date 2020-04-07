package com.example.books.ui.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00132\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0002\u0013\u0014B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\u0002\u0010\u0006J\b\u0010\t\u001a\u00020\nH\u0016J\u001c\u0010\u000b\u001a\u00020\f2\n\u0010\r\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u000e\u001a\u00020\nH\u0016J\u001c\u0010\u000f\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\nH\u0016R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u0015"}, d2 = {"Lcom/example/books/ui/adapter/RetailerListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/books/ui/adapter/RetailerListAdapter$RetailVH;", "retailer", "", "Lcom/example/books/model/Retailer;", "(Ljava/util/List;)V", "getRetailer", "()Ljava/util/List;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "Companion", "RetailVH", "app_debug"})
public final class RetailerListAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.books.ui.adapter.RetailerListAdapter.RetailVH> {
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.example.books.model.Retailer> retailer = null;
    public static final com.example.books.ui.adapter.RetailerListAdapter.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.books.ui.adapter.RetailerListAdapter.RetailVH onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.books.ui.adapter.RetailerListAdapter.RetailVH holder, int position) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.books.model.Retailer> getRetailer() {
        return null;
    }
    
    public RetailerListAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.books.model.Retailer> retailer) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f\u00a8\u0006\u000f"}, d2 = {"Lcom/example/books/ui/adapter/RetailerListAdapter$RetailVH;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "parent", "Landroid/view/View;", "(Lcom/example/books/ui/adapter/RetailerListAdapter;Landroid/view/View;)V", "logo", "Landroid/widget/ImageView;", "getLogo", "()Landroid/widget/ImageView;", "price", "Landroid/widget/TextView;", "getPrice", "()Landroid/widget/TextView;", "retailerName", "getRetailerName", "app_debug"})
    public final class RetailVH extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView retailerName = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView price = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.ImageView logo = null;
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getRetailerName() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getPrice() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.ImageView getLogo() {
            return null;
        }
        
        public RetailVH(@org.jetbrains.annotations.NotNull()
        android.view.View parent) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b\u00a8\u0006\t"}, d2 = {"Lcom/example/books/ui/adapter/RetailerListAdapter$Companion;", "", "()V", "imageSwitch", "", "s", "", "logo", "Landroid/widget/ImageView;", "app_debug"})
    public static final class Companion {
        
        public final void imageSwitch(@org.jetbrains.annotations.NotNull()
        java.lang.String s, @org.jetbrains.annotations.NotNull()
        android.widget.ImageView logo) {
        }
        
        private Companion() {
            super();
        }
    }
}