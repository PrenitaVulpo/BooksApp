package com.example.books.repository

import android.content.Context
import com.example.books.model.Volume
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

class BookRepository (context: Context){
    private val database = AppDatabase.getDatabase(context)

    suspend fun save(volume: Volume){
        database.getBookDao().save(
            BookVolumeMapper.volumeToBook(volume)
        )
    }

    suspend fun delete(volume: Volume){
        database.getBookDao().delete(
            BookVolumeMapper.volumeToBook(volume)
        )
    }

    suspend fun isFavorite(id: String): Boolean{
        return database.getBookDao().isFavorite(id) > 0
    }

    fun allFavorites(): Flow<List<Volume>>{
        return database.getBookDao()
            .allFavorites()
            .map{
                bookList ->
                bookList.map { book ->
                    BookVolumeMapper.bookToVolume((book))
                }
            }
    }
}