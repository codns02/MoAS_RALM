package com.example.testkt

import android.app.ActivityOptions
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Pair
import kotlinx.android.synthetic.main.activity_sub2.*

class SubActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sub2)

        main_card.setOnClickListener {
            val intent = Intent(this, SubActivity2_1::class.java)

            var options: ActivityOptions = ActivityOptions.makeSceneTransitionAnimation(
                this,
                android.util.Pair.create(name_txt, "nameTransition"),
                )
            startActivity(intent, options.toBundle())
            }
        }
    }