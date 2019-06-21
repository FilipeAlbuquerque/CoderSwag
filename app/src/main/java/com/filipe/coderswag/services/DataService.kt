package com.filipe.coderswag.services

import com.filipe.coderswag.model.Category
import com.filipe.coderswag.model.Product
/*
** Created by Filipe Augusto 06/18/2019/?
 */
object DataService {
    var categories = listOf(

        Category("SHIRTS", "shirtimage"),
        Category("HOODIES", "hoodieimage"),
        Category("HATS", "hatimage"),
        Category("DIGITAL", "digitalgoodsimage")
    )

   private var hats = listOf(

        Product("Devslopes Green blue-sky", "$18", "hat1"),
        Product("Devslopes White hat", "$12", "hat2"),
        Product("Devslopes Graphic Josh", "$16", "hat3"),
        Product("Devslopes Black hat", "$14", "hat4"),
        Product("Devslopes Green blue-sky", "$18", "hat1"),
        Product("Devslopes White hat", "$12", "hat2"),
        Product("Devslopes Graphic Josh", "$16", "hat3"),
        Product("Devslopes Black hat", "$14", "hat4"),
        Product("Devslopes Green blue-sky", "$18", "hat1"),
        Product("Devslopes White hat", "$12", "hat2"),
        Product("Devslopes Graphic Josh", "$16", "hat3"),
        Product("Devslopes Black hat", "$14", "hat4")
    )

   private var hoodies = listOf(
        Product("Devslopes Hoodie Gray", "$27", "hoodie1"),
        Product("Devslopes Hoodie Black", "$25", "hoodie2"),
        Product("Devslopes White Hoodie", "$32", "hoodie3"),
        Product("Devslopes Gray Hoodie", "$28", "hoodie4"),
        Product("Devslopes Hoodie Gray", "$27", "hoodie1"),
        Product("Devslopes Hoodie Black", "$25", "hoodie2"),
        Product("Devslopes White Hoodie", "$32", "hoodie3"),
        Product("Devslopes Gray Hoodie", "$28", "hoodie4"),
        Product("Devslopes Hoodie Gray", "$27", "hoodie1"),
        Product("Devslopes Hoodie Black", "$25", "hoodie2"),
        Product("Devslopes White Hoodie", "$32", "hoodie3"),
        Product("Devslopes Gray Hoodie", "$28", "hoodie4")

    )

    private var shirts = listOf(
        Product("Devslopes Shirt Gray", "$18", "shirt1"),
        Product("Devslopes Bagde light Gray", "$17", "shirt2"),
        Product("Devslopes Blach Shirt", "$22", "shirt3"),
        Product("Devslopes White Shirt", "$16", "shirt4"),
        Product("Kickflip Studios", "$18", "shirt5"),
        Product("Devslopes Shirt Gray", "$18", "shirt1"),
        Product("Devslopes Bagde light Gray", "$17", "shirt2"),
        Product("Devslopes Blach Shirt", "$22", "shirt3"),
        Product("Devslopes White Shirt", "$16", "shirt4"),
        Product("Kickflip Studios", "$18", "shirt5"),
        Product("Devslopes Shirt Gray", "$18", "shirt1"),
        Product("Devslopes Bagde light Gray", "$17", "shirt2"),
        Product("Devslopes Blach Shirt", "$22", "shirt3"),
        Product("Devslopes White Shirt", "$16", "shirt4"),
        Product("Kickflip Studios", "$18", "shirt5")

    )

    var digitalGood = listOf<Product>()

    fun getProducts(category: String) : List<Product>{
        return when(category){
            "SHIRTS" -> shirts
            "HATS" -> hats
            "HOODIES" -> hoodies
            else -> digitalGood
        }
    }
}