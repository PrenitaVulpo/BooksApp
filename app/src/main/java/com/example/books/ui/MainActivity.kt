package com.example.books.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.books.R
import com.example.books.ui.adapter.BookPagerAdapter
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        pager.adapter = BookPagerAdapter(this)
        TabLayoutMediator(tabs, pager) { tab, position ->
            tab.setText(
                if (position == 0){
                    R.string.tab_books
                } else {
                    R.string.tab_favorites
                }
            )
        }.attach()
    }

}
