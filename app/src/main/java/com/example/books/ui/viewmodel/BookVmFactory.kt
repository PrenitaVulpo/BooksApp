package com.example.books.ui.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.books.repository.BookRepository
import java.lang.IllegalArgumentException

class BookVmFactory (val repository: BookRepository):
        ViewModelProvider.Factory{
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(BookFavoritesViewModel::class.java)){
            return BookFavoritesViewModel(repository) as T
        } else if (modelClass.isAssignableFrom(BookDetailViewModel::class.java)){
                return BookDetailViewModel(repository) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }

}