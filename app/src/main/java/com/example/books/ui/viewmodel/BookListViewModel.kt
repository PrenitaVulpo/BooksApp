package com.example.books.ui.viewmodel


import androidx.lifecycle.*
import com.example.books.HTTP.HTTPBook
import com.example.books.model.Volume
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import java.lang.Exception

class BookListViewModel: ViewModel(){

    private val _state = MutableLiveData<State>()
    val state: LiveData<State>
    get() = _state

    fun loadBooks(s: String?){
        if(state.value != null)return
            viewModelScope.launch{
                _state.value = State.StateLoading
                val result = withContext(Dispatchers.IO) {
                    HTTPBook.searchBook(s)
                }
                if (result != null) {
                    _state.value = State.StateLoaded(result.items)
                } else {
                    _state.value = State.StateError(Exception("No results"), false)
                }

            }
    }

    sealed class State {
        object StateLoading: State()
        data class StateLoaded(val list: List<Volume>): State()
        data class StateError(val error: Throwable, var hasConsumed: Boolean): State()
    }
}