package com.example.hw_220211_2

import android.annotation.SuppressLint
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

/*class DBHelper(context: Context?, filename:String?)
    : SQLiteOpenHelper(context, filename, null, 1){*/
class DBHelper(context: Context, filename:String, factory: SQLiteDatabase.CursorFactory?, version: Int)
    : SQLiteOpenHelper(context, filename, factory, version){

    /*DBHelper. 으로 접근하면 모두 접근 가능, 호출하지 않아도*/
    companion object{
        var dbhelper:DBHelper? = null
        fun getInstance(context: Context, filename: String) : DBHelper{
            if(dbhelper == null){
                dbhelper = DBHelper(context, filename, null, 1)
            }
            return dbhelper!!
        }
    }

    override fun onCreate(db: SQLiteDatabase?) {
        val sql : String = "create table if not exists member(" +
                "seq integer primary key autoincrement," +
                "name text," +
                "age integer," +
                "address text)"
        db?.execSQL(sql)
    }

    override fun onUpgrade(db: SQLiteDatabase?, p1: Int, p2: Int) {
        val sql : String = "drop table if exists member"
        db?.execSQL(sql)
        onCreate(db)
    }
    /*
    fun insert(db: SQLiteDatabase, name: String, age: Int, address: String){
        val sql = "insert into member(name, age, address)" +
                "values('${name}', ${age}, '${address}')"
        db.execSQL(sql)
    }
    */

    fun insert(vo:Member){
        val sql = "insert into member(name, age, address)" +
                "values('${vo.name}', ${vo.age}, '${vo.address}')"
        val db = this.writableDatabase
        db.execSQL(sql)
    }

    fun selectAll(db: SQLiteDatabase): MutableList<String>{
        val sql = "select * from member"
        val result = db.rawQuery(sql, null)

        val arr = mutableListOf<String>()
        while(result.moveToNext()){
            arr.add("이름: ${result.getString(result.getColumnIndex("name"))} | 나이: ${result.getString(result.getColumnIndex("age"))} | 주소: ${result.getString(result.getColumnIndex("address"))}")
        }
        return arr
    }

    fun selectOne(db: SQLiteDatabase, name:String): String?{
        val sql = "select * from member where name = '${name}'"
        val result = db.rawQuery(sql, null)

        var str = ""
        while(result.moveToNext()){
            str += "${result.getString(result.getColumnIndex("seq"))},${result.getString(result.getColumnIndex("name"))},${result.getString(result.getColumnIndex("age"))},${result.getString(result.getColumnIndex("address"))}"
        }
        return str
    }

    fun delete(db: SQLiteDatabase, name:String){
        val sql = "delete from member where name = '${name}'"
        db.execSQL(sql)
    }

    fun update(db: SQLiteDatabase, name:String, age:Int, address:String){
        val sql = "update member set age = ${age}, address = '${address}' where name = '${name}'"
        db.execSQL(sql)
    }

}