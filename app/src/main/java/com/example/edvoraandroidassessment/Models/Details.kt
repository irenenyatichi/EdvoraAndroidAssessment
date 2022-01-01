package com.example.edvoraandroidassessment.Models

import android.media.Image
import java.time.chrono.ChronoLocalDateTime

data class Details (
    var product_name: String,
    var brand_name: String,
    var price: Int,
    var address: String,
    var description: String,
    var dateTime: String?,
    var image: String?,
)