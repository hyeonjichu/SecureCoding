package com.example.webrestfulandroid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class BbsListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bbs_list)

        var recyclerView = findViewById<RecyclerView>(R.id.recyclerView)

        val bbslist = BbsDao.getInstance().getBbsList()

        val adapter = CustomAdapter(this, bbslist!!)
        recyclerView.adapter = adapter

        val layout = LinearLayoutManager(this)
        recyclerView.layoutManager = layout
        recyclerView.setHasFixedSize(true)

        val addBtn = findViewById<Button>(R.id.addBtn)
        addBtn.setOnClickListener {
            val i = Intent(this, BbsWriteActivity::class.java)
            startActivity(i)
        }
    }
}