package com.example.coderswag.Services

import com.example.coderswag.Model.Category
import com.example.coderswag.Model.Product
import com.example.coderswag.R

object DataService {

    val categories = listOf(
        Category("SHIRT",R.drawable.shirtimage),
        Category("HOODIES",R.drawable.hoodieimage),
        Category("HATS",R.drawable.hatimage),
        Category("DIGITAL",R.drawable.digitalgoodsimage))


    val hats = listOf(
        Product("Devslopes Graphic Beanie","$18", R.drawable.hat1),
        Product("Devslopes Hat Black","$20",R.drawable.hat2),
        Product("Devslopes Hat White","$18",R.drawable.hat3),
        Product("Devslopes Hat Snapback","$22",R.drawable.hat4),
        Product("Devslopes Hat Black","$20",R.drawable.hat2),
        Product("Devslopes Hat White","$18",R.drawable.hat3),
        Product("Devslopes Hat Snapback","$22",R.drawable.hat4),
        Product("Devslopes Hat Black","$20",R.drawable.hat2),
        Product("Devslopes Hat White","$18",R.drawable.hat3),
        Product("Devslopes Hat Snapback","$22",R.drawable.hat4),
    )

    val hoodies = listOf(
        Product("Devslopes Hoodie Gray","$28",R.drawable.hoodie1),
        Product("Devslopes Hoodie Red","$32",R.drawable.hoodie2),
        Product("Devslopes  Gray Hoodie","$28",R.drawable.hoodie3),
        Product("Devslopes Black Hoodie","$32",R.drawable.hoodie4),
        Product("Devslopes Hoodie Gray","$28",R.drawable.hoodie1),
        Product("Devslopes Hoodie Red","$32",R.drawable.hoodie2),
        Product("Devslopes  Gray Hoodie","$28",R.drawable.hoodie3),
        Product("Devslopes Black Hoodie","$32",R.drawable.hoodie4),
        Product("Devslopes Hoodie Gray","$28",R.drawable.hoodie1),
        Product("Devslopes Hoodie Red","$32",R.drawable.hoodie2),
        Product("Devslopes  Gray Hoodie","$28",R.drawable.hoodie3),
        Product("Devslopes Black Hoodie","$32",R.drawable.hoodie4),
    )

    val shirts = listOf(
        Product("Devslopes Shirt Black","$12",R.drawable.shirt1),
        Product("Devslopes Badge Light Gray","$13",R.drawable.shirt2),
        Product("Devslopes  Logo Shirt Red","$14",R.drawable.shirt3),
        Product("Devslopes Hustle","$15",R.drawable.shirt4),
        Product("Kickflip Studios","$16",R.drawable.shirt5),
        Product("Devslopes Shirt Black","$12",R.drawable.shirt1),
        Product("Devslopes Badge Light Gray","$13",R.drawable.shirt2),
        Product("Devslopes  Logo Shirt Red","$14",R.drawable.shirt3),
        Product("Devslopes Hustle","$15",R.drawable.shirt4),
        Product("Kickflip Studios","$16",R.drawable.shirt5),
        Product("Devslopes Shirt Black","$12",R.drawable.shirt1),
        Product("Devslopes Badge Light Gray","$13",R.drawable.shirt2),
        Product("Devslopes  Logo Shirt Red","$14",R.drawable.shirt3),
        Product("Devslopes Hustle","$15",R.drawable.shirt4),
        Product("Kickflip Studios","$16",R.drawable.shirt5),

        )
    val digitalGood = listOf<Product>()

    fun getProducts(category : String) : List<Product>{

        return when(category){
            "SHIRT" -> shirts
            "HATS" -> hats
            "HOODIES" -> hoodies
            else -> digitalGood
        }

    }
}