package com.example.books.ui.adapter

import android.content.Intent
import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.books.R
import com.example.books.model.Retailer
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.item_retailer.view.*

class RetailerListAdapter(val retailer: List<Retailer>
                          //, val itemCallback: (String) -> Unit
    ): RecyclerView.Adapter<RetailerListAdapter.RetailVH>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RetailVH {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.item_retailer, parent, false)

        return RetailVH(view)
    }


    override fun getItemCount(): Int = retailer.size

    override fun onBindViewHolder(holder: RetailVH, position: Int) {
        val retail = retailer[position]
        holder.run {
            retailerName.text = retail.retailerName
            price.text = retail.price
            imageSwitch(retail.retailerName, logo)
            itemView.setOnClickListener{
                val link = retail.link.toString()
                //itemCallback(link)



            }
            /*itemView.setOnClickListener{
                itemCallback(volume)


            }*/
        }
    }

    inner class RetailVH(parent: View) : RecyclerView.ViewHolder(parent) {
        val retailerName: TextView = parent.retailerName
        val price: TextView = parent.price
        val logo: ImageView = parent.logo
    }

    companion object{
        fun imageSwitch(s: String, logo: ImageView){
            Picasso.get().load(
            when (s){
                "Amazon.com", "Amazon.com.br - Retail" -> R.drawable.logo_amazon
                "Livraria Cultura" -> R.drawable.logo_livraria_cultura
                "Livraria Nobel" -> R.drawable.logo_nobel
                "Submarino" -> R.drawable.logo_submarino
                "Livraria Saraiva" -> R.drawable.logo_saraiva
                "Magazine Luiza" -> R.drawable.logo_magazine_luiza
                "Mercado Livre" -> R.drawable.logo_mercadolivre
                "Novatec Editora" -> R.drawable.logo_novatec
                else -> R.drawable.logo_no_logo
            })
                .into(logo)
        }
    }
}
