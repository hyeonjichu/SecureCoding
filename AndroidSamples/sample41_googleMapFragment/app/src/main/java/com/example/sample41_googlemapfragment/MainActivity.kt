package com.example.sample41_googlemapfragment

import android.location.Address
import android.location.Geocoder
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import java.io.IOException

class MainActivity : AppCompatActivity() {

    /*
        build.gradle에 추가
            implementation 'com.google.android.gms:play-services-location:17.0.0'   //추가
            implementation 'com.google.android.gms:play-services-maps:17.0.0'   //추가
     */

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val addr = findViewById<EditText>(R.id.addrEdit)
        val lat = findViewById<EditText>(R.id.latEdit)
        val long = findViewById<EditText>(R.id.longEdit)
        val btn = findViewById<Button>(R.id.button)

        val geocoder: Geocoder = Geocoder(this)

        val fm = supportFragmentManager
        val fragmentTransaction = fm.beginTransaction()
//        fragmentTransaction.add(R.id.content, MapsFragment(this))
//        fragmentTransaction.commit()

        btn.setOnClickListener {
            val bundle = Bundle()
            if(addr.text.toString() != ""){
                var list:List<Address>? = null
                val str = addr.text.toString()
                try{
                    list = geocoder.getFromLocationName(str, 10)
                }catch (e: IOException){}
                if(list != null){
                    if(list!!.isEmpty()){
                        Toast.makeText(this, "주소를 입력하세요.", Toast.LENGTH_LONG).show()
                    }else{
                        bundle.putDouble("lat", list!!.get(0).latitude.toString().toDouble())
                        bundle.putDouble("long", list!!.get(0).longitude.toString().toDouble())
                    }
                }
            }else{
                bundle.putDouble("lat", lat.text.toString().toDouble())
                bundle.putDouble("long", long.text.toString().toDouble())
            }
            val frag = MapsFragment(this)
            frag.arguments = bundle
            fragmentTransaction.replace(R.id.content, frag).commit()
        }
    }
}