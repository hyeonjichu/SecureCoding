package com.example.webrestfulandroid

import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcelable
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.core.view.isInvisible
import com.example.webrestfulandroid.databinding.ActivityBbsDetailBinding

class BbsDetailActivity : AppCompatActivity() {

    val b by lazy { ActivityBbsDetailBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(b.root)

        val data = intent.getParcelableExtra<BbsDto>("data")
        println(data?.seq)
        val dto = BbsDao.getInstance().bbsdetail(data!!.seq)

        b.dtitleText.text = dto?.title
        b.dwriterText.text = dto?.id
        b.dreadcntText.text = dto?.readcount.toString()
        b.ddateText.text = dto?.wdate
        b.dcontentText.text = dto?.content
        b.dupdateBtn.isInvisible = true
        b.ddelBtn.isInvisible = true

        if(dto?.id == MemberDao.user?.id){
            b.dupdateBtn.isInvisible = false
            b.ddelBtn.isInvisible = false
        }

        b.ddelBtn.setOnClickListener {
            AlertDialog.Builder(this).setTitle("삭제")
                .setMessage("삭제하시겠습니까?")
                .setPositiveButton("네", DialogInterface.OnClickListener{ _,_ ->
                    val result = BbsDao.getInstance().bbsDel(dto!!.seq)
                    if(result == "YES"){
                        Toast.makeText(this, "삭제되었습니다.", Toast.LENGTH_SHORT).show()
                        val i = Intent(this, BbsListActivity::class.java)
                        startActivity(i)
                    }else{
                        Toast.makeText(this, "삭제하지 못했습니다.", Toast.LENGTH_SHORT).show()
                    }
                })
                .setNegativeButton("아니요", DialogInterface.OnClickListener{ _,_ ->

                })
                .create()
                .show()

        }

        b.dupdateBtn.setOnClickListener {
            AlertDialog.Builder(this).setTitle("수정")
                .setMessage("수정하시겠습니까?")
                .setPositiveButton("네", DialogInterface.OnClickListener{ _,_ ->
                    val i = Intent(this, BbsWriteActivity::class.java)
                    i.putExtra("data", dto)
                    startActivity(i)
                })
                .setNegativeButton("아니요", DialogInterface.OnClickListener{ _,_ ->

                })
                .create()
                .show()
        }

        b.dlistBtn.setOnClickListener {
            val i = Intent(this, BbsListActivity::class.java)
            startActivity(i)
        }
    }
}