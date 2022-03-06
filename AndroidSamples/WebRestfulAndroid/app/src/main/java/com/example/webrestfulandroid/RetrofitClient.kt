package com.example.webrestfulandroid

import android.os.StrictMode
import com.google.gson.GsonBuilder
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.converter.scalars.ScalarsConverterFactory

class RetrofitClient {
    companion object{
        private var instance: Retrofit? = null

        fun getInstance(): Retrofit?{
            if(instance == null){
                //network 처리에 추가한다 == HttpURLConnection, android 3.0부터 필요
                val policy = StrictMode.ThreadPolicy.Builder().permitAll().build()
                StrictMode.setThreadPolicy(policy)

                //Gson은 Java객체를 json으로 변환할 수 있다.
                val gson = GsonBuilder().setLenient().create()

                //localhost로는 안됨, ip주소로 접근해야 함
                instance = Retrofit.Builder().baseUrl("http://192.168.45.4:3000/")
                    .addConverterFactory(GsonConverterFactory.create(gson)) //문자열 제외한 리턴값(object, integer...)
                    .addConverterFactory(ScalarsConverterFactory.create())  //문자열 리턴받는 경우
                    .build()
            }

            return instance
        }
    }
}