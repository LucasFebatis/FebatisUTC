package com.febatis.febatisutc.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import androidx.fragment.app.Fragment
import com.febatis.febatisutc.R
import com.febatis.febatisutc.fragment.ChooseFragment
import com.febatis.febatisutc.fragment.PerfilFragment
import com.febatis.febatisutc.fragment.YourTrocadilhosFragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), BottomNavigationView.OnNavigationItemSelectedListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bottom_nav_view.setOnNavigationItemSelectedListener(this)
        bottom_nav_view.selectedItemId = R.id.nav_fight

    }

    fun trocaFragmento(fragment: Fragment) {
        supportFragmentManager
            .beginTransaction()
            .setCustomAnimations(android.R.anim.fade_in, android.R.anim.fade_out)
            .replace(R.id.rl_container, fragment, "MainActivity")
            .commit()
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {

        val fragmento: Fragment

        when(item.itemId) {
            R.id.nav_fight -> {
                fragmento = ChooseFragment("Choose the mode", "Fast Fight", "The Fight",
                    View.OnClickListener {
                        val intent = Intent(applicationContext, FightActivity::class.java)
                        startActivity(intent)
                    },
                    View.OnClickListener {
                        val intent = Intent(applicationContext, OpponentRequestActivity::class.java)
                        startActivity(intent)
                    })
            }
            R.id.nav_perfil -> {
                fragmento = PerfilFragment()
            }
            else -> {
                fragmento = YourTrocadilhosFragment()
            }
        }

        trocaFragmento(fragmento)

        return true
    }
}
