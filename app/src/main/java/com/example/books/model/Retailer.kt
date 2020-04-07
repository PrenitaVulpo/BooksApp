package com.example.books.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Retailer(
    var link: String,
    var retailerName: String,
    var price: String
): Parcelable


