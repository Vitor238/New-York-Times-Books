package com.vitor238.newyorktimesbooks.data.repository

import com.vitor238.newyorktimesbooks.data.BooksResult

interface BooksRepository {
    fun getBooks(booksResultCallback: (result: BooksResult) -> Unit)
}