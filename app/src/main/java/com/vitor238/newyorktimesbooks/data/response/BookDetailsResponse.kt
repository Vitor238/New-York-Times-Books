package com.vitor238.newyorktimesbooks.data.response

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class BookDetailsResponse(
    val title: String,
    val authors: String,
    val description: String
)