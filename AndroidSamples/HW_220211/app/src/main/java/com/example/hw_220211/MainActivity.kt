package com.example.hw_220211

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import com.example.hw_220211.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    var num = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        setupSpinner()
        setupSpinnerHandler()
        /*
        이렇게 하면 왜 num에 값이 저장이 안될까
        binding.setBtn.setOnClickListener {
            setupSpinnerHandler()
            Toast.makeText(this, "세팅 완료", Toast.LENGTH_SHORT).show()
        }*/

        binding.startBtn.setOnClickListener {
            //Toast.makeText(this, "$num", Toast.LENGTH_SHORT).show()
            if(num == ""){
                Toast.makeText(this, "숫자를 선택하세요.", Toast.LENGTH_SHORT).show()
            }else{
                val i = Intent(this, SecondActivity::class.java)
                println("num===========$num")
                i.putExtra("num", num.toInt())
                startActivity(i)
            }
        }
    }

    fun setupSpinner(){
        val numArr = arrayOf("1", "2", "3", "4", "5", "6", "7", "8", "9", "10")

        val adapter = ArrayAdapter(this, R.layout.item_spinner, numArr)

        binding.spinner.adapter = adapter
    }

    fun setupSpinnerHandler(){
        binding.spinner.onItemSelectedListener = object :AdapterView.OnItemSelectedListener{
            override fun onItemSelected(p0: AdapterView<*>?, v: View?, idx: Int, p3: Long) {
                binding.setBtn.setOnClickListener {
                    num = binding.spinner.getItemAtPosition(idx).toString()
                    Toast.makeText(this@MainActivity, "세팅 완료", Toast.LENGTH_SHORT).show()
                }
            }
            override fun onNothingSelected(p0: AdapterView<*>?) { }
        }
    }
}