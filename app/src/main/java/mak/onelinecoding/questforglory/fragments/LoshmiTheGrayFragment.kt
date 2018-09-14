package mak.onelinecoding.questforglory.fragments

import android.support.v4.app.Fragment
import mak.onelinecoding.questforglory.BaseFragment
import mak.onelinecoding.questforglory.R
import mak.onelinecoding.questforglory.model.Description
import mak.onelinecoding.questforglory.model.Page

class LoshmiTheGrayFragment : BaseFragment() {

    override val items = listOf(
        Description(
            R.string.loshmi_the_gray_description
        ),
        Page(
            R.id.soothsayerFragment,
            R.string.loshmi_the_gray_soothsayer,
            R.drawable.soothsayer
        ),
        Page(
            R.id.bridgeOfDoomFragment,
            R.string.loshmi_the_gray_bridge_of_doom,
            R.drawable.bridge_of_doom
        )
    )
}