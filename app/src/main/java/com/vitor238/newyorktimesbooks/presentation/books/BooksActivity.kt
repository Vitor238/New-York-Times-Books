package com.vitor238.newyorktimesbooks.presentation.books

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.vitor238.newyorktimesbooks.R
import kotlinx.android.synthetic.main.activity_books.*

class BooksActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_books)

        toolbarMain.title = "Books"
        setSupportActionBar(toolbarMain)
    }
}
