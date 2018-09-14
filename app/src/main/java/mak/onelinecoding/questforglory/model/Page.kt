package mak.onelinecoding.questforglory.model

import android.support.annotation.DrawableRes
import android.support.annotation.IdRes
import android.support.annotation.StringRes

data class Page(
    @IdRes val id: Int,
    @StringRes val text: Int,
    @DrawableRes val image: Int
) : RecyclerViewItem