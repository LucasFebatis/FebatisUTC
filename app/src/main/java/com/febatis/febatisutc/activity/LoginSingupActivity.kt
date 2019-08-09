package com.febatis.febatisutc.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.febatis.febatisutc.R
import com.febatis.febatisutc.adapter.TabAdapter
import com.febatis.febatisutc.fragment.LoginFragment
import com.febatis.febatisutc.fragment.SingupFragment
import kotlinx.android.synthetic.main.activity_login_singup.*


class LoginSingupActivity : AppCompatActivity() {

    private var adapter: TabAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_singup)
        setupTabs()
    }

    fun setupTabs() {

        adapter = TabAdapter(supportFragmentManager)
        adapter!!.addFragment(LoginFragment(), "Entrar")
        adapter!!.addFragment(SingupFragment(), "Cadastrar")

        pager.adapter = adapter
        tab_layout.setupWithViewPager(pager)

    }

}
