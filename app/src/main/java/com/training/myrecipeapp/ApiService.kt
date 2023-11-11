package com.training.myrecipeapp

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

private const val baseUrl = "https://www.themealdb.com/api/json/v1/1/"

private val retrofit = Retrofit.Builder().baseUrl(baseUrl)
    .addConverterFactory(GsonConverterFactory.create())
    .build()

val recipeService = retrofit.create(ApiService::class.java)

interface ApiService {
    @GET("categories.php")
    suspend fun getCategories() : CategoriesResponse
}