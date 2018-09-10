package mak.onelinecoding.questforglory

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_ichigo_kurosaki_ichigo.*

class IchigoKurosakiIchigoFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return LayoutInflater.from(context).inflate(R.layout.fragment_ichigo_kurosaki_ichigo, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        problemButton.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.problemFragment)
        )
    }
}