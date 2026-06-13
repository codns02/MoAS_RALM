package com.example.testkt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_sub1.*
import java.io.DataInputStream
import java.io.DataOutputStream
import java.net.Socket

class SubActivity1 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sub1)

        var img1 = R.drawable.fail
        var img2 = R.drawable.success
        var A = 0

        sendMsgBtn.setOnClickListener {
            if (A == 0){
                A += 1
                fail_view.setImageResource(img2)
                sendMsgBtn.setText("연결 끊기")
                Toast.makeText(
                    this@SubActivity1,
                    "연결 성공!",
                    Toast.LENGTH_SHORT
                ).show()
            }
            else{
                A -= 1
                fail_view.setImageResource(img1)
                sendMsgBtn.setText("연결 하기")
                Toast.makeText(
                    this@SubActivity1,
                    "연결 해제 완료!",
                    Toast.LENGTH_SHORT
                ).show()
            }
        }
        // 44~84 line = 서버 열려있어야만 오류 안남. 서버 안 열려 있을때는 주석처리 해놓고 진행.
        // ClientThread().start()
    }

    /*class ClientThread : Thread() {
        override fun run() {
            var socket = Socket("192.168.0.2", 80)
            val input = socket.getInputStream() //읽기
            System.out.println("Connected success")
            val output = socket.getOutputStream() //쓰기

            System.out.println(input)
            System.out.println(output)
            System.out.println("io no problem")

            val dataInputStream = DataInputStream(input)
            val dataOutputStream = DataOutputStream(output)
            println(dataInputStream)
            System.out.println(dataOutputStream)
            System.out.println("Stream working")

            //받기
            var recv = dataInputStream.readByte()
            var answer = recv.toUByte()
            var last = answer.toInt()
            System.out.println("Read success")
            System.out.println(last)

            if (last == 255) {
                //쓰기
                val dataOutputstream = DataOutputStream(output)
                var s = "MOBILE"

                fun senddata(data: String) {
                    dataOutputstream.write(
                        (data).toByteArray(Charsets.UTF_8)
                    )
                }
                senddata(s)
            }
        }
     }*/
}