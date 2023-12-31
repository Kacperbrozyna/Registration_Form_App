package com.kacperbrozyna.registraationformapp

import java.io.Serializable

data class User(

    val title: String,
    val firstName: String,
    val lastName: String,
    val email: String,
    val phone: String,
    val password: String
) : Serializable {
    fun getFullname() = "$title $firstName $lastName"
}