package com.example.iteradmin.kotlin_bottomnavigation_jun03

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

abstract class BaseActivity :AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(getContentView())
    }

    abstract fun getContentView(): Int
    abstract fun getItemId():Int
}