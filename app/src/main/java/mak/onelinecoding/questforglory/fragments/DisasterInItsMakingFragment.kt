package mak.onelinecoding.questforglory.fragments

import mak.onelinecoding.questforglory.BaseFragment
import mak.onelinecoding.questforglory.R
import mak.onelinecoding.questforglory.model.Description
import mak.onelinecoding.questforglory.model.Page

class DisasterInItsMakingFragment : BaseFragment() {
    override val items = listOf(
        Description(
            R.string.disaster_in_its_making_description
        ),
        Page(
            R.id.wheelOfTimeFragment,
            R.string.disaster_in_its_making_wheel_of_time,
            R.drawable.karate_kid
        )
    )
}

