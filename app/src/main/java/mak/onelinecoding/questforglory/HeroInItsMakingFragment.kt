package mak.onelinecoding.questforglory

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_hero_in_its_making.*

class HeroInItsMakingFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return LayoutInflater.from(context).inflate(R.layout.fragment_hero_in_its_making, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        problemButton.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.problemFragment)
        )

       clarkGableButton.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.clarkGableFragment)
        )
    }
}