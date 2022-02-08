package com.example.hw_220204

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.appcompat.app.AlertDialog
import com.example.hw_220204.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    //var name:String = ""
    var enYn:String = ""
    var q21:String = ""
    var q22:String = ""
    //var comment:String = ""
    var age:String = ""
    var answer:String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        setContentView(binding.root)

        //name += binding.name.text.toString()
        var name = binding.name.text

        binding.radioGroup.setOnCheckedChangeListener{_, checkedId ->
            when(checkedId){
                R.id.yes -> enYn = "예"
                R.id.no -> enYn = "아니오"
                R.id.dont -> enYn = "모르겠습니다."
            }
        }

        binding.chk1.setOnCheckedChangeListener(checklistener)
        binding.chk2.setOnCheckedChangeListener(checklistener)

        //comment = binding.comment.text.toString()
        var comment = binding.comment.text

        val ages = arrayOf("10대", "20대", "30대", "40대", "50대", "60대 이상")
        val adapter = ArrayAdapter(this, R.layout.item_spinner, ages)

        val spinner = findViewById<Spinner>(R.id.spinner)
        spinner.adapter = adapter

        spinner.onItemSelectedListener = object :AdapterView.OnItemSelectedListener{
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, idx: Int, p3: Long) {
                age = "${ages[idx]}"
            }
            override fun onNothingSelected(p0: AdapterView<*>?) {
            }
        }

        binding.resultBtn.setOnClickListener {
            if(name.toString() == ""){
                Toast.makeText(this.applicationContext, "이름을 입력하세요.", Toast.LENGTH_SHORT).show()
            }else if(enYn == ""){
                Toast.makeText(this.applicationContext, "질문 1을 선택하세요.", Toast.LENGTH_SHORT).show()
            }else if(q21 == "" && q22 == ""){
                Toast.makeText(this.applicationContext, "질문 2을 선택하세요.", Toast.LENGTH_SHORT).show()
            }else if(comment.toString() == ""){
                Toast.makeText(this.applicationContext, "질문 3을 입력하세요.", Toast.LENGTH_SHORT).show()
            }else{
                answer = "이름: $name\n영어 대화 여부: $enYn\n영어 외 언어: $q21 $q22\n의견: $comment\n연령대: $age\n"
                AlertDialog.Builder(this@MainActivity)
                    .setTitle("설문 결과")
                    .setMessage(answer)
                    .setCancelable(false)
                    .setNeutralButton("닫기", DialogInterface.OnClickListener{ dialog, which ->
                        binding.name.setText("")
                        binding.yes.setChecked(false)
                        binding.no.setChecked(false)
                        binding.dont.setChecked(false)
                        binding.chk1.setChecked(false)
                        binding.chk2.setChecked(false)
                        binding.comment.setText("")
                        binding.spinner.adapter = adapter
                    }).show()
                answer = ""
            }
        }
    }

    val checklistener by lazy {
        CompoundButton.OnCheckedChangeListener{ buttonView, isChecked ->
            val chk1 = findViewById<CheckBox>(R.id.chk1)
            val chk2 = findViewById<CheckBox>(R.id.chk2)

            if(isChecked){
                when(buttonView){
                    chk1 -> q21 = "독일어 "
                    chk2 -> q22 = "프랑스어 "
                }
            }else{
                when(buttonView){
                    chk1 -> q21 = ""
                    chk2 -> q22 = ""
                }
            }
        }
    }
}