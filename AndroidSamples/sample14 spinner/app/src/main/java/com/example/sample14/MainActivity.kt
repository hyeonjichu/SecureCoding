package com.example.sample14

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupspinnerFruit()
        setupSpinnerHandler()
    }
    
    //spinner에 값을 설정하는 함수
    fun setupspinnerFruit(){

        //#1 가장 많이 사용하는 방법
        //val fruit = arrayOf("과일선택", "사과", "배", "바나나", "포도")
        
        //#2 values > array 에 추가, 외부에서 값을 가져와서 사용할 수 없음
        val fruit = resources.getStringArray(R.array.fruit)
        
        //어뎁터에 배열과 xml을 적용한다
        val adapater = ArrayAdapter(this, R.layout.item_spinner, fruit)

        //spinner에 적용
        val spinner = findViewById<Spinner>(R.id.spinner)
        spinner.adapter = adapater
    }
    
    //선택시 결과를 출력해 주는 함수
    fun setupSpinnerHandler(){
        val spinner = findViewById<Spinner>(R.id.spinner)
        val textView = findViewById<TextView>(R.id.textView)

        spinner.onItemSelectedListener = object :AdapterView.OnItemSelectedListener{
            override fun onItemSelected(p0: AdapterView<*>?, view: View?, idx: Int, id: Long) {
                textView.text = "선택됨: $idx ${spinner.getItemAtPosition(idx)}"
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                TODO("Not yet implemented")
            }
        }
    }
}