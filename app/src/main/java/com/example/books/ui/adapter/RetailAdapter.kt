package com.example.books.ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.books.R
import com.example.books.model.Retailer
import kotlinx.android.synthetic.main.item_retailer.view.*

class RetailAdapter(itemsC: List<Retailer>?) : RecyclerView.Adapter<RecyclerView.ViewHolder>(){
    private lateinit var items: List<Retailer>
    private val itemsT = itemsC
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return RetailerVH(
            LayoutInflater.from(parent.context).inflate(R.layout.item_retailer, parent, false)
        )
    }

    override fun getItemCount(): Int {
        return (if (itemsT != null) itemsT.size else null)!!
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (holder){
            is RetailerVH -> {
                holder.bind(items.get(position))
            }
        }
    }
    fun submitList(retailerList: List<Retailer>?){
        if (itemsT != null) {
            items = itemsT
        } else if (retailerList != null){
            items = retailerList
        }
    }
    class RetailerVH constructor(
        item_retailer: View
    ): RecyclerView.ViewHolder(item_retailer){
        val retaileName = item_retailer.retailerName
        val price = item_retailer.price
        val image = item_retailer.imageView

        fun bind(retailer: Retailer){
            retaileName.setText(retailer.retailerName)
            price.setText(retailer.price)

        }
    }
}