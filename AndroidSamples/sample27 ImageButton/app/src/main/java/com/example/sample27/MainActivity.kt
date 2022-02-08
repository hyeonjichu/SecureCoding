package com.example.sample27

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import android.widget.TextView
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imgBtn = findViewById<ImageButton>(R.id.imageButton)

        //activity_main.xml에 onclick없어도 됨
        imgBtn.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        val tv = findViewById<TextView>(R.id.textView)

        if(v != null){
            when(v.id){
                R.id.imageButton->{
                    val builder = AlertDialog.Builder(this)
                    builder.setTitle("제목")
                    builder.setMessage("imgBtn click!")
                    builder.show()

                    tv.text = "imgBtn click!"
                }
            }
        }
    }
}