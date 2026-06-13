package com.example.testkt

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.testkt.databinding.ActivitySub3Binding
import kotlinx.android.synthetic.main.activity_sub.*
import kotlinx.android.synthetic.main.activity_sub3.*

class SubActivity3 : AppCompatActivity() {

    //카메라 3대 카메라별로 다른 화면 구성.(웹뷰만 바뀌게끔.)

    private lateinit var binding:ActivitySub3Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivitySub3Binding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.webView.loadUrl("https://www.google.com")

        cam2.setOnClickListener {
            val nextIntent = Intent(this, SubActivity3_1::class.java)
            startActivity(nextIntent)
        }
    }
}