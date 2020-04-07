package com.example.books.ui.adapter

import android.content.Intent
import android.net.Uri
import android.util.Log
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

class RetailerListAdapter(val retailer: List<Retailer>, val mItemClickListener:ItemClickListener
                          //, val itemCallback: (String) -> Unit
    ): RecyclerView.Adapter<RetailerListAdapter.RetailVH>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RetailVH {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.item_retailer, parent, false)

        return RetailVH(view, retailer)
    }


    //filtro para somente irem revendedores com preço
    fun listTreating(retailer: List<Retailer>): List<Retailer> {
        var mutableList = retailer.toMutableList()
        var list2 = mutableList.filter { retail: Retailer -> retail.price.startsWith("R")  }
        val i = list2.size
            Log.i("Teste", "Tamanho da nova lista: $i")
        return list2
    }

    private val newRetailer = listTreating(retailer)
    override fun getItemCount(): Int = newRetailer.size

    override fun onBindViewHolder(holder: RetailVH, position: Int) {
        val retail = newRetailer[position]
        holder.run {
            retailerName.text = retail.retailerName
            var stringToTreat = retail.price
            var s2 = stringToTreat.replaceRange(0, 3, "R$:")
            Log.i("teste", "dasdas$s2")
            price.text = s2
            imageSwitch(retail.retailerName, logo)
            itemView.setOnClickListener{
                //val link = retail.link
                mItemClickListener.onItemClick(position, retail.link)



            }
            /*itemView.setOnClickListener{
                itemCallback(volume)


            }*/
        }
    }

    inner class RetailVH(parent: View, retailer: List<Retailer>) : RecyclerView.ViewHolder(parent) {
        val retailerName: TextView = parent.retailerName
        val price: TextView = parent.price
        val logo: ImageView = parent.logo

        init {
            parent.setOnClickListener{
                mItemClickListener.onItemClick(adapterPosition, retailer[adapterPosition].link)
            }
            parent.setOnLongClickListener{
                mItemClickListener.onLongClick(adapterPosition, retailer[adapterPosition].link)
                return@setOnLongClickListener true
            }
        }
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
                "Livrarias Curitiba" -> R.drawable.logo_livrarias_curitiba
                "Livraria da Travessa" -> R.drawable.logo_travessa
                else -> R.drawable.logo_no_logo
            })
                .into(logo)
        }
    }
    interface ItemClickListener{
        fun onItemClick(position: Int, link: String)
        fun onLongClick(position: Int, link: String)
    }

}
