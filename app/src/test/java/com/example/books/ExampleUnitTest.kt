package com.example.books

import com.example.books.HTTP.HTTPBook
import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun searchIsComplete(){
        val searchResult = HTTPBook.searchBook("Dominando o Android")
        searchResult?.items?.forEach{
            println(it)
        }
    }
}
