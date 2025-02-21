package mak.onelinecoding.questforglory.fragments

import mak.onelinecoding.questforglory.BaseFragment
import mak.onelinecoding.questforglory.R
import mak.onelinecoding.questforglory.model.Description
import mak.onelinecoding.questforglory.model.Page

class AleaLactaEstFragment : BaseFragment() {
    override val items = listOf(
        Description(
            R.string.alea_lacta_est_description
        ),
        Page(
            R.id.problemFragment,
            R.string.alea_lacta_est_problem,
            R.drawable.asocijacije
        )
    )
}