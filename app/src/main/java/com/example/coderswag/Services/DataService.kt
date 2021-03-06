package com.example.coderswag.Services

import com.example.coderswag.Model.Category
import com.example.coderswag.Model.Product

object DataService {

    val categories = listOf(Category("SHIRT","shirtimage"),
                            Category("HOODIES","hoodieimage"),
                            Category("HATS","hatimage"),
                            Category("DIGITAL","digitalgoodsimage"),
                                    Category("SHIRT","shirtimage"),
    Category("HOODIES","hoodieimage"),
    Category("HATS","hatimage"),
    Category("DIGITAL","digitalgoodsimage"))


    val hats = listOf(
                Product("Devslopes Graphic Beanie","$18","hat1"),
        Product("Devslopes Hat Black","$20","hat2"),
        Product("Devslopes Hat White","$18","hat3"),
        Product("Devslopes Hat Snapback","$22","hat4"),
    )

    val hoodies = listOf(
        Product("Devslopes Hoodie Gray","$28","hoodie1"),
        Product("Devslopes Hoodie Red","$32","hoodie2"),
        Product("Devslopes  Gray Hoodie","$28","hoodie3"),
        Product("Devslopes Black Hoodie","$32","hoodie4"),
    )

    val shirts = listOf(
        Product("Devslopes Shirt Black","$12","shirts1"),
        Product("Devslopes Badge Light Gray","$13","shirts2"),
        Product("Devslopes  Logo Shirt Red","$14","shirts3"),
        Product("Devslopes Hustle","$15","shirts4"),
        Product("Kickflip Studios","$16","shirts5")

    )
}