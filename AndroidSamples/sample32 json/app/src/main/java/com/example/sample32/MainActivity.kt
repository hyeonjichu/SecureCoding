package com.example.sample32

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import org.json.JSONArray

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView = findViewById<TextView>(R.id.textView)

        //asset은 정해진 디렉터리 명
        val jsonStr = assets.open("data.json").reader().readText()
        Log.d("jsonStr", jsonStr)

        //Json으로 파싱
        val jsonArray = JSONArray(jsonStr)
        Log.d("jsonStr", jsonArray.toString())

        for(i in 0 until jsonArray.length()){
            val jsonObject = jsonArray.getJSONObject(i)

            textView.append("\n-----------------\n")

            val id = jsonObject.getString("id")
            val language = jsonObject.getString("language")

            textView.append(
                """
                    $id
                """.trimIndent()
            )
            textView.append(
                """
                    $language
                """.trimIndent()
            )
        }
    }
}