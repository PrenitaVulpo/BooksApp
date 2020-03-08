package com.example.books.ui.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import androidx.lifecycle.liveData
import com.example.books.repository.BookRepository

class BookFavoritesViewModel(private val repository: BookRepository): ViewModel(){
    val favoriteBooks = repository.allFavorites().asLiveData()
}