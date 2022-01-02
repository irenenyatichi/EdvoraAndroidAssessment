package com.example.edvoraandroidassessment

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.edvoraandroidassessment.Adapter.CardAdapter
import com.example.edvoraandroidassessment.Models.Details
import java.util.ArrayList


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val data :MutableList<Details> = ArrayList()
//        To scroll to the tenth card
        for (i in 1..10)
//            Those cards should have the following information as listed in the Data Object.
//            $1 refers to the first data
            data.add(Details("$1", "$1","$1", "$1","$1",
                    "$1","$1"))
//                product_name = String(), brand_name = String(), price = Int.MAX_VALUE,
//                address = String(), description = String(), dateTime = String(), image = String()))
        val layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)

        val adapter = CardAdapter(data)
        var list :RecyclerView = findViewById(R.id.rvList)
        list.adapter = adapter
        list.layoutManager = layoutManager
    }
}