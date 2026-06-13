package com.example.testkt

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_sub.*
import kotlinx.android.synthetic.main.activity_sub_1.*


class SubActivity_1 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sub_1)

        // 김종민
        MoASbtn1.setOnClickListener {
            val nextIntent = Intent(this, SubActivity_1_1::class.java)
            startActivity(nextIntent)
        }

        // 류찬주
        MoASbtn2.setOnClickListener {
            val nextIntent = Intent(this, SubActivity_1_2::class.java)
            startActivity(nextIntent)
        }

        // 이채운
        MoASbtn3.setOnClickListener {
            val nextIntent = Intent(this, SubActivity_1_3::class.java)
            startActivity(nextIntent)
        }

        // 이서준
        MoASbtn4.setOnClickListener {
            val nextIntent = Intent(this, SubActivity_1_4::class.java)
            startActivity(nextIntent)
        }

        // 박지우
        MoASbtn5.setOnClickListener {
            val nextIntent = Intent(this, SubActivity_1_5::class.java)
            startActivity(nextIntent)
        }
    }
}
