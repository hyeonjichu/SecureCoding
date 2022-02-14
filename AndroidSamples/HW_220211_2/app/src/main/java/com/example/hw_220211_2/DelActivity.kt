package com.example.hw_220211_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.hw_220211_2.databinding.ActivityDelBinding

class DelActivity : AppCompatActivity() {

    val binding by lazy { ActivityDelBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val dbHelper = DBHelper(this, "memdb.db", null, 1)
        val database = dbHelper.writableDatabase

        binding.mdelBtn.setOnClickListener {
            val name = binding.dnameEdit.text.toString()
            val result = dbHelper.selectOne(database, name)
            if(result == ""){
                Toast.makeText(this, "회원정보가 없습니다.", Toast.LENGTH_SHORT).show()
            }else{
                dbHelper.delete(database, name)
                Toast.makeText(this, "삭제되었습니다.", Toast.LENGTH_SHORT).show()
                binding.dnameEdit.setText("")
            }
        }
    }
}