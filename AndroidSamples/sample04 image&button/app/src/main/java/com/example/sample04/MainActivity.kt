package com.example.sample04

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    override fun onClick(view: View?) {
        println("onClick!")
        val myToast = Toast.makeText(this.applicationContext, "Toast 메시지", Toast.LENGTH_SHORT)
        myToast.show()

        //버튼이 여러개 있을 때
        when(view?.id){
            R.id.btn ->{
                var pride = findViewById<ImageView>(R.id.pride)

                pride.visibility = if(pride.visibility == View.VISIBLE){
                    View.INVISIBLE  //이미지 안 보이게
                }else{
                    View.VISIBLE    //이미지 보이게
                }
            }
        }

    }

}