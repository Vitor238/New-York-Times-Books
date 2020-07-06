package com.vitor238.newyorktimesbooks.data

import com.vitor238.newyorktimesbooks.data.response.BookBodyResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface NYTServices {
    @GET("lists.json")
    fun getBooks(
        @Query("api-key") apiKey: String = "your-key",
        @Query("list") list: String = "hardcover-fiction"
    ): Call<BookBodyResponse>
}