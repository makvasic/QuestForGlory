package mak.onelinecoding.questforglory

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_sand_castle.*

class SandCastleFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return LayoutInflater.from(context).inflate(R.layout.fragment_sand_castle, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        questForGloryButton.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.mainFragment)
        )
    }
}