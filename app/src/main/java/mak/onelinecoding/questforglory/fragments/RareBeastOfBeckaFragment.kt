package mak.onelinecoding.questforglory.fragments

import mak.onelinecoding.questforglory.BaseFragment
import mak.onelinecoding.questforglory.R
import mak.onelinecoding.questforglory.model.Description
import mak.onelinecoding.questforglory.model.Page

class RareBeastOfBeckaFragment : BaseFragment() {
    override val items = listOf(
        Description(
            R.string.rare_beast_of_becka_description
        ),
        Page(
            R.id.tier2Fragment,
            R.string.rare_beast_of_becka_tier2,
            R.drawable.sinan
        ),
        Page(
            R.id.eatOrBeEatenFragment,
            R.string.rare_beast_of_becka_eat_or_be_eaten,
            R.drawable.pragnje
        )
    )
}