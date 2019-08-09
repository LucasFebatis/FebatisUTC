package com.febatis.febatisutc.fragment

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.febatis.febatisutc.R
import com.febatis.febatisutc.activity.AddTrocadilhoActivity
import kotlinx.android.synthetic.main.fragment_your_trocadilhos.*


class YourTrocadilhosFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_your_trocadilhos, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        floating_action_button.setOnClickListener {
            fabAddCreate()
        }

    }

    fun fabAddCreate() {
        val intent = Intent(context, AddTrocadilhoActivity::class.java)
        startActivity(intent)
    }

}
