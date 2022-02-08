package com.example.hw_220208_baseball

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    var one = ""
    var two = ""
    var three = ""
    var ans1 = ""
    var ans2 = ""
    var ans3 = ""
    var cnt = 1
    var finish = false
    var resultList:MutableList<String> = mutableListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //초기화
        init()

        val chkBtn = findViewById<Button>(R.id.chkBtn)
        val replayBtn = findViewById<Button>(R.id.replayBtn)

        //값 입력 버튼
        chkBtn.setOnClickListener{
            if(one != two && one != three && two != three){
                if(cnt <= 10){
                    numChk()
                    setupSpinner()
                    setupListView()
                    if(finish){
                        AlertDialog.Builder(this@MainActivity)
                            .setTitle("결과")    //title setting
                            .setMessage("축하합니다! ${cnt}번째에 성공하셨습니다!")    //message setting
                            .setCancelable(false)   //화면을 누르거나 뒤로가기를 눌러도 사라지지 않음, 버튼으로 종료해야 함
                            .setNeutralButton("닫기", DialogInterface.OnClickListener { dialog, which ->
                                //닫기버튼을 클릭시!
                            }).show()
                    }
                    cnt++
                }else{
                    //game over
                    AlertDialog.Builder(this@MainActivity)
                        .setTitle("결과")    //title setting
                        .setMessage("주어진 10번의 기회를 모두 사용하셨습니다. ")    //message setting
                        .setCancelable(true)   //화면을 누르거나 뒤로가기를 눌러도 사라지지 않음, 버튼으로 종료해야 함
                        .setNeutralButton("닫기", DialogInterface.OnClickListener { dialog, which ->
                            //닫기버튼을 클릭시!
                        }).show()
                }
            }else{
                Toast.makeText(this.applicationContext, "입력값은 중복될 수 없습니다.", Toast.LENGTH_SHORT).show()
            }
        }

        //재시작 버튼
        replayBtn.setOnClickListener{
            AlertDialog.Builder(this@MainActivity)
                .setTitle("재시작")    //title setting
                .setMessage("다시 시작하시겠습니까?")    //message setting
                .setCancelable(false)   //화면을 누르거나 뒤로가기를 눌러도 사라지지 않음, 버튼으로 종료해야 함
                .setNegativeButton("아니요"){ dialog, which ->
                    dialog.cancel()
                    dialog.dismiss()
                }
                .setPositiveButton("네") { dialog, which ->
                    init()
                }.show()
        }
    }

    //초기화 함수
    fun init(){
        one = ""
        two = ""
        three = ""
        ans1 = ""
        ans2 = ""
        ans3 = ""
        cnt = 1
        finish = false

        val tv = findViewById<TextView>(R.id.text)
        tv.text = ""

        //random number
        ans1 = (1..9).random().toString()
        while(ans2 == "" || ans1 == ans2){
            ans2 = (1..9).random().toString()
        }
        while(ans3 == "" || ans1 == ans3 || ans2 == ans3){
            ans3 = (1..9).random().toString()
        }

        resultList = mutableListOf()

        //spinner setting
        setupSpinner()
        setupSpinnerHandler()
        setupListView()
    }

    //spinner setting
    fun setupSpinner(){
        val number = arrayOf("1", "2", "3", "4", "5", "6", "7", "8", "9")

        val adapter = ArrayAdapter(this, R.layout.item_spinner, number)

        val spinner1 = findViewById<Spinner>(R.id.spinner1)
        val spinner2 = findViewById<Spinner>(R.id.spinner2)
        val spinner3 = findViewById<Spinner>(R.id.spinner3)

        spinner1.adapter = adapter
        spinner2.adapter = adapter
        spinner3.adapter = adapter
    }

    //spinner select
    fun setupSpinnerHandler(){
        val spinner1 = findViewById<Spinner>(R.id.spinner1)
        val spinner2 = findViewById<Spinner>(R.id.spinner2)
        val spinner3 = findViewById<Spinner>(R.id.spinner3)

        spinner1.onItemSelectedListener = object :AdapterView.OnItemSelectedListener{
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, idx: Int, p3: Long) {
                one = spinner1.getItemAtPosition(idx).toString()
            }
            override fun onNothingSelected(p0: AdapterView<*>?) { }
        }
        spinner2.onItemSelectedListener = object :AdapterView.OnItemSelectedListener{
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, idx: Int, p3: Long) {
                two = spinner1.getItemAtPosition(idx).toString()
            }
            override fun onNothingSelected(p0: AdapterView<*>?) { }
        }
        spinner3.onItemSelectedListener = object :AdapterView.OnItemSelectedListener{
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, idx: Int, p3: Long) {
                three = spinner1.getItemAtPosition(idx).toString()
            }
            override fun onNothingSelected(p0: AdapterView<*>?) { }
        }
    }

    //listView setting
    fun setupListView(){
        val listview = findViewById<ListView>(R.id.listView)

        val adapter = ArrayAdapter(this, R.layout.item_listview, resultList)
        listview.adapter = adapter
    }

    //input data 값 확인
    fun numChk(){
        var res1 = false
        var res2 = false
        var res3 = false
        var strike = 0
        var ball = 0

        if(one == ans1){
            strike += 1
            res1 = true
        }
        if(two == ans2){
            strike += 1
            res2 = true
        }
        if(three == ans3){
            strike += 1
            res3 = true
        }

        if(!res1){
            if(one == ans2 || one == ans3){
                ball += 1
            }
        }
        if(!res2){
            if(two == ans1 || two == ans3){
                ball += 1
            }
        }
        if(!res3){
            if(three == ans1 || three == ans2){
                ball += 1
            }
        }

        val tv = findViewById<TextView>(R.id.text)
        tv.text = "[$ans1 $ans2 $ans3] [${cnt}번째] $one $two $three > $strike Strike $ball ball"
        resultList.add("[${cnt}번째] $one $two $three > $strike Strike $ball ball")
        if(strike == 3){
            finish = true
        }
    }
}