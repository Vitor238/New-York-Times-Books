package com.vitor238.newyorktimesbooks.presentation.books

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.vitor238.newyorktimesbooks.R
import com.vitor238.newyorktimesbooks.data.model.Book
import kotlinx.android.synthetic.main.item_book.view.*

class BooksAdapter(
    private val books: List<Book>
) : RecyclerView.Adapter<BooksAdapter.BooksViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BooksViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_book, parent, false)
        return BooksViewHolder(view)
    }

    override fun getItemCount() = books.size

    override fun onBindViewHolder(holder: BooksViewHolder, position: Int) {
        val book = books[position]
        holder.bindView(book)
    }

    class BooksViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        private val textTitle = itemView.textAuthor
        private val textAuthor = itemView.textAuthor

        fun bindView(book: Book) {
            textTitle.text = book.title
            textAuthor.text = book.author
        }
    }
}