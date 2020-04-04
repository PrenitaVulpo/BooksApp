package com.example.books.ui.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.books.HTTP.HTTPRetailer
import com.example.books.model.Retailer
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class RetailViewModel :ViewModel(){
    private val _state = MutableLiveData<State>()
    val state: LiveData<State>
        get() = _state

    fun loadRetail(s: String?){
        if(state.value != null)return
        viewModelScope.launch{
            _state.value = State.StateLoading
            val result = withContext(Dispatchers.IO) {
                HTTPRetailer.searchRetailer(s)
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
        data class StateLoaded(val list: List<Retailer>): State()
        data class StateError(val error: Throwable, var hasConsumed: Boolean): State()
    }
}