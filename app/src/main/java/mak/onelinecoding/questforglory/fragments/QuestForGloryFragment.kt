package mak.onelinecoding.questforglory.fragments

import mak.onelinecoding.questforglory.BaseFragment
import mak.onelinecoding.questforglory.R
import mak.onelinecoding.questforglory.model.Description
import mak.onelinecoding.questforglory.model.Page

class QuestForGloryFragment : BaseFragment() {
    override val items = listOf(
        Description(
            R.string.quest_for_glory_description
        ),
        Page(
            R.id.ichigoKurosakiIchigoFragment,
            R.string.quest_for_glory_ichigo_kurosaki_ichigo,
            R.drawable.ichigo_kurosaki_ichigo
        ),
        Page(
            R.id.heroInItsMakingFragment,
            R.string.quest_for_glory_hero_in_its_making,
            R.drawable.hero_in_its_making
        )
    )
}
