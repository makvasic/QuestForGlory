package mak.onelinecoding.questforglory.fragments

import mak.onelinecoding.questforglory.BaseFragment
import mak.onelinecoding.questforglory.R
import mak.onelinecoding.questforglory.model.Description
import mak.onelinecoding.questforglory.model.Page

class HunterOrPreyFragment : BaseFragment() {
    override val items = listOf(
        Description(
            R.string.hunter_or_pray_description
        ),
        Page(
            R.id.wheelOfTimeFragment,
            R.string.hunter_or_pray_wheel_of_time,
            R.drawable.fail
        )
    )
}