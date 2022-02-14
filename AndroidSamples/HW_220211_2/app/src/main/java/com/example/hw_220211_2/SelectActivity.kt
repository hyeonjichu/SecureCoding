package com.example.hw_220211_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.hw_220211_2.databinding.ActivityAddBinding
import com.example.hw_220211_2.databinding.ActivitySelectBinding

class SelectActivity : AppCompatActivity() {

    val binding by lazy { ActivitySelectBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val dbHelper = DBHelper(this, "memdb.db", null, 1)
        val database = dbHelper.writableDatabase

        binding.searchBtn.setOnClickListener {
            val name = binding.snameEdit.text.toString()
            val result = dbHelper.selectOne(database, name)?.split(',')
            if(result?.get(0) != ""){
                binding.selectTv.text = "번호: ${result?.get(0)} \n이름: ${result?.get(1)} \n" +
                        "나이: ${result?.get(2)} \n주소: ${result?.get(3)} \n"
            }else{
                binding.selectTv.text = ""
                Toast.makeText(this, "회원정보가 없습니다. ", Toast.LENGTH_SHORT).show()
            }
        }
    }
}