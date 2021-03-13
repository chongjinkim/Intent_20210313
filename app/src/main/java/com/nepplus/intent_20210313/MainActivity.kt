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

        moveToSecondBtn.setOnClickListener {

            val inputMessage = messageEdit.text.toString()
//            화면 이동은 그대로 -> intent 사용법은 그대로

            val myIntent = Intent(this, MySecondActivity::class.java)

//            티켓에 => 데이터 추가기록
//            꼬리표를 붙여서 데이터를 달아준다

            myIntent.putExtra("message", inputMessage)

            startActivity(myIntent)
        }

        editNickBtn.setOnClickListener {

            val myIntent = Intent(this, EditNicknameActivity::class.java)

        }
    }
}