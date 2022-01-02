package com.example.edvoraandroidassessment.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.edvoraandroidassessment.Models.Details
import com.example.edvoraandroidassessment.R
import java.lang.reflect.Constructor

class CardAdapter(private val data : List<Details>): RecyclerView.Adapter<CardAdapter.ViewHolder>() {

    private val item: MutableList<CardView>

    init { this.item = ArrayList() }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardAdapter.ViewHolder {
        val a = LayoutInflater.from(parent.context)
            .inflate(R.layout.cards, parent, false)
        return ViewHolder(a)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val video = data.size.javaClass
        holder.tvProductName.text = data[position].product_name
        holder.tvBrandName.text = data[position].brand_name
        holder.tvCost.text = data[position].price
        holder.tvDate.text = data[position].dateTime
        holder.tvLocation.text = data[position].address
        holder.tvDescription.text = data[position].description
    }

    override fun getItemCount(): Int {
        return data.count()
    }

    inner class ViewHolder
    internal constructor(
        itemView: View
    ) : RecyclerView.ViewHolder(itemView) {
        var tvProductName: TextView = itemView.findViewWithTag("@+id/tvProductName")
        var tvBrandName: TextView = itemView.findViewWithTag("@+id/tvBrandName")
        var tvDollar: TextView = itemView.findViewWithTag("@+id/tvDollar")
        var tvCost: TextView = itemView.findViewWithTag("@+id/tvCost")
        var tvDate: TextView = itemView.findViewWithTag("@+id/tvDate")
        var tvLocation: TextView = itemView.findViewWithTag("@+id/tvLocation")
        var tvDescription: TextView = itemView.findViewWithTag("@+id/tvDescription")
    }
}