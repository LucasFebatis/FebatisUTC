package com.febatis.febatisutc.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.febatis.febatisutc.R
import kotlinx.android.synthetic.main.activity_fight.*

class FightActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fight)

        val opponentID = intent.getStringExtra("opponentID")

        if(opponentID != null) {
            tv_main_msg.text = opponentID
        } else {
            tv_main_msg.text = "The Fast Fight"
        }

    }
}
