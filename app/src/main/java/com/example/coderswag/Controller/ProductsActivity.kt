package com.example.coderswag.Controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.coderswag.Adapters.ProductAdapter
import com.example.coderswag.R
import com.example.coderswag.Services.DataService
import com.example.coderswag.Utilities.EXTRA_CATEGORY

class ProductsActivity : AppCompatActivity() {
    lateinit var productrcycleview : RecyclerView
    lateinit var categorytype : String
    lateinit var adapter : ProductAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_products)

        productrcycleview = findViewById(R.id.productRecyclerView)
        categorytype = intent.getStringExtra(EXTRA_CATEGORY).toString()
        adapter = ProductAdapter(this,DataService.getProducts(categorytype))

        val layoutManager = GridLayoutManager(this,2)
        productrcycleview.layoutManager =layoutManager
        productrcycleview.adapter =adapter

    }
}