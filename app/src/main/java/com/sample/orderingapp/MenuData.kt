package com.sample.orderingapp

import android.graphics.Bitmap
import android.media.Image
import androidx.compose.foundation.Image
data class MenuItem (
    val name: String,
    val price: String,
    val image: Bitmap?,
    val description: String?,
    val unit: String,
    val number: Int,
    val discount: Double)

data class SubCategory(
    val name: String?,
    val items: List<MenuItem>,
    val note: String?
)

data class MenuCategory(
    val categoryName: String,
    val items: List<SubCategory>,
    val note: String?
)
data class Menu(
    val categories: List<MenuCategory>
)
