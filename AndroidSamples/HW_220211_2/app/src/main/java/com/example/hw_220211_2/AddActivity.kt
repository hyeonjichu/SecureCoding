package com.example.hw_220211_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.hw_220211_2.databinding.ActivityAddBinding

class AddActivity : AppCompatActivity() {

    val binding by lazy { ActivityAddBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.maddBtn.setOnClickListener {
            val name = binding.nameEdit.text.toString()
            val age = binding.ageEdit.text.toString().toInt()
            val address = binding.addressEdit.text.toString()
            val mem = Member(0, name, age, address)

            DBHelper.getInstance(this, "memdb.db").insert(mem)

            Toast.makeText(this, "추가되었습니다. ", Toast.LENGTH_SHORT).show()
            binding.nameEdit.setText("")
            binding.ageEdit.setText("")
            binding.addressEdit.setText("")
        }

        /*
        val dbHelper = DBHelper(this, "memdb.db", null, 1)
        val database = dbHelper.writableDatabase

        binding.maddBtn.setOnClickListener {
            val name = binding.nameEdit.text.toString()
            val age = binding.ageEdit.text.toString().toInt()
            val address = binding.addressEdit.text.toString()

            dbHelper.insert(database, name, age, address)
            Toast.makeText(this, "추가되었습니다. ", Toast.LENGTH_SHORT).show()
            binding.nameEdit.setText("")
            binding.ageEdit.setText("")
            binding.addressEdit.setText("")
        }*/
    }
}