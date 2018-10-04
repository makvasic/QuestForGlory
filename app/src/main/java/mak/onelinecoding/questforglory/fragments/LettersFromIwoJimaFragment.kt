package mak.onelinecoding.questforglory.fragments

import mak.onelinecoding.questforglory.BaseFragment
import mak.onelinecoding.questforglory.R
import mak.onelinecoding.questforglory.model.Description
import mak.onelinecoding.questforglory.model.Page

class LettersFromIwoJimaFragment : BaseFragment() {
    override val items = listOf(
        Description(
            R.string.letters_from_iwo_jima_description
        ),
        Page(
            R.id.savingPrivateRyanFragment,
            R.string.letters_from_iwo_jima_saving_private_ryan,
            R.drawable.private_ryan_movie
        ),
        Page(
            R.id.battleOfHavensFragment,
            R.string.letters_from_iwo_jima_battle_of_heavens,
            R.drawable.battle_of_heavens
        )
    )
}