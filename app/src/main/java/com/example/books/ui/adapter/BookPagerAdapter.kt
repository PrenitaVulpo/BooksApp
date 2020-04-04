package com.example.books.ui.adapter

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.books.ui.fragments.BookListFragment
import com.example.books.ui.fragments.BooksFavoritesFragment
import kotlin.math.log

class BookPagerAdapter(fa: FragmentActivity, val s: String, val i: Int
                       //val bundle: Bundle
 ): FragmentStateAdapter(fa){
    override fun getItemCount(): Int = 2

        override fun createFragment(position: Int): Fragment =
            when (position) {

                0 -> BookListFragment(
                    s
                    //bundle
                )
                else -> {
                    Log.i("Teste", this.i.toString())
                    Log.i("Teste", "Favourites called")
                    BooksFavoritesFragment()
                }
            }

}