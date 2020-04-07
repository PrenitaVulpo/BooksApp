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

class RetailerViewModel: ViewModel() {

    private val _state = MutableLiveData<Estado>()
    val estado: LiveData<Estado> get() = _state

    fun loadRetailer(s: String?){
        if(estado.value != null)return
        viewModelScope.launch{
            _state.value = Estado.Carregando
            val result = withContext(Dispatchers.IO) {
                HTTPRetailer.searchRetailer(s)
            }
            if (result != null) {
                _state.value = Estado.Carregado(result.items)
            } else {
                _state.value = Estado.Erro(Exception("No results"), false)
            }

        }
    }

    sealed class Estado {
        object Carregando: Estado()
        data class Carregado(val list: List<Retailer>): Estado()
        data class Erro(val error: Throwable, var hasConsumed: Boolean): Estado()
    }
}