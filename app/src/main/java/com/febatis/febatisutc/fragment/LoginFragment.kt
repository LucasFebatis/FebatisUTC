package com.febatis.febatisutc.fragment

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.febatis.febatisutc.R
import com.febatis.febatisutc.activity.MainActivity
import kotlinx.android.synthetic.main.fragment_login.*


class LoginFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_login, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btn_entrar.setOnClickListener {
            btnEntrarOnClick()
        }

    }

    fun btnEntrarOnClick() {
        goToMainActivity()
    }

    fun goToMainActivity() {
        val intent = Intent(context, MainActivity::class.java)
        startActivity(intent)
    }

}
