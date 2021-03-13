package com.nepplus.intent_20210313

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_edit_nickname.*

class EditNicknameActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_nickname)

//  확인 버튼이 눌리면 => 입력한 새 닉네임을 가지고 복귀

        okBtn.setOnClickListener {

//            입력한 닉네임 추출(변수 저장)

            val inputNewNick = nicknameEdit.text.toString()

//            닉네임을 담아주자
            val resultIntent = Intent() // 왕복이므로 출발 / 도착 정보가 필요가 없다 => 데이터 첨부용 인텐트
            resultIntent.putExtra("nick", inputNewNick)

//      ok를 눌렀다고 결과 세팅 + 첨부 데이터는 resultIntent에 있다

            setResult(Activity.RESULT_OK, resultIntent)

//            복귀
            finish()

        }

    }
}