package mak.onelinecoding.questforglory

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_main.*

class LoshmiTheGrayFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return LayoutInflater.from(context).inflate(R.layout.fragment_loshmi_the_gray, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        ichigoKurosakiIchigoButton.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.ichigoKurosakiIchigoFragment)
        )

        heroInItsMakingButton.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.heroInItsMakingFragment)
        )
    }
}