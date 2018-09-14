package mak.onelinecoding.questforglory.model

import android.support.annotation.DrawableRes
import android.support.annotation.StringRes
import mak.onelinecoding.questforglory.model.RecyclerViewItem

data class Description (
    @StringRes val text: Int,
    @DrawableRes val image: Int = 0
): RecyclerViewItem