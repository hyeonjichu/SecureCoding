package com.example.springrestfulandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.StrictMode
import com.google.gson.GsonBuilder
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.converter.scalars.ScalarsConverterFactory
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Query

data class MemberDto(val id:String, val pwd:String, val name:String, val email:String, val auth:Int)

interface ReadyService{
    // 1. 문자열 받기
    @GET("/base")
    fun base(): Call<String>

    // 2. 문자열 보내고 받기
    @GET("/connParamGet")
    fun connParamGet(@Query("title") title:String): Call<String>

    // 3. object를 보내고 받기
    @POST("/getMember")
    fun getMember(@Body mem:MemberDto): Call<MemberDto>

    // 4.
    @GET("/dbTest")
    fun dbTest(): Call<List<MemberDto>>
}

class MainActivity : AppCompatActivity() {

    /*build.gradle, AndroidManifest.xml 추가*/

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //network 처리에 추가한다 == HttpURLConnection, android 3.0부터 필요
        val policy = StrictMode.ThreadPolicy.Builder().permitAll().build()
        StrictMode.setThreadPolicy(policy)

        //Gson은 Java객체를 json으로 변환할 수 있다.
        val gson = GsonBuilder().setLenient().create()

        //localhost로는 안됨, ip주소로 접근해야 함
        val retrofit = Retrofit.Builder().baseUrl("http://192.168.45.4:3000/")
            .addConverterFactory(GsonConverterFactory.create(gson)) //문자열 제외한 리턴값(object, integer...)
            .addConverterFactory(ScalarsConverterFactory.create())  //문자열 리턴받는 경우
            .build()

        val service = retrofit.create(ReadyService::class.java)

        // 1. 문자열 받기
        /*val call = service.base()

        val response = call.execute()

        if(response.isSuccessful){
            if(response.code() == 200){
                val base: String? = response.body()
                println("base:$base")
            }
        }*/

        //2. 문자열 보내고 받기
        /*val call = service.connParamGet("제목입니다.")

        val response = call.execute()

        if(response.isSuccessful){
            if(response.code() == 200){
                val str: String? = response.body()
                println("~~~str:$str")
            }
        }*/

        // 3. object를 보내고 받기
        /*val call = service.getMember(MemberDto("chu", "aaa", "hhh", "sss@naver.com", 1))

        val response = call.execute()

        if(response.isSuccessful){
            if(response.code() == 200){
                val mem: MemberDto? = response.body()
                println("~~~mem:$mem")
                println(mem?.id)
            }
        }*/

        // 4.
        val call = service.dbTest()

        val response = call.execute()

        if(response.isSuccessful){
            if(response.code() == 200){
                val list = response.body() as List<MemberDto>
                println("~~~list:$list")
                println(list[0])
            }
        }
    }
}