package com.example.edvoraandroidassessment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Spinner
import androidx.recyclerview.widget.LinearLayoutManager




class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val linearLayoutManager = LinearLayoutManager(applicationContext, LinearLayoutManager.HORIZONTAL, false)
//        recyclerView.setLayoutManager(linearLayoutManager)
    }

//    val spinner = findViewById<Spinner>(R.id.spinner)
    val items = arrayOf("500g", "1kg", "2kg")
    val adapter = ArrayAdapter<String>(
        this,
        android.R.layout.simple_spinner_dropdown_item, items)
}
