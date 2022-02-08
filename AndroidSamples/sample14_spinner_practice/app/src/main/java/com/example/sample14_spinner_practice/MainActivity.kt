package com.example.sample14_spinner_practice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    val color = arrayOf("orange", "yellow", "black", "white")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupSpinnerColor()
        setupSpinnerHandler()
    }

    fun setupSpinnerColor(){
        val adapter = ArrayAdapter(this, R.layout.item_spinner, color)

        val spinner = findViewById<Spinner>(R.id.spinner)
        spinner.adapter = adapter
    }

    fun setupSpinnerHandler(){
        val spinner = findViewById<Spinner>(R.id.spinner)
        val textview = findViewById<TextView>(R.id.textView)

        spinner.onItemSelectedListener = object :AdapterView.OnItemSelectedListener{
            override fun onItemSelected(p0: AdapterView<*>?, view: View?, idx: Int, id: Long) {
                 textview.text = "color is ${spinner.getItemAtPosition(idx)}"
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                TODO("Not yet implemented")
            }
        }

    }
}