package com.example.sample09

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.Toast
import com.example.sample09.databinding.ActivityMainBinding
import java.text.SimpleDateFormat
import java.util.*

class MainActivity : AppCompatActivity()/*, View.OnClickListener*/ {

    val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.btn.setOnClickListener {
            Toast.makeText(this.applicationContext, "버튼 one", Toast.LENGTH_SHORT).show()

            binding.btn2.text = SimpleDateFormat("yyyy-MM-dd kk:mm:ss").format(Date())
        }
        /*
        setContentView(R.layout.activity_main)

        val btn2 = findViewById<Button>(R.id.btn2)
        btn2.setOnClickListener {
            Toast.makeText(this.applicationContext, "버튼2 클릭!", Toast.LENGTH_SHORT).show()
        }
        */
    }

    /*
    override fun onClick(v: View?) {
         when(v?.id){
             R.id.btn->{
                 Log.d("버튼", "클릭")
                 var btn2 = findViewById<Button>(R.id.btn2)

                 //kk : 24시간 형태, hh : 12시 까지 형태
                 btn2.text = SimpleDateFormat("yyyy-MM-dd kk:mm:ss").format(Date())
             }
         }
     }
     */
}