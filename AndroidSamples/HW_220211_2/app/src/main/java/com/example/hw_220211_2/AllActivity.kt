package com.example.hw_220211_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.example.hw_220211_2.databinding.ActivityAllBinding

class AllActivity : AppCompatActivity() {

    val binding by lazy { ActivityAllBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val dbHelper = DBHelper(this, "memdb.db", null, 1)
        val database = dbHelper.writableDatabase

        val memArr = dbHelper.selectAll(database)
        val adapter:ArrayAdapter<*> = ArrayAdapter<Any?>(this, R.layout.item_listview, memArr as List<Any?>)
        binding.listView.adapter = adapter
    }
}