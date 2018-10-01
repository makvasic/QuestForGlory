package mak.onelinecoding.questforglory.fragments

import mak.onelinecoding.questforglory.BaseFragment
import mak.onelinecoding.questforglory.R
import mak.onelinecoding.questforglory.model.Description
import mak.onelinecoding.questforglory.model.Page

class DachaTurkishTerrorFragment : BaseFragment() {
    override val items = listOf(
        Description(
            R.string.dacha_turkish_terror_description
        ),
        Page(
            R.id.sandCastleFragment,
            R.string.dacha_turkish_terror_sand_castle,
            R.drawable.ftw
        ),
        Page(
            R.id.wheelOfTimeFragment,
            R.string.dacha_turkish_terror_wheel_of_time,
            R.drawable.wheel_of_time
        )
    )
}
