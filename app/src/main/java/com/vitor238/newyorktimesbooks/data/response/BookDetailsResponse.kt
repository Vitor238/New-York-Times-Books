package com.vitor238.newyorktimesbooks.data.response

import com.squareup.moshi.JsonClass
import com.vitor238.newyorktimesbooks.data.model.Book

@JsonClass(generateAdapter = true)
data class BookDetailsResponse(
    val title: String,
    val author: String,
    val description: String
) {
    fun getBookModel() = Book(
        title = this.title,
        author = this.description,
        description = this.description
    )
}