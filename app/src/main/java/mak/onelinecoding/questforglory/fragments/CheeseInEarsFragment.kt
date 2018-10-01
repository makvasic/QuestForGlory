package mak.onelinecoding.questforglory.fragments

import mak.onelinecoding.questforglory.BaseFragment
import mak.onelinecoding.questforglory.R
import mak.onelinecoding.questforglory.model.Description
import mak.onelinecoding.questforglory.model.Page

class CheeseInEarsFragment : BaseFragment() {
    override val items = listOf(
        Description(
            R.string.cheese_in_ears_description
        ),
        Page(
            R.id.iamAliveFragment,
            R.string.cheese_in_ears_i_am_alive,
            R.drawable.survived
        ),
        Page(
            R.id.thisIsTheEndMyFriendFragment,
            R.string.cheese_in_ears_this_is_the_end,
            R.drawable.this_is_the_end
        )
    )
}