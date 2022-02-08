package com.example.hw_220203

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity(), View.OnClickListener {
    var cnt = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*
        val plusBtn = findViewById<Button>(R.id.plusBtn)
        val minusBtn = findViewById<Button>(R.id.minusBtn)
        val reset = findViewById<Button>(R.id.reset)
        val set = findViewById<Button>(R.id.set)
        val result = findViewById<TextView>(R.id.result)
        val changeNum = findViewById<EditText>(R.id.changeNum)

        plusBtn.setOnClickListener {
            cnt++
        }
        minusBtn.setOnClickListener {
            cnt--
        }
        reset.setOnClickListener {
            cnt = 0
        }
        set.setOnClickListener {
            cnt = Integer.parseInt(changeNum.text.toString())
        }
        result.text = cnt.toString()
        */
    }

    override fun onClick(v: View?) {
        val changeNum = findViewById<EditText>(R.id.changeNum)
        val result = findViewById<TextView>(R.id.result)
        when(v?.id){
            R.id.plusBtn -> cnt++
            R.id.minusBtn -> cnt--
            R.id.reset -> cnt = 0
            R.id.set -> cnt = Integer.parseInt(changeNum.text.toString())
        }
        result.text = cnt.toString()
    }
}