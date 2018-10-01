package mak.onelinecoding.questforglory.fragments

import mak.onelinecoding.questforglory.BaseFragment
import mak.onelinecoding.questforglory.R
import mak.onelinecoding.questforglory.model.Description
import mak.onelinecoding.questforglory.model.Page

class DifferentTastesFragment : BaseFragment() {
    override val items = listOf(
        Description(
            R.string.different_tastes_description
        ),
        Page(
            R.id.sandCastleFragment,
            R.string.different_tastes_sand_castle,
            R.drawable.horatio
        )
    )
}