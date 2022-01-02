package com.example.edvoraandroidassessment

import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.edvoraandroidassessment.API.ApiClient
import com.example.edvoraandroidassessment.API.ApiInterface
import com.example.edvoraandroidassessment.Adapter.CardAdapter
import com.example.edvoraandroidassessment.Models.Details
import com.google.gson.GsonBuilder
import okhttp3.OkHttpClient
import okhttp3.Request
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.io.IOException
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
        getDetails()
    }

    fun getDetails() {
        val url = "https://assessment-edvora.herokuapp.com"
        val retrofit = ApiClient.buildApiClient(ApiInterface::class.java)
        val request = Request.Builder().url(url).build()
        val client = OkHttpClient()
        with(client) {
            newCall(request).enqueue(object : okhttp3.Callback {
                override fun onFailure(call: okhttp3.Call, e: IOException) { println("Failed to Execute Request") }

                override fun onResponse(call: okhttp3.Call, response: okhttp3.Response) {
                    val body = response.body.toString()
                    println(body)

                    val gson = GsonBuilder().create()

                    val feed = gson.fromJson(body, cardDetails::class.java)
                }
            })
        }
    }
}
class cardDetails(val card: List<Details>)