package com.filipe.coderswag.controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.filipe.coderswag.R
import com.filipe.coderswag.model.Product
import com.filipe.coderswag.utilities.EXTRA_PRODUCT
import kotlinx.android.synthetic.main.activity_product_detail.*

class ProductDetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product_detail)

        val product = intent.getParcelableExtra<Product>(EXTRA_PRODUCT)
        val resourceId = resources.getIdentifier(product.image, "drawable", packageName)
        productDetailImage.setImageResource(resourceId)
        productDetailName.text = product.title
        productDetailPrice.text = product.price
    }
}
