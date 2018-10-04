package mak.onelinecoding.questforglory.fragments

import mak.onelinecoding.questforglory.BaseFragment
import mak.onelinecoding.questforglory.R
import mak.onelinecoding.questforglory.model.Description
import mak.onelinecoding.questforglory.model.Page

class GoranPervySageFragment : BaseFragment() {
    override val items = listOf(
        Description(
            R.string.goran_the_pervy_sage_description
        ),
        Page(
            R.id.boysWillBeBoysFragment,
            R.string.goran_the_pervy_sage_boys_will_be_boys,
            R.drawable.boys_will_be_boys
        ),
        Page(
            R.id.lettersFromIwoJimaFragment,
            R.string.goran_the_pervy_sage_iwo_jima,
            R.drawable.iwo_jima
        )
    )
}