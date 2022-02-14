package com.example.hw_220211

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcelable
import android.widget.Button
import android.widget.LinearLayout
import android.widget.Toast
import androidx.core.view.isInvisible
import com.example.hw_220211.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {

    val binding by lazy { ActivitySecondBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val btnCnt = intent.getIntExtra("num", 1)
        val ranNum = (0 until btnCnt).random()
        var childLayout : LinearLayout? = null

        binding.restartBtn.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        for(i in 0 until btnCnt){
            if(i%3 == 0) {
                childLayout = LinearLayout(this)
                childLayout.orientation = LinearLayout.HORIZONTAL
                val layoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 100)
                childLayout.layoutParams = layoutParams
            }

            val btnParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT)
            btnParams.weight = 1.0f

            val normalBtn = Button(this).apply {
                text = (i + 1).toString()
                layoutParams = btnParams
                id = i

                setOnClickListener{
                    if(id == ranNum){
                        text = "Bingo"
                        setBackgroundColor(Color.RED)
                        setTextColor(Color.BLACK)
                    }else{
                        text = "safe"
                    }
                    isEnabled = false
                }
            }
            childLayout?.addView(normalBtn)

            if(i%3 == 2 || i == (btnCnt-1)){
                binding.linearLayout.addView(childLayout)
            }
        }
    }
}

