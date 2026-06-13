package com.example.testkt

import android.animation.ObjectAnimator
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import kotlinx.android.synthetic.main.activity_sub4.*
import kotlinx.coroutines.NonCancellable.start

class SubActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sub4)

        btn.setOnClickListener {

            ObjectAnimator.ofFloat(txt, "translationY", 260f).apply {
                duration = 3000
                start()            // translationX= 오른쪽(왼쪽= -), translationY= 아래쪽(윗쪽= -)
            }

            Handler(Looper.getMainLooper()).postDelayed({

                // 실행할 코드
                ObjectAnimator.ofFloat(txt, "translationX", 700f).apply {
                    duration = 3000
                    start()
                }


            }, 3000)




            }
        }
    }

