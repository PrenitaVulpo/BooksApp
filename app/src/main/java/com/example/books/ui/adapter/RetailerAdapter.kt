package com.example.books.ui.adapter

import android.util.Log
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.books.model.Volume
import com.example.books.ui.fragments.BookDetailFragment
import com.example.books.ui.fragments.RetailerFragment

class RetailerAdapter(fa: FragmentActivity, val volume: Volume): FragmentStateAdapter(fa){
    override fun getItemCount(): Int = 2


    override fun createFragment(position: Int): Fragment =
        when (position) {

            0 ->BookDetailFragment(volume)
            else -> {
                Log.i("Teste", "Retailers called")
                RetailerFragment(volume.id)
            }
        }



}