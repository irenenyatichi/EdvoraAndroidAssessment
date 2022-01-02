package com.example.edvoraandroidassessment.Models

class CardItems {
    fun getTitle(): String {
        return product_name
    }

    fun setTitle(title: String) {
        this.product_name = productName
    }

    fun getbrand_name(): String? {
        return brand_name
    }

    fun setbrand_name(brand_name: String?) {
        this.brand_name = brand_name
    }

    fun getprice(): String? {
        return price
    }

    fun setprice(price: Int) {
        this.price = price
    }

    fun getaddress(): Int? {
        return address
    }

    fun setaddress(address: String?) {
        this.address = address
    }
    fun getdescription(): String? {
        return description
    }
    fun setdescription(description: String?) {
        this.description = description
    }

    fun getdateTime(): String? {
        return dateTime
    }
    fun setdateTime(dateTime: String?) {
        this.dateTime = dateTime
    }

    fun getimage(): String? {
        return image
    }
    fun setimage(image: String?) {
        this.image = image
    }

}