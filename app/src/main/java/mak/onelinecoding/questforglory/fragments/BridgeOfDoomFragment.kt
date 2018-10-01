package mak.onelinecoding.questforglory.fragments

import mak.onelinecoding.questforglory.BaseFragment
import mak.onelinecoding.questforglory.R
import mak.onelinecoding.questforglory.model.Description
import mak.onelinecoding.questforglory.model.Page

class BridgeOfDoomFragment : BaseFragment() {
    override val items = listOf(
        Description(
            R.string.bridge_of_doom_description
        ),
        Page(
            R.id.rareBeastOfBeckaFragment,
            R.string.bridge_of_doom_rare_beast_of_becka,
            R.drawable.becka
        ),
        Page(
            R.id.hatoriHanzoFragment,
            R.string.bridge_of_doom_hatori_hanzo,
            R.drawable.komamura
        )
    )
}