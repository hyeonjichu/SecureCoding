package com.example.hw_220211_2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.hw_220211_2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.addBtn.setOnClickListener {
            val i = Intent(this, AddActivity::class.java)
            startActivity(i)
        }
        binding.delBtn.setOnClickListener {
            val i = Intent(this, DelActivity::class.java)
            startActivity(i)
        }
        binding.selectBtn.setOnClickListener {
            val i = Intent(this, SelectActivity::class.java)
            startActivity(i)
        }
        binding.updateBtn.setOnClickListener{
            val i = Intent(this, UpdateActivity::class.java)
            startActivity(i)
        }
        binding.allBtn.setOnClickListener {
            val i = Intent(this, AllActivity::class.java)
            startActivity(i)
        }
    }
}