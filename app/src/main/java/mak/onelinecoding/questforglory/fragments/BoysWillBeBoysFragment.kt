package mak.onelinecoding.questforglory.fragments

import mak.onelinecoding.questforglory.BaseFragment
import mak.onelinecoding.questforglory.R
import mak.onelinecoding.questforglory.model.Description
import mak.onelinecoding.questforglory.model.Page

class BoysWillBeBoysFragment : BaseFragment() {
    override val items = listOf(
        Description(
            R.string.boys_will_be_boys_description
        ),
        Page(
            R.id.differentTastesFragment,
            R.string.boys_will_be_boys_different_tastes,
            R.drawable.tastes_like_grandma
        ),
        Page(
            R.id.grabTheChanceWhileYouCanFragment,
            R.string.boys_will_be_boys_grab_the_chance,
            R.drawable.grab_the_chance
        )
    )
}