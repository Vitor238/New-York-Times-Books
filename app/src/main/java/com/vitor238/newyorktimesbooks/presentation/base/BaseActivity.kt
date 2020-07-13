package com.vitor238.newyorktimesbooks.presentation.base


import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import kotlinx.android.synthetic.main.include_toolbar.*

open class BaseActiviy : AppCompatActivity() {

    protected fun setupToolbar(toolbar: Toolbar, titleIdRes: Int) {
        toolbar.title = getString(titleIdRes)
        setSupportActionBar(toolbar)
    }

}