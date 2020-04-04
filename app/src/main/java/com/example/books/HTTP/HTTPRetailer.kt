package com.example.books.HTTP

import android.util.Log
import com.example.books.model.SearchResultRetailer
import com.google.gson.Gson
import okhttp3.OkHttpClient
import okhttp3.Request
import java.util.concurrent.TimeUnit


object HTTPRetailer {

    //private val RETAIL_LINK: String = "https://books.google.com.br/books?id=$BOOK_ID&sitesec=buy&source=gbs_buy_r"
    //https://bookapiapp.herokuapp.com/resultpage?bookid=JEeMDwAAQBAJ

    private const val BOOK_JSON_URL = "https://bookapiapp.herokuapp.com/resultpage?bookid=%s"
    private val client = OkHttpClient.Builder()
        .readTimeout(10, TimeUnit.SECONDS)
        .connectTimeout(20, TimeUnit.SECONDS)
        .build()
    fun searchRetailer(q: String?): SearchResultRetailer? {

        val request = Request.Builder()
            .url(String.format(BOOK_JSON_URL, q))
            .build()
        Log.i("Teste", "$request")
        try {
            val response = client.newCall(request).execute()
            val json = response.body?.string()
            val result =
                Gson().fromJson<SearchResultRetailer>(
                    json, SearchResultRetailer::class.java
                )
            for (item in result.items){
                Log.i("teste", item.retailerName)
            }

            return result
        } catch (e: Exception){
            e.printStackTrace()
        }
        return null
    }
}

/*
val pageh1: Element? = doc?.getElementById("summary_content")
        val pageTable: String? = pageh1?.getElementsByClass("seller-row-alt").toString()
        lateinit var result: SearchResultRetailer
        doc?.run {
            select(pageTable).forEachIndexed{index, element ->
                var linha = element.getElementsByTag("a")
                val link = linha.attr("href")
                val revendedor = linha.text()
                linha = element.getElementsByClass("noprice")
                if (linha == null){
                    linha = element.getElementsByClass("price")
                }
                val preco = linha.text()
                val index = element.getElementsByTag("a").lastIndex
                var i = 0
                while (i<index){
                    result.run {
                        setLink(i, link)
                        setPrice(i, preco)
                        setRetailerName(i, revendedor)
                    }
                    i++
                }

            }

        }
 */