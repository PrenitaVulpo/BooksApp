package com.example.books.ui

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.books.R
import com.example.books.ui.adapter.BookPagerAdapter
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity: AppCompatActivity() {


    //val bundle = intent.getStringExtra("busca")!!
    //Log.i("Teste", "Termo buscado: $bundle")
    //val s: String = "a"

    //val bundle: Bundle = intent.extras!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val bundle = intent.getStringExtra("busca")!!
        val pagerInt = intent.getIntExtra("frgToLoad", 0)
        pager.adapter = BookPagerAdapter(this, bundle, pagerInt)
        pager.setCurrentItem(pagerInt)
        TabLayoutMediator(tabs, pager) { tab, position ->
                tab.setText(
                    if (position == 0) {
                        R.string.tab_books
                    } else {
                        R.string.tab_favorites
                    }
                )

        }.attach()
    }

}
