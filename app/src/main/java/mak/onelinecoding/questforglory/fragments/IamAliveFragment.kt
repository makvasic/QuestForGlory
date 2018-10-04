package mak.onelinecoding.questforglory.fragments

import mak.onelinecoding.questforglory.BaseFragment
import mak.onelinecoding.questforglory.R
import mak.onelinecoding.questforglory.model.Description
import mak.onelinecoding.questforglory.model.Page

class IamAliveFragment : BaseFragment() {
    override val items = listOf(
        Description(
            R.string.i_am_alive_description
        ),
        Page(
            R.id.sandCastleFragment,
            R.string.i_am_alive_sand_castle,
            R.drawable.siren
        )
    )
}