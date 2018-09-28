package mak.onelinecoding.questforglory.fragments

import mak.onelinecoding.questforglory.BaseFragment
import mak.onelinecoding.questforglory.R
import mak.onelinecoding.questforglory.model.Description
import mak.onelinecoding.questforglory.model.Page

class BattleOfHavensFragment : BaseFragment() {
    override val items = listOf(
        Description(
            R.string.battle_of_heavens_description
        ),
        Page(
            R.id.problemFragment,
            R.string.battle_of_heavens_wheel_of_time,
            R.drawable.snowman
        )
    )
}