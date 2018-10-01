package mak.onelinecoding.questforglory.fragments

import mak.onelinecoding.questforglory.BaseFragment
import mak.onelinecoding.questforglory.R
import mak.onelinecoding.questforglory.model.Description
import mak.onelinecoding.questforglory.model.Page

class DoOrBeDoneFragment : BaseFragment() {
    override val items = listOf(
        Description(
            R.string.do_or_be_done_description
        ),
        Page(
            R.id.wheelOfTimeFragment,
            R.string.do_or_be_done_run_to_the_hills,
            R.drawable.brave_sir_robin
        )
    )
}