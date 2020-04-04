package com.example.books.ui

import android.content.Context
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.books.HTTP.HTTPRetailer
import com.example.books.R
import com.example.books.model.SearchResultRetailer
import com.example.books.ui.adapter.RetailAdapter
import com.example.books.ui.adapter.RetailerAdapter
import com.example.books.ui.viewmodel.BookListViewModel
import kotlinx.android.synthetic.main.fragment_book_price.*
import kotlinx.coroutines.*
import kotlinx.coroutines.Dispatchers.IO
import kotlinx.coroutines.Dispatchers.Main


class RetailerActivity: AppCompatActivity() {


    //Futura activity onde será exibida uma lista de revendedores dentro do app,
    // após várias tentativas aparentemente ela terá que ser um fragment dentro da activity de detalhes

    private val job = Job()
    private val coroutineScope = CoroutineScope(job + Dispatchers.Main)

    override fun onDestroy() {
        super.onDestroy()
        job.cancel()
    }



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_book_price)
        val bundle = intent.getStringExtra("busca")
        Log.i("teste", "bundle recebido: $bundle")
    }


}