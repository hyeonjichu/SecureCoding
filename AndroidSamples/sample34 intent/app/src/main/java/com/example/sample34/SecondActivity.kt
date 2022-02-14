package com.example.sample34

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val tv = findViewById<TextView>(R.id.textView)
        val read = findViewById<Button>(R.id.read)
        read.setOnClickListener {
            var student = intent.getParcelableExtra<Student>("student")
            if(student != null){
                tv.text = "${student.name} ${student.count} ${student.level}"
            }
        }
    }
}