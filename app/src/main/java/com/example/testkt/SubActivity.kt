package com.example.testkt

import android.content.Intent
import android.graphics.BitmapFactory
import android.os.BatteryManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Button
import androidx.core.app.ActivityCompat
import androidx.core.view.GravityCompat
import com.google.android.material.navigation.NavigationView
import kotlinx.android.synthetic.main.activity_home.*
import kotlinx.android.synthetic.main.activity_sub.*
import java.io.*
import java.net.Socket

class SubActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sub)

        supportActionBar?.setDisplayShowTitleEnabled(false)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        // MoAS 팀원소개
        txtbtn.setOnClickListener {
            val nextIntent = Intent(this, SubActivity_1::class.java)
            startActivity(nextIntent)
        }

        // 서버 통신
        homebtn1.setOnClickListener {
            val nextIntent = Intent(this, SubActivity1::class.java)
            startActivity(nextIntent)
        }

        // 물품 확인
        homebtn2.setOnClickListener {
            val nextIntent = Intent(this, SubActivity2::class.java)
            startActivity(nextIntent)
        }

        // AGV 맵내 움직임
        homebtn3.setOnClickListener {
            val nextIntent = Intent(this, SubActivity3::class.java)
            startActivity(nextIntent)
        }

        // 실시간 스트리밍
        homebtn4.setOnClickListener {
            val nextIntent = Intent(this, SubActivity4::class.java)
            startActivity(nextIntent)
        }

            // 네비 실행
            btn_navi.setOnClickListener {
                layout_drawer.openDrawer(GravityCompat.START)
                naviView.setNavigationItemSelectedListener(this)
            }
        }

    // 네비게이션 드로우 메뉴
    override fun onNavigationItemSelected(item: MenuItem): Boolean {

        when (item.itemId) {

            // 팀원소개
            R.id.menu1 -> {
                val intent = Intent(this, SubActivity_1::class.java)
                startActivity(intent)
            }

            // 작품소개
            R.id.menu2 -> {
                val intent = Intent(this, SubActivity__1::class.java)
                startActivity(intent)
            }

            // 동아리소개
            R.id.menu3 -> {
                val intent = Intent(this, SubActivity_menu::class.java)
                startActivity(intent)
            }


        }
        layout_drawer.closeDrawers() //네비게이션 뷰 닫기
        return false
    }
    //백버튼을 눌렀을 때 수행하는 메소드
    override fun onBackPressed() {

        if(layout_drawer.isDrawerOpen(GravityCompat.START)){
            layout_drawer.closeDrawers()
        }
        else{
            //super.onBackPressed() //일반 백버튼 실행
            ActivityCompat.finishAffinity(this); // 액티비티를 종료하고
            System.exit(0); // 프로세스를 종료
        }
    }
}