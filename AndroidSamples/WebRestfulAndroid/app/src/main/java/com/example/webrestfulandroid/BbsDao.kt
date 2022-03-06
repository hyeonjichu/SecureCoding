package com.example.webrestfulandroid

import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Query

interface BbsService{

    @GET("/getBbsList")
    fun getBbsList(): Call<List<BbsDto>>

    @POST("/bbsWrite")
    fun bbsWrite(@Body dto:BbsDto): Call<String>

    @GET("/bbsdetail")
    fun bbsdetail(@Query("seq") seq: Int): Call<BbsDto>

    @GET("/bbsDel")
    fun bbsDel(@Query("seq") seq: Int): Call<String>

    @POST("/bbsUpdate")
    fun bbsUpdate(@Body dto: BbsDto): Call<String>
}

class BbsDao {
    companion object{
        var bbsDao:BbsDao? = null

        fun getInstance(): BbsDao{
            if(bbsDao == null){
                bbsDao = BbsDao()
            }
            return bbsDao!!
        }
    }

    fun getBbsList(): ArrayList<BbsDto>?{
        try{
            val retrofit = RetrofitClient.getInstance()

            val service = retrofit?.create(BbsService::class.java)
            val call = service?.getBbsList()
            val response = call?.execute()

            return response?.body() as ArrayList<BbsDto>
        }catch (e:Exception){
            return null
        }
    }

    fun bbsWrite(dto: BbsDto): String?{
        try{
            val retrofit = RetrofitClient.getInstance()
            val service = retrofit?.create(BbsService::class.java)
            val call = service?.bbsWrite(dto)
            val response = call?.execute()

            return response?.body() as String
        }catch (e:Exception){
            return null
        }
    }

    fun bbsdetail(seq: Int): BbsDto?{
        try{
            val retrofit = RetrofitClient.getInstance()
            val service = retrofit?.create(BbsService::class.java)
            val call = service?.bbsdetail(seq)
            val response = call?.execute()

            return response?.body() as BbsDto
        }catch (e:Exception){
            return null
        }
    }

    fun bbsDel(seq: Int): String?{
        try{
            val retrofit = RetrofitClient.getInstance()
            val service = retrofit?.create(BbsService::class.java)
            val call = service?.bbsDel(seq)
            val response = call?.execute()

            return response?.body() as String
        }catch (e:Exception){
            return null
        }
    }

    fun bbsUpdate(dto: BbsDto): String?{
        try{
            val retrofit = RetrofitClient.getInstance()
            val service = retrofit?.create(BbsService::class.java)
            val call = service?.bbsUpdate(dto)
            val response = call?.execute()

            return response?.body() as String
        }catch (e:Exception){
            return null
        }
    }
}