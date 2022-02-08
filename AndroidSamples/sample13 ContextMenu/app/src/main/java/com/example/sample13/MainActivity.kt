package com.example.sample13

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ContextMenu
import android.view.MenuItem
import android.view.View
import android.widget.TextView
import com.example.sample13.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    val binding by lazy{ ActivityMainBinding.inflate(layoutInflater)}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        setContentView(binding.root)

        //textView에 메뉴 세팅 -> 길게 누르면 나옴
        registerForContextMenu(binding.textview)
    }

    override fun onCreateContextMenu(menu: ContextMenu?, v: View?, menuInfo: ContextMenu.ContextMenuInfo?) {
        menuInflater.inflate(R.menu.context_menu_main, menu)
    }

    override fun onContextItemSelected(item: MenuItem): Boolean {
        val textView = findViewById<TextView>(R.id.textview)
        when(item?.itemId){
            R.id.text_color ->{
                textView.setTextColor(Color.GREEN)
                textView.text = "글자색 변경"
            }
            R.id.text_back_color ->{
                textView.setBackgroundColor(Color.YELLOW)
                textView.text = "배경색 변경"
            }
            R.id.text_basic ->{
                textView.setTextColor(Color.WHITE)
                textView.setBackgroundColor(Color.BLACK)
                textView.text = "초기화"
            }
        }

        return super.onContextItemSelected(item)
    }
}