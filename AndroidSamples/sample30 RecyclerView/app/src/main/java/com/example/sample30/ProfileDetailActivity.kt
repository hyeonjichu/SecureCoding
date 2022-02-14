package com.example.sample30

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide

class ProfileDetailActivity : AppCompatActivity() {

    /*activity 추가하면 AndroidManifest.xml에 추가해줘야 함*/
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile_detail)

        //짐 풀러 => CustomAdapter에서 보내준 데이터 값
        val data = intent.getParcelableExtra<DataVo>("data")
        println(data?.name + " " + data?.id)

        val imageView = findViewById<ImageView>(R.id.img_profile)
        val userId = findViewById<TextView>(R.id.userId)
        val userName = findViewById<TextView>(R.id.userName)
        val userPay = findViewById<TextView>(R.id.userPay)

        //imageView.setImageResource(R.drawable.kim)    //사용할 수 없음 => R.drawable.kim는 숫자로 이루어져 있음 => 아래 함수 사용
        //imageView에 data?.photo명의 이미지를 drawing해라
        Glide.with(this).load(getImage(data?.photo)).into(imageView)

        userId.text = data?.id
        userName.text = data?.name
        userPay.text = data?.pay.toString()

    }

    fun getImage(imageName:String?) : Int{
        //drawable폴더에 있는 imageName이 int형태로 return 됨
        return resources.getIdentifier(imageName, "drawable", packageName)
    }
}