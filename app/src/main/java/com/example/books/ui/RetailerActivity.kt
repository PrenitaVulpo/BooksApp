package com.example.books.ui

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.content.ContextCompat.startActivity
import com.example.books.R
import com.example.books.model.Volume
import com.example.books.ui.adapter.RetailerAdapter
import com.example.books.ui.fragments.BookDetailFragment
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.android.synthetic.main.detail_swipe_view.*
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch


class RetailerActivity: AppCompatActivity() {
    //Futura activity onde será exibida uma lista de revendedores dentro do app,
    // após várias tentativas aparentemente ela terá que ser um fragment dentro da activity de detalhes

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.detail_swipe_view)
        //val bundle = intent.getStringExtra("busca")!!
        val volume = intent.getParcelableExtra<Volume?>(EXTRA_BOOK)
        Log.i("Teste", volume!!.volumeInfo.title)
        pager.adapter = RetailerAdapter(this, volume)
        TabLayoutMediator(tabs, pager) { tab, position ->
            tab.setText(
                when (position) {

                    0 -> R.string.tab_details
                    else -> R.string.tab_web
                }
            )

        }.attach()
    }
    companion object {
        fun openWithRetailer(context: Context, s: String) {

            CoroutineScope(Dispatchers.IO).launch {

            }

            val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse(s))
            context.startActivity(browserIntent)
            /*val intencao = Intent(context, RetailerActivity::class.java)
            CoroutineScope(Dispatchers.IO).launch {

            }
            intencao.putExtra(EXTRA_BOOK, volume)
            context.startActivity(intencao)*/
        }
        private const val EXTRA_BOOK = "book"
        fun openWithVolume(context: Context, volume: Volume) {
            val intencao = Intent(context, RetailerActivity::class.java)
            CoroutineScope(Dispatchers.IO).launch {

            }
            intencao.putExtra(EXTRA_BOOK, volume)
            context.startActivity(intencao)
        }
    }



    /*private val job = Job()
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
    }*/


}