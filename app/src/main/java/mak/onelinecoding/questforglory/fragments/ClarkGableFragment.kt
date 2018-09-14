package mak.onelinecoding.questforglory.fragments

import mak.onelinecoding.questforglory.BaseFragment
import mak.onelinecoding.questforglory.R
import mak.onelinecoding.questforglory.model.Description
import mak.onelinecoding.questforglory.model.Page

class ClarkGableFragment : BaseFragment() {

    override val items = listOf(
        Description(
            R.string.clark_gable_description
        ),
        Page(
            R.id.sandCastleFragment,
            R.string.clark_gable_send_castle,
            R.drawable.sand_castle
        ),
        Page(
            R.id.heroPartyFragment,
            R.string.clark_gable_hero_party,
            R.drawable.hero_party
        ),
        Page(
            R.id.loshmiTheGrayFragment,
            R.string.clark_gable_loshmi_the_gray,
            R.drawable.loshmi_the_gray
        )
    )
}