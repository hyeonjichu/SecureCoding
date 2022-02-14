package com.example.hw_220211_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.core.view.isInvisible
import com.example.hw_220211_2.databinding.ActivityUpdateBinding

class UpdateActivity : AppCompatActivity() {

    val binding by lazy { ActivityUpdateBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val dbHelper = DBHelper(this, "memdb.db", null, 1)
        val database = dbHelper.writableDatabase

        binding.uage.isInvisible = true
        binding.uaddress.isInvisible = true
        binding.uageEdit.isInvisible = true
        binding.uaddressEdit.isInvisible = true
        binding.uupdateBtn.isInvisible = true

        binding.usearchBtn.setOnClickListener {
            val name = binding.unameEdit.text.toString()
            val result = dbHelper.selectOne(database, name)?.split(',')
            if(result?.get(0) != ""){
                binding.unameEdit.isEnabled = false
                binding.usearchBtn.isEnabled = false
                binding.uage.isInvisible = false
                binding.uaddress.isInvisible = false
                binding.uageEdit.isInvisible = false
                binding.uaddressEdit.isInvisible = false
                binding.uupdateBtn.isInvisible = false

                binding.uageEdit.setText("${result?.get(2)}")
                binding.uaddressEdit.setText("${result?.get(3)}")

                binding.uupdateBtn.setOnClickListener {
                    val age = binding.uageEdit.text.toString().toInt()
                    val address = binding.uaddressEdit.text.toString()

                    dbHelper.update(database, name, age, address)
                    Toast.makeText(this, "수정되었습니다. ", Toast.LENGTH_SHORT).show()
                    binding.unameEdit.isEnabled = true
                    binding.unameEdit.setText("")
                    binding.usearchBtn.isEnabled = true
                    binding.uage.isInvisible = true
                    binding.uaddress.isInvisible = true
                    binding.uageEdit.isInvisible = true
                    binding.uaddressEdit.isInvisible = true
                    binding.uupdateBtn.isInvisible = true
                }
            }else{
                Toast.makeText(this, "회원정보가 없습니다. ", Toast.LENGTH_SHORT).show()
            }
        }
    }
}