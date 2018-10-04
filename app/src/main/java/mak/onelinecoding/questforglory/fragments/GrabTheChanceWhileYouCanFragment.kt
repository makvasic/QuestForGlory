package mak.onelinecoding.questforglory.fragments

import mak.onelinecoding.questforglory.BaseFragment
import mak.onelinecoding.questforglory.R
import mak.onelinecoding.questforglory.model.Description
import mak.onelinecoding.questforglory.model.Page

class GrabTheChanceWhileYouCanFragment : BaseFragment() {
    override val items = listOf(
        Description(
            R.string.grab_the_chance_description
        ),
        Page(
            R.id.sandCastleFragment,
            R.string.grab_the_chance_sand_castle,
            R.drawable.bussinesman
        )
    )
}