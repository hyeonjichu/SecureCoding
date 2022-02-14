package com.example.sample34

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editName = findViewById<EditText>(R.id.editName)
        val editCnt = findViewById<EditText>(R.id.editCnt)
        val editLevel = findViewById<EditText>(R.id.editLevel)
        val move = findViewById<Button>(R.id.move)

        move.setOnClickListener {
            var student = Student(editName.text.toString(), editCnt.text.toString().toInt(), editLevel.text.toString())
            
            //이동 준비
            val nextIntent = Intent(this, SecondActivity::class.java)
            
            //짐싸
            nextIntent.putExtra("student", student)
            
            //이동
            startActivity(nextIntent)
        }
    }
}