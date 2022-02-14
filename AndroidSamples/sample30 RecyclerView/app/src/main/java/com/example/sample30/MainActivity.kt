package com.example.sample30

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

/*
    **build.gradle에 추가하기**
    implementation 'androidx.recyclerview:recyclerview:1.1.0'           // 추가
    implementation 'com.github.bumptech.glide:glide:4.11.0'             // 추가
    annotationProcessor 'com.github.bumptech.glide:compiler:4.11.0'     // 추가
*/

    var userList = arrayListOf<DataVo>(
        DataVo("김철수", "kcs", "서울시", 3000000, "kim"),
        DataVo("박상현", "psh", "부산시", 5000000, "park"),
        DataVo("최진형", "cjh", "광주시", 4000000, "choi"),
        DataVo("정수동", "jsd", "충주시", 4500000, "jung")    //없는 이미지 일때 확인
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var recyclerView = findViewById<RecyclerView>(R.id.recyclerView)

        val mAdapter = CustomAdapter(this, userList)
        recyclerView.adapter = mAdapter

        val layout = LinearLayoutManager(this)
        recyclerView.layoutManager = layout

        recyclerView.setHasFixedSize(true)
    }
}