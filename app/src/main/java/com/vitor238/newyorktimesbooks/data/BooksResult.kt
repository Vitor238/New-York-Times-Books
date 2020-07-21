package com.vitor238.newyorktimesbooks.data

import com.vitor238.newyorktimesbooks.data.model.Book

sealed class BooksResult {
    class Success(val books: List<Book>) : BooksResult()
    class ApiError(val statusCode: Int) : BooksResult()
    object ServerError : BooksResult()
}