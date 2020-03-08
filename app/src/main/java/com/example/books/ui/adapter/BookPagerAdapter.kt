package com.example.books.ui.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.books.ui.fragments.BookListFragment
import com.example.books.ui.fragments.BooksFavoritesFragment

class BookPagerAdapter(fa: FragmentActivity): FragmentStateAdapter(fa){
    override fun getItemCount(): Int = 2

    override fun createFragment(position: Int): Fragment =
        when (position){
            0 -> BookListFragment()
            else -> BooksFavoritesFragment()
        }
}