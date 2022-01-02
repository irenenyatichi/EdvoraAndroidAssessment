package com.example.edvoraandroidassessment.API

import com.example.edvoraandroidassessment.Models.Details
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiInterface {

    //        Fetches the Product Name
    @GET("?product_name=")
    fun getProductName(): Call<List<Details>>

    //        Fetches the Brand Name
    @GET("?brand_name=")
    fun getBrandName(): Call<List<Details>>

    //        Fetches the Product Price
    @GET("?price=")
    fun getProductPrice(): Call<List<Details>>

    //        Fetches the Product Location
    @GET("?address=")
    fun getProductLocation(): Call<List<Details>>

    //        Fetches the Product Description
    @GET("?discription=")
    fun getProductDescription(): Call<List<Details>>

    //        Fetches the Product Date
    @GET("?date=")
    fun getProductDate(): Call<List<Details>>

    //        Fetches the Product Image
    @GET("?image")
    fun getProductImages(): Call<List<Details>>

}