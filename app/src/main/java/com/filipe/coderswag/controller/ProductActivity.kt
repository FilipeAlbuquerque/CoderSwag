package com.filipe.coderswag.controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.filipe.coderswag.R
import com.filipe.coderswag.utilities.EXTRA_CATEGORY

class ProductActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product)
        val categoryType = intent.getStringExtra(EXTRA_CATEGORY)
        println(categoryType)

    }
}
