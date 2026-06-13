package com.example.testkt

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity

class homeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        Handler(Looper.getMainLooper()).postDelayed({

            val intent = Intent(this, SubActivity::class.java)
            startActivity(intent)

            finish()

        }, 1300)
    }
}