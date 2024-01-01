package com.example.e_commerce_figma_desgin

import android.media.Image
import androidx.compose.foundation.Image
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource


data class CategoryItem(
    val Image: String,
    val tittle:String
)


object DummyData {

    fun getDummyData():List<CategoryItem>{

        return listOf<CategoryItem>(
            CategoryItem(
                Image = "image1"
                , tittle = "Clothes"
            ),
            CategoryItem(
                Image = "image2"
                , tittle = "Shoes"
            ),
            CategoryItem(
                Image = "image3"
                , tittle = "Accesories"
            ),
            CategoryItem(
                Image = "image4"
                , tittle = "SmartPhones"
            ),
            CategoryItem(
                Image = "image1"
                , tittle = "Laptops"
            ),
            CategoryItem(
                Image = "image1"
                , tittle = "Clothes"
            ),
            CategoryItem(
                Image = "image2"
                , tittle = "Shoes"
            ),
            CategoryItem(
                Image = "image3"
                , tittle = "Accesories"
            ),
            CategoryItem(
                Image = "image4"
                , tittle = "SmartPhones"
            ),
            CategoryItem(
                Image = "image1"
                , tittle = "Laptops"
            ),


        )
    }
}


