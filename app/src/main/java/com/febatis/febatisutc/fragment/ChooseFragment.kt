package com.febatis.febatisutc.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.febatis.febatisutc.R
import kotlinx.android.synthetic.main.fragment_choose.*


class ChooseFragment(
    val title: String,
    val btn1Text: String,
    val btn2Text: String,
    val btn1OnClick: View.OnClickListener,
    val btn2OnClick: View.OnClickListener
) : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_choose, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        tv_title.text = title

        btn_1.text = btn1Text
        btn_2.text = btn2Text

        btn_1.setOnClickListener(btn1OnClick)
        btn_2.setOnClickListener(btn2OnClick)

    }

}
