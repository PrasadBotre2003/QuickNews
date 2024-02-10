package com.loc.newsapp.presentation.Onbording

import androidx.annotation.DrawableRes
import com.loc.newsapp.R

data class Page(val title:String
                ,val description :String,
                @DrawableRes val image :Int)
val pages = listOf(

    Page(
        title = "Lorem Ipsum is simly dummy",
        description = "Lorem Ipsum is simly dummy Lorem Ipsum is simly dummy",
        image = R.drawable.onboarding1
    ),
    Page(
        title = "Lorem Ipsum is simly dummy",
        description = "Lorem Ipsum is simly dummy Lorem Ipsum is simly dummy",
        image = R.drawable.onboarding2
    ),
    Page(
        title = "Lorem Ipsum is simly dummy",
        description = "Lorem Ipsum is simly dummy Lorem Ipsum is simly dummy",
        image = R.drawable.onboarding3
    )
)