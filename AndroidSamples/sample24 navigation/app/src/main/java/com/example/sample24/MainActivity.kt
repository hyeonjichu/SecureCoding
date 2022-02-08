package com.example.sample24

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    /*
    네비게이션 바 사용하기 위해 추가

    plugins에 추가
    id 'kotlin-android-extensions'

    dependencies에 추가
    implementation 'com.google.android.material:material:1.2.0'
    */

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val firstFragment = FragmentOne()
        val secondFragment = FragmentTwo()
        val thirdFragment = FragmentThree()

        setCurrentFragment(firstFragment)   //초기화, 맨 처음 화면 설정

        bottomNaviView.setOnNavigationItemSelectedListener{
            when(it.itemId){
                R.id.person->setCurrentFragment(firstFragment)
                R.id.home->setCurrentFragment(secondFragment)
                R.id.setting->setCurrentFragment(thirdFragment)
            }
            true    //when중 하나를 실행해라
        }
    }

    fun setCurrentFragment(fragment:Fragment)=supportFragmentManager.beginTransaction().apply {
        replace(R.id.flFragment, fragment)
        commit()
    }
}