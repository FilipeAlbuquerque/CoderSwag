package com.filipe.coderswag.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.filipe.coderswag.R
import com.filipe.coderswag.model.Product

class ProductsAdapter(private val context: Context, private  val products: List<Product>, private val itemClick: (Product) -> Unit) : RecyclerView.Adapter<ProductsAdapter.ProductHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.product_list, parent, false)
        return ProductHolder(view, itemClick)
    }

    override fun getItemCount(): Int {
        return products.count()
    }

    override fun onBindViewHolder(holder: ProductHolder, position: Int) {
        holder.bindProduct(products[position], context)
    }

    inner class ProductHolder(itemView: View, val itemClick: (Product) -> Unit) : RecyclerView.ViewHolder(itemView) {
        private val productImage = itemView.findViewById<ImageView>(R.id.productImage)
        private val productName = itemView.findViewById<TextView>(R.id.productName)
        private val productPrice = itemView.findViewById<TextView>(R.id.productPrice)

        fun bindProduct(product : Product, context: Context){
            val resourId = context.resources.getIdentifier(product.image, "drawable", context.packageName)
            productImage.setImageResource(resourId)
            productName.text = product.title
            productPrice.text = product.price
            itemView.setOnClickListener { itemClick(product) }
        }
    }
}