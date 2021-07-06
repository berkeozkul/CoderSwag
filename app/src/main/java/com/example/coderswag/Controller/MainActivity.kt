package com.example.coderswag.Controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import com.example.coderswag.Adapters.CategoryAdapter
import com.example.coderswag.Model.Category
import com.example.coderswag.R
import com.example.coderswag.Services.DataService

class MainActivity : AppCompatActivity() {
    lateinit var  categorylistview : ListView
    lateinit var  adapter : CategoryAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        categorylistview = findViewById(R.id.CategoryListView)

        adapter = CategoryAdapter(this,DataService.categories)

categorylistview.adapter = adapter

    }
}