package com.example.sample40_geocoding

import android.content.Intent
import android.location.Address
import android.location.Geocoder
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import java.io.IOException

class MainActivity : AppCompatActivity() {

    /*
    AndroidManifest.xml에 추가
        <uses-permission android:name="android.permission.ACCESS_FINE_LOCATION"/>
        <uses-permission android:name="android.permission.INTERNET"/>
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // ex) 여행 -> 사진 : 위치 저장 하고싶음 -> 주소로 저장 -> 위도, 경도

        val tv = findViewById<TextView>(R.id.textView)
        val addrBtn = findViewById<Button>(R.id.addrBtn)
        val mapBtn1 = findViewById<Button>(R.id.mapBtn1)
        val latBtn = findViewById<Button>(R.id.latBtn)
        val mapBtn2 = findViewById<Button>(R.id.mapBtn2)

        val latEdit = findViewById<EditText>(R.id.latText)
        val longEdit = findViewById<EditText>(R.id.longText)
        val addrEdit = findViewById<EditText>(R.id.addrText)

        val geocoder:Geocoder = Geocoder(this)

        //변환 : 위도, 경도 -> 주소
        addrBtn.setOnClickListener {
            var list:List<Address>? = null

            try {
                val d1:Double = latEdit.text.toString().toDouble()
                val d2:Double = longEdit.text.toString().toDouble()

                list = geocoder.getFromLocation(d1, d2, 10)    
            }catch (e:IOException){
                Log.d("위도/경도", "입출력 오류")
            }
            if(list != null){
                if(list.isEmpty()){
                    tv.text = "해당되는 주소는 없습니다."
                }else{  //정상적으로 산출됨
                    tv.text = list[0].toString()
                }
            }
        }

        mapBtn1.setOnClickListener {
            val d1:Double = latEdit.text.toString().toDouble()
            val d2:Double = longEdit.text.toString().toDouble()

            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("geo:$d1, $d2"))
            startActivity(intent)
        }

        //주소 -> 위도 경도
        latBtn.setOnClickListener {
            var list:List<Address>? = null
            val str = addrEdit.text.toString()
            try{
                list = geocoder.getFromLocationName(str, 10)
            }catch (e:IOException){}
            if(list != null){
                if(list!!.isEmpty()){
                    tv.text = "해당되는 주소는 없습니다."
                }else{
                    tv.text = list!!.get(0).latitude.toString() + " " +
                            list!!.get(0).longitude.toString()
                }
            }
        }

        mapBtn2.setOnClickListener {
            var list:List<Address>? = null
            val str = addrEdit.text.toString()
            try{
                list = geocoder.getFromLocationName(str, 10)
            }catch (e:IOException){}
            if(list != null){
                if(list!!.isEmpty()){
                    tv.text = "해당되는 주소는 없습니다."
                }else{
                    val addr = list!![0]
                    val lat = addr.latitude
                    val long = addr.longitude
                    val geo = String.format("get:%f, %f", lat, long)
                    val intent = Intent(Intent.ACTION_VIEW, Uri.parse(geo))
                    startActivity(intent)
                }
            }
        }
    }
}