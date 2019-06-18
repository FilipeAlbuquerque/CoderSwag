package com.filipe.coderswag.services

import com.filipe.coderswag.model.Category
import com.filipe.coderswag.model.Product
/*
** Created by Filipe Augusto 06/18/2019
 */
object DataService {
    var category = listOf(

        Category("SHIRTS", "shirtimage"),
        Category("HOODIES", "hoodieimage"),
        Category("HATS", "hatimage"),
        Category("DIGITAL", "digitalgoodsimage")
    )

    var hats = listOf(

        Product("Devslopes Green blue-sky", "$18", "hat01"),
        Product("Devslopes White hat", "$12", "hat02"),
        Product("Devslopes Graphic Josh", "$16", "hat03"),
        Product("Devslopes Black hat", "$14", "hat04")
    )

    var hoodies = listOf(
        Product("Devslopes Hoodie Gray", "$27", "hoodie1"),
        Product("Devslopes Hoodie Black", "$25", "hoodie2"),
        Product("Devslopes White Hoodie", "$32", "hoodie3"),
        Product("Devslopes Gray Hoodie", "$28", "hoodie4")

    )

    var shirts = listOf(
        Product("Devslopes Shirt Gray", "$18", "shirt1"),
        Product("Devslopes Bagde light Gray", "$17", "shirt2"),
        Product("Devslopes Blach Shirt", "$22", "shirt3"),
        Product("Devslopes White Shirt", "$16", "shirt4"),
        Product("Kickflip Studios", "$18", "shirt5")

    )
}