package com.example.books.ui

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.books.R
import com.example.books.model.Volume
import com.example.books.repository.BookRepository
import com.example.books.ui.viewmodel.BookDetailViewModel
import com.example.books.ui.viewmodel.BookVmFactory
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_book_detail.*
import kotlinx.android.synthetic.main.activity_book_detail.txtAuthor
import kotlinx.android.synthetic.main.activity_book_detail.txtPages
import kotlinx.android.synthetic.main.activity_book_detail.txtTitle

class BookDetailActivity : AppCompatActivity() {

    private val viewModel: BookDetailViewModel by lazy{
        ViewModelProvider(
            this,
            BookVmFactory(
                BookRepository(this)
            )
        ).get(BookDetailViewModel::class.java)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_book_detail)
        val volume = intent.getParcelableExtra<Volume?>(EXTRA_BOOK)
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
            viewModel.isFavorite.observe(this@BookDetailActivity,
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


    }
    companion object {
        private const val EXTRA_BOOK = "book"
        fun openWithVolume(context: Context, volume: Volume) {
            val intencao = Intent(context, BookDetailActivity::class.java)
            intencao.putExtra(EXTRA_BOOK, volume)
            context.startActivity(intencao)
        }
    }

}
