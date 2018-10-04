package mak.onelinecoding.questforglory.fragments

import mak.onelinecoding.questforglory.BaseFragment
import mak.onelinecoding.questforglory.R
import mak.onelinecoding.questforglory.model.Description
import mak.onelinecoding.questforglory.model.Page

class HatoriHanzoFragment : BaseFragment() {
    override val items = listOf(
        Description(
            R.string.hatori_hanzo_description
        ),
        Page(
            R.id.aleaLactaEstFragment,
            R.string.hatori_hanzo_alea_iacta_est,
            R.drawable.milka_slagalica
        ),
        Page(
            R.id.disasterInItsMakingFragment,
            R.string.hatori_hanzo_disaster_in_its_making,
            R.drawable.komamura_bleach_game
        )
    )
}