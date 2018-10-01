package mak.onelinecoding.questforglory.fragments

import mak.onelinecoding.questforglory.BaseFragment
import mak.onelinecoding.questforglory.R
import mak.onelinecoding.questforglory.model.Description
import mak.onelinecoding.questforglory.model.Page

class EatOrBeEatenFragment : BaseFragment() {
    override val items = listOf(
        Description(
            R.string.eat_or_be_eaten_description
        ),
        Page(
            R.id.hunterOrPreyFragment,
            R.string.eat_or_be_eaten_hunter_or_pray,
            R.drawable.hunter_prey
        ),
        Page(
            R.id.soloMidFragment,
            R.string.eat_or_be_eaten_solo_mid,
            R.drawable.solo_mid
        )
    )
}