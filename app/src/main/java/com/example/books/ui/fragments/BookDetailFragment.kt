package com.example.books.ui.fragments

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.books.HTTP.HTTPRetailer
import com.example.books.R
import com.example.books.model.SearchResultRetailer
import com.example.books.model.Volume
import com.example.books.repository.BookRepository
import com.example.books.ui.viewmodel.BookDetailViewModel
import com.example.books.ui.viewmodel.BookVmFactory
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_book_detail.*
import kotlinx.coroutines.*
import kotlinx.coroutines.Dispatchers.IO

class BookDetailFragment(volume: Volume) : Fragment() {
    private val job = Job()
    private val coroutineScope = CoroutineScope(job + Dispatchers.Main)
    private val volume = volume

    private val viewModel: BookDetailViewModel by lazy{
        ViewModelProvider(
            this,
            BookVmFactory(
                BookRepository(requireContext())
            )
        ).get(BookDetailViewModel::class.java)
    }
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? =
        inflater.inflate(
            R.layout.activity_book_detail,
            container,
            false
        )

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        Log.i("Teste", "mandado para a view: ${volume.volumeInfo.authors}")
        Log.i("Teste", "mandado para a view: ${volume.selfLink}")
        Log.i("Teste", "mandado para a view: ${volume.volumeInfo.title}")
        super.onViewCreated(view, savedInstanceState)
        //setContentView(R.layout.activity_book_detail)

        //val volume = intent.getParcelableExtra<Volume?>(EXTRA_BOOK)
        volume?.run{
            txtTitle.text = volume.volumeInfo.title
            txtAuthor.text = volume.volumeInfo.authors?.joinToString()
            txtPages.text = volume.volumeInfo.pageCount.toString()
            txtPublisher.text = volume.volumeInfo.publisher
            txtDetails.text = volume.volumeInfo.description
            if (volume.volumeInfo.imageLinks?.thumbnail?.isNotEmpty() == true){
                Picasso.get()
                    .load(volume.volumeInfo.imageLinks?.smallThumbnail)
                    .into(imgCapa)
            }
            viewModel.onCreate(volume)
            viewModel.isFavorite.observe(this@BookDetailFragment,
                Observer { isFavorite ->
                    if (isFavorite){
                        fabFavorite.setImageResource(R.drawable.ic_delete)
                        fabFavorite.setOnClickListener {
                            viewModel.removeToFavorites(volume)
                        }
                    } else {
                        fabFavorite.setImageResource(R.drawable.ic_add)
                        fabFavorite.setOnClickListener {
                            viewModel.saveToFavorite(volume)
                        }
                    }
                }
            )

        }

        buttonLeitura.setOnClickListener{
            val id = volume?.id
            val browserIntent =
                Intent(Intent.ACTION_VIEW, Uri.parse("https://books.google.com.br/books?id=$id&printsec=frontcover&source=gbs_atb#v=onepage&q&f=false"))
            startActivity(browserIntent)

        }


    }
    companion object {
        private const val EXTRA_BOOK = "book"
        fun openWithVolume(context: Context, volume: Volume) {
            val intencao = Intent(context, BookDetailFragment::class.java)
            CoroutineScope(IO).launch {

            }
            intencao.putExtra(EXTRA_BOOK, volume)
            context.startActivity(intencao)
        }
    }
   /* fun callWebService(s: String?): SearchResultRetailer {
        lateinit var algo: SearchResultRetailer
        coroutineScope.launch {
            val retail = withContext(IO){
                HTTPRetailer.searchRetailer(s)
            }
            if (retail != null) {
                algo = retail
            }
        }
        return algo
    }*/




}
