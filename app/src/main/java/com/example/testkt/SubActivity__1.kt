package com.example.testkt

import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.MediaController
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_sub__1.*

class SubActivity__1 : AppCompatActivity() {

    // private val VIDEO_URL = "http://commondatastorage.googleapis.com/gtv-videos-bucket/sample/BigBuckBunny.mp4"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sub__1)

        Toast.makeText(
            this@SubActivity__1,
            "스크롤 하세요!",
            Toast.LENGTH_LONG
        ).show()

        // 에뮬레이터로 확인하려면 내 프로젝트에 동영상 파일이 있어야 됨
        // raw 폴더에 PC에 있는 동영상 넣어야 됨

        // (VIDEO_URL)로 에러나면 (VIDEO_PATH) 로 수정하고 진행
        var uri: Uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.vid)

        videoView.setVideoURI(uri)
        videoView.setMediaController(MediaController(this))     // 없으면 에러
        videoView.requestFocus()    // 준비하는 과정 미리 진행

        videoView.setOnPreparedListener {
            videoView.start()   // 동영상 재개
        }

        videoView.setOnCompletionListener {
        }

    }
}

