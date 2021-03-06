package com.example.books.HTTP;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/example/books/HTTP/HTTPRetailer;", "", "()V", "BOOK_JSON_URL", "", "client", "Lokhttp3/OkHttpClient;", "searchRetailer", "Lcom/example/books/model/SearchResultRetailer;", "q", "app_debug"})
public final class HTTPRetailer {
    private static final java.lang.String BOOK_JSON_URL = "https://bookapiapp.herokuapp.com/resultpage?bookid=%s";
    private static final okhttp3.OkHttpClient client = null;
    public static final com.example.books.HTTP.HTTPRetailer INSTANCE = null;
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.books.model.SearchResultRetailer searchRetailer(@org.jetbrains.annotations.Nullable()
    java.lang.String q) {
        return null;
    }
    
    private HTTPRetailer() {
        super();
    }
}