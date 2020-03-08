package com.example.books.ui.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.books.R
import com.example.books.model.Volume
import com.example.books.ui.BookDetailActivity
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_book_detail.view.*
import kotlinx.android.synthetic.main.item_book.view.*
import kotlinx.android.synthetic.main.item_book.view.txtAuthor
import kotlinx.android.synthetic.main.item_book.view.txtPages
import kotlinx.android.synthetic.main.item_book.view.txtTitle

class BookAdapter (
    val list: List<Volume>,
    val itemCallback: (Volume) -> Unit
): RecyclerView.Adapter<BookAdapter.BookVH>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BookVH {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_book, parent, false)

        return BookVH(view)
    }

    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(holder: BookVH, position: Int) {
        val volume = list[position]
        holder.run {
            Picasso.get()
                .load(volume.volumeInfo.imageLinks?.smallThumbnail)
                .into(imgCover)
            txtTitle.text = volume.volumeInfo.title
            txtAuthor.text = volume.volumeInfo.authors?.joinToString()
            txtPages.text = volume.volumeInfo.pageCount.toString()
            txtPDate.text = volume.volumeInfo.publishedDate
            itemView.setOnClickListener{
                itemCallback(volume)


            }
        }
    }

    inner class BookVH(parent: View): RecyclerView.ViewHolder(parent){
        val imgCover: ImageView = parent.imgCover
        val txtTitle: TextView = parent.txtTitle
        val txtAuthor: TextView = parent.txtAuthor
        val txtPages: TextView = parent.txtPages
        val txtPDate: TextView = parent.txtPDate
    }
}