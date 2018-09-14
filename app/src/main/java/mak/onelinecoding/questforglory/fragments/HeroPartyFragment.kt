package mak.onelinecoding.questforglory.fragments

import mak.onelinecoding.questforglory.BaseFragment
import mak.onelinecoding.questforglory.R
import mak.onelinecoding.questforglory.model.Description
import mak.onelinecoding.questforglory.model.Page

class HeroPartyFragment : BaseFragment() {

    override val items = listOf(
        Description(
            R.string.hero_party_description
        ),
        Page(
            R.id.tier2Fragment,
            R.string.hero_party_tier2,
            R.drawable.tier2
        ),
        Page(
            R.id.tier3Fragment,
            R.string.hero_party_tier3,
            R.drawable.tier3
        ),
        Page(
            R.id.dachaTurkishTerrorFragment,
            R.string.hero_party_dacha_turkish_terror,
            R.drawable.dacha_turkish_terror
        )
    )

}