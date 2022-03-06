package com.example.webrestfulandroid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.webrestfulandroid.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.loginBtn.setOnClickListener {
            val userid = binding.idEdit.text.toString()
            val userpwd = binding.pwdEdit.text.toString()

            if(userid == ""){
                Toast.makeText(this, "아이디를 입력하세요.", Toast.LENGTH_SHORT).show()
            }else if(userpwd == ""){
                Toast.makeText(this, "비밀번호를 입력하세요.", Toast.LENGTH_SHORT).show()
            }else{
                val dto = MemberDto(userid, userpwd, null, null, 1)
                val mem = MemberDao.getInstance().login(dto)
                if(mem != null){
                    MemberDao.user = dto
                    val i = Intent(this, BbsListActivity::class.java)
                    startActivity(i)
                }else{
                    Toast.makeText(this, "아이디나 비밀번호를 확인하세요", Toast.LENGTH_SHORT).show()
                }
            }
        }
    }
}