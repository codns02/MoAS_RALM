package com.example.testkt

import android.content.Intent
import android.graphics.Paint
import android.net.Uri
import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import androidx.appcompat.app.AppCompatActivity
import androidx.core.graphics.toColor
import kotlinx.android.synthetic.main.activity_sub__1.*
import kotlinx.android.synthetic.main.activity_sub_menu.*


class SubActivity_menu : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sub_menu)

        potal.paintFlags = Paint.UNDERLINE_TEXT_FLAG



        potal.setOnClickListener {
            var intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.dongyang.ac.kr/dongyang/index.do"))
            startActivity(intent)
        }






    }
}

