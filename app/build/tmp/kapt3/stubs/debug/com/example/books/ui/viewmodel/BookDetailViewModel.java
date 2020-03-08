package com.example.books.ui.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u000e\u0010\u000f\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u000e\u0010\u0010\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eR\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/example/books/ui/viewmodel/BookDetailViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/example/books/repository/BookRepository;", "(Lcom/example/books/repository/BookRepository;)V", "_isFavorite", "Landroidx/lifecycle/MutableLiveData;", "", "isFavorite", "Landroidx/lifecycle/LiveData;", "()Landroidx/lifecycle/LiveData;", "onCreate", "", "volume", "Lcom/example/books/model/Volume;", "removeToFavorites", "saveToFavorite", "app_debug"})
public final class BookDetailViewModel extends androidx.lifecycle.ViewModel {
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> _isFavorite = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.Boolean> isFavorite = null;
    private final com.example.books.repository.BookRepository repository = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> isFavorite() {
        return null;
    }
    
    public final void onCreate(@org.jetbrains.annotations.NotNull()
    com.example.books.model.Volume volume) {
    }
    
    public final void saveToFavorite(@org.jetbrains.annotations.NotNull()
    com.example.books.model.Volume volume) {
    }
    
    public final void removeToFavorites(@org.jetbrains.annotations.NotNull()
    com.example.books.model.Volume volume) {
    }
    
    public BookDetailViewModel(@org.jetbrains.annotations.NotNull()
    com.example.books.repository.BookRepository repository) {
        super();
    }
}