package com.example.a25172022051_mad_practical_7

import java.io.Serializable

class Person(
    var id:String,
    var name:String,
    var emailId:String,
    var phoneNo:String,
    var address:String,
    var latitude:Double,
    var longitude:Double
): Serializable
