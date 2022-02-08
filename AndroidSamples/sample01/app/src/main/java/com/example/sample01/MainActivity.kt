package com.example.sample01

import android.content.ContentValues
import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.example.sample01.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    // #1 객체화를 시켜줌 => 접근하기 유용함
    // => setContentView(R.layout.activity_main) 이거 사용 안해도 됨
    //setContentView(binding.root) => 이거 사용
     val binding by  lazy { ActivityMainBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        
        /*
        // #1
        setContentView(binding.root)    //setContentView(R.layout.activity_main) 이거 대신 사용

        binding.btnSay.setOnClickListener{
            Log.i(ContentValues.TAG, "btnSay click!!")
            println("btnSay click")

            binding.textSay.text = "hello android!"
        }*/

        // #2
        setContentView(R.layout.activity_main)
        
        val textSay = findViewById<TextView>(R.id.textSay)
        val btnSay = findViewById<Button>(R.id.btnSay)

        btnSay.setOnClickListener{
            textSay.text = "Android World!"

            //Toast
            val toast = Toast.makeText(this.applicationContext, "버튼 클릭", Toast.LENGTH_SHORT)
            toast.show()

            //AlertDialog
            AlertDialog.Builder(this@MainActivity)
                .setTitle("welcome")
                .setMessage("어서오세요!")
                .setCancelable(false)
                .setNeutralButton("닫기", DialogInterface.OnClickListener{ dialog, which ->
                    //닫기버튼을 클릭시!
                }).show()
        }
        
        Log.i(ContentValues.TAG, "onCreate 실행")
    }

    override fun onStart() {
        super.onStart()
        Log.i(ContentValues.TAG, "onStart 실행")
    }

    override fun onResume() {
        super.onResume()
        Log.i(ContentValues.TAG, "onResume 실행")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i(ContentValues.TAG, "onRestart 실행")
    }

    override fun onPause() {
        super.onPause()
        Log.i(ContentValues.TAG, "onPause 실행")
    }

    override fun onStop() {
        super.onStop()
        Log.i(ContentValues.TAG, "onStop 실행")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i(ContentValues.TAG, "onDestroy 실행")
    }
}