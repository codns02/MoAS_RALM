package com.example.testkt

import android.os.Bundle
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity

import com.example.testkt.databinding.ActivitySub31Binding
import com.example.testkt.databinding.ActivitySub3Binding
import kotlinx.android.synthetic.main.activity_sub3_1.*


class SubActivity3_1 : AppCompatActivity() {

    private lateinit var binding: ActivitySub31Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivitySub31Binding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.webView.loadUrl("https://www.google.com")





        }
    }
