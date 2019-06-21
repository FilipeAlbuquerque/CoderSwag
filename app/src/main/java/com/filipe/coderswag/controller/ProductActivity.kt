package com.filipe.coderswag.controller

import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import com.filipe.coderswag.R
import com.filipe.coderswag.adapters.ProductsAdapter
import com.filipe.coderswag.services.DataService
import com.filipe.coderswag.utilities.EXTRA_CATEGORY
import kotlinx.android.synthetic.main.activity_product.*

class ProductActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        lateinit var adapter : ProductsAdapter

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product)
        val categoryType = intent.getStringExtra(EXTRA_CATEGORY)
        adapter = ProductsAdapter(this, DataService.getProducts(categoryType))
        productListView.adapter = adapter

        //changing the columns depending of the orientation
        var spanCount = 2
        val orientation = resources.configuration.orientation
        if (orientation == Configuration.ORIENTATION_LANDSCAPE){
            spanCount = 3
        }

        //changing the image size depending of device size
        val screenSize = resources.configuration.screenWidthDp
        if (screenSize > 720){
            spanCount = 3
        }

        //layout manager
        val layoutManager = GridLayoutManager(this, spanCount)
        productListView.layoutManager = layoutManager
    }
}
