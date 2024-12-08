package com.sonya.buscket.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.sonya.buscket.R

data class CaruselItem (
    val id: Int,
    @DrawableRes val imgResId: Int,
)

val items =
    listOf(
        CaruselItem(0, R.drawable.pic_img1)
    )