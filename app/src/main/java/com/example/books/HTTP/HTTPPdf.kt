package com.example.books.HTTP

import org.jsoup.Jsoup
import org.jsoup.nodes.Document
import org.jsoup.select.Elements


object HTTPPdf {
    private const val  link = "https://books.google.com.br/books?id=%q&printsec=frontcover#v=onepage&q&f=false"

    fun scrapPage(s: String?): String?{
        val tlink = "https://books.google.com.br/books?id=$s&printsec=frontcover#v=onepage&q&f=false"
        val doc: Document = Jsoup.connect(tlink).get()
        val pdf: Elements = doc.select("#volume-center")

        return pdf.toString()

    }

}