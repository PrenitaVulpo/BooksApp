package com.example.books.ui.adapter

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.books.R
import com.example.books.model.Retailer
import com.example.books.model.SearchResultRetailer

class RetailerAdapter(context: Context, private val dataSource: SearchResultRetailer?): BaseAdapter() {

    private val mContext: Context = context


    //override fun getItemCount(): Int = dataSource.items.size


    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        // Get view for row item
        val inflater = LayoutInflater.from(mContext)

        val view: View
        val holder: ViewHolder

        if (convertView == null){
            view = inflater.inflate(
                R.layout.item_retailer,
                parent,
                false
            )
            holder = ViewHolder()
            holder.retailerNameTextView = view.findViewById(R.id.retailerName) as TextView
            holder.priceTextView = view.findViewById(R.id.price) as TextView

            view.tag
        } else {
            view = convertView
            holder = convertView.tag as ViewHolder
        }

        val retailerNameTextView = holder.retailerNameTextView
        val priceTextView = holder.priceTextView

        return view
    }
    private class ViewHolder {
        lateinit var retailerNameTextView: TextView
        lateinit var priceTextView: TextView
    }

    override fun getItem(position: Int): Any? {
        return dataSource?.get(position)
    }

    override fun getCount(): Int {
        if (dataSource != null) {
            return dataSource.items.size
        } else{
            return 0
        }
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

}