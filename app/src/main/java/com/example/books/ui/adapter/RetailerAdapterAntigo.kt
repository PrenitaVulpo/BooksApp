package com.example.books.ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.books.R
import com.example.books.model.Retailer
import kotlinx.android.synthetic.main.item_retailer.view.*

class RetailerAdapter(
    val list: List<Retailer>,
    val itemCallback: (Retailer) -> Unit
) : RecyclerView.Adapter<RetailerAdapter.RetailVH>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RetailVH {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_book, parent, false)

        return RetailVH(view)
    }

    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(holder: RetailVH, position: Int) {
        val retailer = list[position]
        holder.run {

            retailer_name.text = retailer.retailer_name
            price.text = retailer.price
            itemView.setOnClickListener{
                itemCallback(retailer)
            }
        }
    }

    inner class RetailVH(parent: View): RecyclerView.ViewHolder(parent){
        val retailer_name: TextView = parent.retai  lerName
        val price: TextView = parent.price
    }
}