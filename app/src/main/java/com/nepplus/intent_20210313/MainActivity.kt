package com.nepplus.intent_20210313

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        moveToFirstButton.setOnClickListener {


//           출발지/목적지 정보 : 비행기 티켓 발권

            val myIntent = Intent(this, MyFirstActivity::class.java)

//            출발지
            startActivity(myIntent)


        }
    }
}