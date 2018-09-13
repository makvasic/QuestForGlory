package mak.onelinecoding.questforglory

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_clark_gable.*
import kotlinx.android.synthetic.main.fragment_main.*

class HeroPartyFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return LayoutInflater.from(context).inflate(R.layout.fragment_hero_party, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
//        sendCasteButton.setOnClickListener(
//            Navigation.createNavigateOnClickListener(R.id.sandCastleFragment)
//        )
//
//        heroPartyButton.setOnClickListener(
//            Navigation.createNavigateOnClickListener(R.id.heroPartyFragment)
//        )
//
//        loshmiTheGreatButton.setOnClickListener(
//            Navigation.createNavigateOnClickListener(R.id.loshmiTheGreatFragment)
//        )
    }
}