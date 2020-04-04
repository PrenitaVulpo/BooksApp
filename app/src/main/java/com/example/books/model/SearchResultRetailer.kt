package com.example.books.model

class SearchResultRetailer(
    val items: List<Retailer>
) {
    operator fun get(i: Int): Any {
        return items[i]
    }
    fun setLink(i: Int, q: String){
        this.items[i].link = q
    }
    fun setRetailerName(i: Int, q: String){
        this.items[i].retailerName = q
    }
    fun setPrice(i: Int, q: String){
        this.items[i].price = q
    }
}