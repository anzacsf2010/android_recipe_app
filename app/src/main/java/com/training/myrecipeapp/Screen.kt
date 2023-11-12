package com.training.myrecipeapp

sealed class Screen(val route : String) {
    object RecipeScreen : Screen("recipescreen")
    object DeteailScreen : Screen("detailscreen")
}