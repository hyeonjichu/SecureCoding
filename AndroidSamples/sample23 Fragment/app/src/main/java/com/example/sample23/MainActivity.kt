package com.example.sample23

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.fragment.app.Fragment

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fm = supportFragmentManager
        val fmTransaction = fm.beginTransaction()
        fmTransaction.add(R.id.content, FragmentOne())
        fmTransaction.commit()  //꼭 있어야됨
    }

    override fun onClick(v: View?) {
        Log.d("button click!!", "button click!")

        var fr: Fragment? = null

        if(v?.id == R.id.button1){
            fr = FragmentOne()
        }else if(v?.id == R.id.button2){
            fr = FragmentTwo()
        }else if(v?.id == R.id.button3){
            fr = FragmentThree()
        }
        val fm = supportFragmentManager
        val fmTransaction = fm.beginTransaction()

        //fragment 교체
        fmTransaction.replace(R.id.content, fr!!)
        fmTransaction.commit()
    }
}