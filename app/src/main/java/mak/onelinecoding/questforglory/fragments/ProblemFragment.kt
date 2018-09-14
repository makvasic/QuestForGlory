package mak.onelinecoding.questforglory.fragments

import mak.onelinecoding.questforglory.BaseFragment
import mak.onelinecoding.questforglory.R
import mak.onelinecoding.questforglory.model.Description
import mak.onelinecoding.questforglory.model.Page

class ProblemFragment : BaseFragment() {

    override val items = listOf(
        Description(
            R.string.problem_description
        ),
        Page(
            R.id.questForGloryFragment,
            R.string.problem_quest_for_glory,
            R.drawable.problem_relax
        )
    )
}