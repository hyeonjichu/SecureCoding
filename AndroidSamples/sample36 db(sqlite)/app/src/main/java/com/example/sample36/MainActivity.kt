package com.example.sample36

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    /*
        보기 > 도구 창 > Device File Exploere > data > data > packagename > databases
        저장해서 다른 프로그램 이용해 확인할 수 있음
        https://sqlitebrowser.org/
    */

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var dbHelper = DBHelper(this, "mydb.db", null, 1)
        var database = dbHelper.writableDatabase

        val editInsert = findViewById<EditText>(R.id.editInsert)
        val insertBtn = findViewById<Button>(R.id.insert)

        insertBtn.setOnClickListener {
            val txt = editInsert.text

            dbHelper.insert(database, txt.toString())
            Toast.makeText(this, "추가되었습니다.", Toast.LENGTH_SHORT).show()
            editInsert.setText("")
        }

        val editDel = findViewById<EditText>(R.id.editDel)
        val delBtn = findViewById<Button>(R.id.delBtn)

        delBtn.setOnClickListener {
            val seq = editDel.text

            dbHelper.del(database, seq.toString().toInt())
            Toast.makeText(this, "삭제되었습니다.", Toast.LENGTH_SHORT).show()
            editDel.setText("")
        }

        val editSelect = findViewById<EditText>(R.id.editSelect)
        val selectBtn = findViewById<Button>(R.id.selectBtn)

        selectBtn.setOnClickListener {
            val seq = editSelect.text


            //dbHelper.select(database, seq.toString().toInt())
            var result = dbHelper.select(database, seq.toString().toInt())
            if(result == ""){
                Toast.makeText(this, "검색 결과가 없습니다.", Toast.LENGTH_SHORT).show()
            }else{
                Toast.makeText(this, "검색완료 ${result}", Toast.LENGTH_SHORT).show()
            }
            editSelect.setText("")

        }

        val editUpSeq = findViewById<EditText>(R.id.editUpSeq)
        val editUpTxt = findViewById<EditText>(R.id.editUpTxt)
        val updateBtn = findViewById<Button>(R.id.updateBtn)

        updateBtn.setOnClickListener {
            var seq = editUpSeq.text
            var txt = editUpTxt.text

            dbHelper.update(database, seq.toString().toInt(), txt.toString())
            Toast.makeText(this, "수정되었습니다.", Toast.LENGTH_SHORT).show()
            editUpSeq.setText("")
            editUpTxt.setText("")
        }
    }
}