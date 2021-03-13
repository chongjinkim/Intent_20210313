package com.nepplus.intent_20210313

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val REQ_FOR_NICKNAME = 1001

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
            startActivityForResult(myIntent, REQ_FOR_NICKNAME)

        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)


//         이 함수가 실행된 이유가 => 닉네임을 가지러 다녀온 게 맞는지? 확인

        if (requestCode == REQ_FOR_NICKNAME){

//            ok를 누른게 맞는지? 아닌지?
            if(resultCode == Activity.RESULT_OK){

//                첨부해서 데이터 => (data변수) 를 받아서 텍스트 뷰에 반영

                val newNickname = data?.getStringExtra("nick")

                nicknameTxt.text = newNickname

            }
        }

    }
}