package com.training.myrecipeapp

data class Category (
    var idCategory : String,
    var strCategory : String,
    var strCategoryThumb : String,
    var strCategoryDescription : String
)

data class CategoriesResponse (
    val categories : List<Category>
)