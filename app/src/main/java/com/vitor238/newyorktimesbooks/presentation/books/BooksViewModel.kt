package com.vitor238.newyorktimesbooks.presentation.books

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.vitor238.newyorktimesbooks.data.ApiService
import com.vitor238.newyorktimesbooks.data.model.Book
import com.vitor238.newyorktimesbooks.data.response.BookBodyResponse
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class BooksViewModel : ViewModel() {

    val booksLiveData: MutableLiveData<List<Book>> = MutableLiveData()

    fun getBooks() {
        ApiService.service.getBooks().enqueue(object : Callback<BookBodyResponse> {
            override fun onResponse(
                call: Call<BookBodyResponse>,
                response: Response<BookBodyResponse>
            ) {
                if (response.isSuccessful) {
                    val books: MutableList<Book> = mutableListOf()
                    response.body()?.let { bookBodyResponse ->
                        for (results in bookBodyResponse.bookResults) {
                            val book = Book(
                                title = results.bookDetailsResponse[0].title,
                                author = results.bookDetailsResponse[0].author,
                                description = results.bookDetailsResponse[0].description
                            )
                            books.add(book)
                        }
                    }
                    booksLiveData.value = books
                }
            }

            override fun onFailure(call: Call<BookBodyResponse>, t: Throwable) {

            }
        })
    }
}