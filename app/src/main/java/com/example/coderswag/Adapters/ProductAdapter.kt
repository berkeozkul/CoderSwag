package com.example.coderswag.Adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.coderswag.Model.Product
import com.example.coderswag.R

class ProductAdapter(val context: Context, val products : List<Product>) :RecyclerView.Adapter<ProductAdapter.ProductHolder>() {

    inner class ProductHolder(itemView: View?) : RecyclerView.ViewHolder(itemView!!) {
        val productImage = itemView?.findViewById<ImageView>(R.id.productimage)
        val productName = itemView?.findViewById<TextView>(R.id.productname)
        val productprice = itemView?.findViewById<TextView>(R.id.productprice)

        fun bindProduct(product :Product,context: Context){


            productImage?.setImageResource(product.image)
            productName?.text=product.title
            productprice?.text=product.price
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.product_list_item,parent,false)
        return  ProductHolder(view)
    }

    override fun onBindViewHolder(holder: ProductHolder, position: Int) {
holder?.bindProduct(products[position],context)    }

    override fun getItemCount(): Int {
return products.count()    }
}