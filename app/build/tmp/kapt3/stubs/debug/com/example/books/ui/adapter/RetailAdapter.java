package com.example.books.ui.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015B\u0015\u0012\u000e\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u00a2\u0006\u0002\u0010\u0006J\b\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\nH\u0016J\u0018\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\nH\u0016J\u0016\u0010\u0013\u001a\u00020\f2\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lcom/example/books/ui/adapter/RetailAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemsC", "", "Lcom/example/books/model/Retailer;", "(Ljava/util/List;)V", "items", "itemsT", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "submitList", "retailerList", "RetailerVH", "app_debug"})
public final class RetailAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<androidx.recyclerview.widget.RecyclerView.ViewHolder> {
    private java.util.List<com.example.books.model.Retailer> items;
    private final java.util.List<com.example.books.model.Retailer> itemsT = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView.ViewHolder holder, int position) {
    }
    
    public final void submitList(@org.jetbrains.annotations.Nullable()
    java.util.List<com.example.books.model.Retailer> retailerList) {
    }
    
    public RetailAdapter(@org.jetbrains.annotations.Nullable()
    java.util.List<com.example.books.model.Retailer> itemsC) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013R\u0019\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0019\u0010\n\u001a\n \u0007*\u0004\u0018\u00010\u000b0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0019\u0010\u000e\u001a\n \u0007*\u0004\u0018\u00010\u000b0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r\u00a8\u0006\u0014"}, d2 = {"Lcom/example/books/ui/adapter/RetailAdapter$RetailerVH;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "item_retailer", "Landroid/view/View;", "(Landroid/view/View;)V", "image", "Landroid/widget/ImageView;", "kotlin.jvm.PlatformType", "getImage", "()Landroid/widget/ImageView;", "price", "Landroid/widget/TextView;", "getPrice", "()Landroid/widget/TextView;", "retaileName", "getRetaileName", "bind", "", "retailer", "Lcom/example/books/model/Retailer;", "app_debug"})
    public static final class RetailerVH extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final android.widget.TextView retaileName = null;
        private final android.widget.TextView price = null;
        private final android.widget.ImageView image = null;
        
        public final android.widget.TextView getRetaileName() {
            return null;
        }
        
        public final android.widget.TextView getPrice() {
            return null;
        }
        
        public final android.widget.ImageView getImage() {
            return null;
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.example.books.model.Retailer retailer) {
        }
        
        public RetailerVH(@org.jetbrains.annotations.NotNull()
        android.view.View item_retailer) {
            super(null);
        }
    }
}