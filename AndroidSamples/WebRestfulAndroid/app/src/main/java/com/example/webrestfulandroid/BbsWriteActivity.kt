package com.example.webrestfulandroid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class BbsWriteActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bbs_write)

        val userid = findViewById<EditText>(R.id.widEdit)
        val writeBtn = findViewById<Button>(R.id.writeBtn)
        userid.setText(MemberDao.user?.id)
        userid.isEnabled = false

        val data = intent.getParcelableExtra<BbsDto>("data")
        if(data != null){
            val title = findViewById<EditText>(R.id.wtitleEdit)
            title.setText(data.title)
            val content = findViewById<EditText>(R.id.wcontentEdit)
            content.setText(data.content)
            writeBtn.setOnClickListener {
                val title = findViewById<EditText>(R.id.wtitleEdit).text.toString()
                val content = findViewById<EditText>(R.id.wcontentEdit).text.toString()

                if(title == ""){
                    Toast.makeText(this, "제목을 입력하세요.", Toast.LENGTH_SHORT).show()
                }else if(content == ""){
                    Toast.makeText(this, "내용을 입력하세요.", Toast.LENGTH_SHORT).show()
                }else{
                    val dto = BbsDto(data.seq, userid.text.toString(), 0, 0, 0, title, content, "0", 0, 0)
                    val result = BbsDao.getInstance().bbsUpdate(dto)
                    if(result=="YES"){
                        Toast.makeText(this, "글이 수정되었습니다.", Toast.LENGTH_SHORT).show()
                        val i = Intent(this, BbsListActivity::class.java)
                        startActivity(i)
                    }else{
                        Toast.makeText(this, "글이 수정되지 않았습니다.", Toast.LENGTH_SHORT).show()
                    }
                }
            }
        }else{
            writeBtn.setOnClickListener {
                val title = findViewById<EditText>(R.id.wtitleEdit).text.toString()
                val content = findViewById<EditText>(R.id.wcontentEdit).text.toString()

                if(title == ""){
                    Toast.makeText(this, "제목을 입력하세요.", Toast.LENGTH_SHORT).show()
                }else if(content == ""){
                    Toast.makeText(this, "내용을 입력하세요.", Toast.LENGTH_SHORT).show()
                }else{
                    val dto = BbsDto(0, userid.text.toString(), 0, 0, 0, title, content, "0", 0, 0)
                    val result = BbsDao.getInstance().bbsWrite(dto)
                    if(result=="YES"){
                        Toast.makeText(this, "글이 등록되었습니다.", Toast.LENGTH_SHORT).show()
                        val i = Intent(this, BbsListActivity::class.java)
                        startActivity(i)
                    }else{
                        Toast.makeText(this, "글이 등록되지 않았습니다.", Toast.LENGTH_SHORT).show()
                    }
                }
            }
        }
    }
}