package com.example.books.ui.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u000eB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rR\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00078F\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\t\u00a8\u0006\u000f"}, d2 = {"Lcom/example/books/ui/viewmodel/RetailerViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "_state", "Landroidx/lifecycle/MutableLiveData;", "Lcom/example/books/ui/viewmodel/RetailerViewModel$Estado;", "estado", "Landroidx/lifecycle/LiveData;", "getEstado", "()Landroidx/lifecycle/LiveData;", "loadRetailer", "", "s", "", "Estado", "app_debug"})
public final class RetailerViewModel extends androidx.lifecycle.ViewModel {
    private final androidx.lifecycle.MutableLiveData<com.example.books.ui.viewmodel.RetailerViewModel.Estado> _state = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.books.ui.viewmodel.RetailerViewModel.Estado> getEstado() {
        return null;
    }
    
    public final void loadRetailer(@org.jetbrains.annotations.Nullable()
    java.lang.String s) {
    }
    
    public RetailerViewModel() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b\u00a8\u0006\t"}, d2 = {"Lcom/example/books/ui/viewmodel/RetailerViewModel$Estado;", "", "()V", "Carregado", "Carregando", "Erro", "Lcom/example/books/ui/viewmodel/RetailerViewModel$Estado$Carregando;", "Lcom/example/books/ui/viewmodel/RetailerViewModel$Estado$Carregado;", "Lcom/example/books/ui/viewmodel/RetailerViewModel$Estado$Erro;", "app_debug"})
    public static abstract class Estado {
        
        private Estado() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/example/books/ui/viewmodel/RetailerViewModel$Estado$Carregando;", "Lcom/example/books/ui/viewmodel/RetailerViewModel$Estado;", "()V", "app_debug"})
        public static final class Carregando extends com.example.books.ui.viewmodel.RetailerViewModel.Estado {
            public static final com.example.books.ui.viewmodel.RetailerViewModel.Estado.Carregando INSTANCE = null;
            
            private Carregando() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u00d6\u0003J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0012"}, d2 = {"Lcom/example/books/ui/viewmodel/RetailerViewModel$Estado$Carregado;", "Lcom/example/books/ui/viewmodel/RetailerViewModel$Estado;", "list", "", "Lcom/example/books/model/Retailer;", "(Ljava/util/List;)V", "getList", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"})
        public static final class Carregado extends com.example.books.ui.viewmodel.RetailerViewModel.Estado {
            @org.jetbrains.annotations.NotNull()
            private final java.util.List<com.example.books.model.Retailer> list = null;
            
            @org.jetbrains.annotations.NotNull()
            public final java.util.List<com.example.books.model.Retailer> getList() {
                return null;
            }
            
            public Carregado(@org.jetbrains.annotations.NotNull()
            java.util.List<com.example.books.model.Retailer> list) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.util.List<com.example.books.model.Retailer> component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.example.books.ui.viewmodel.RetailerViewModel.Estado.Carregado copy(@org.jetbrains.annotations.NotNull()
            java.util.List<com.example.books.model.Retailer> list) {
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
        
        @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000e\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u0010\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u00d6\u0003J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001J\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f\u00a8\u0006\u0017"}, d2 = {"Lcom/example/books/ui/viewmodel/RetailerViewModel$Estado$Erro;", "Lcom/example/books/ui/viewmodel/RetailerViewModel$Estado;", "error", "", "hasConsumed", "", "(Ljava/lang/Throwable;Z)V", "getError", "()Ljava/lang/Throwable;", "getHasConsumed", "()Z", "setHasConsumed", "(Z)V", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "", "app_debug"})
        public static final class Erro extends com.example.books.ui.viewmodel.RetailerViewModel.Estado {
            @org.jetbrains.annotations.NotNull()
            private final java.lang.Throwable error = null;
            private boolean hasConsumed;
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.Throwable getError() {
                return null;
            }
            
            public final boolean getHasConsumed() {
                return false;
            }
            
            public final void setHasConsumed(boolean p0) {
            }
            
            public Erro(@org.jetbrains.annotations.NotNull()
            java.lang.Throwable error, boolean hasConsumed) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.Throwable component1() {
                return null;
            }
            
            public final boolean component2() {
                return false;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.example.books.ui.viewmodel.RetailerViewModel.Estado.Erro copy(@org.jetbrains.annotations.NotNull()
            java.lang.Throwable error, boolean hasConsumed) {
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
    }
}