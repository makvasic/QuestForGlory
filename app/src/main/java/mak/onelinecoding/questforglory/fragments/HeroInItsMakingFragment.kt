package mak.onelinecoding.questforglory.fragments

import mak.onelinecoding.questforglory.BaseFragment
import mak.onelinecoding.questforglory.R
import mak.onelinecoding.questforglory.model.Description
import mak.onelinecoding.questforglory.model.Page

class HeroInItsMakingFragment : BaseFragment() {
    override val items = listOf(
        Description(
            R.string.hero_in_its_making_description,
            R.drawable.le_wild_dakinsa
        ),
        Page(
            R.id.problemFragment,
            R.string.hero_in_its_making_problem,
            R.drawable.problem_problem
        ),
        Page(
            R.id.clarkGableFragment,
            R.string.hero_in_its_making_clark_gable,
            R.drawable.clark_gable
        )
    )
}