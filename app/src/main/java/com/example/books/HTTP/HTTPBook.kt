package com.example.books.HTTP

import android.util.Log
import com.example.books.model.SearchResult
import com.google.gson.Gson
import okhttp3.OkHttpClient
import okhttp3.Request
import java.lang.Exception
import java.util.concurrent.TimeUnit

object HTTPBook {
    private const val API_KEY = "AIzaSyCCiu8UNvdVj5x1AUs8J05sr_66EToquas"
    private const val BOOK_JSON_URL = "https://www.googleapis.com/books/v1/volumes?q=%s&key=$API_KEY"
    private val client = OkHttpClient.Builder()
        .readTimeout(5, TimeUnit.SECONDS)
        .connectTimeout(10, TimeUnit.SECONDS)
        .build()
    fun searchBook(q: String): SearchResult?{

        val request = Request.Builder()
            .url(String.format(BOOK_JSON_URL, q))
            .build()
        Log.i("Teste", "$request")
        try {
            val response = client.newCall(request).execute()
            val json = response.body?.string()
            val result =
                Gson().fromJson<SearchResult>(
                json, SearchResult::class.java
            )

            return result
        } catch (e: Exception){
            e.printStackTrace()
        }
        return null
    }
}