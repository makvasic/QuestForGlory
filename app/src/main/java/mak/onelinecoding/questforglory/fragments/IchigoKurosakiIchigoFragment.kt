package mak.onelinecoding.questforglory.fragments

import mak.onelinecoding.questforglory.BaseFragment
import mak.onelinecoding.questforglory.R
import mak.onelinecoding.questforglory.model.Description
import mak.onelinecoding.questforglory.model.Page

class IchigoKurosakiIchigoFragment : BaseFragment() {

    override val items = listOf(
        Description(
            R.string.ichigo_kurosaki_ichigo_description
        ),
        Page(
            R.id.problemFragment,
            R.string.ichigo_kurosaki_ichigo_problem,
            R.drawable.problem
        )
    )
}