package com.example.sample36

import android.content.Context
import android.database.Cursor
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class DBHelper(context: Context?, name:String?, factory: SQLiteDatabase.CursorFactory?, version:Int)
    : SQLiteOpenHelper(context, name, factory, version) {

    override fun onCreate(db: SQLiteDatabase?) {
        var sql : String = "create table if not exists mytable(" +
                " seq integer primary key autoincrement, " +
                "txt text)"
        db?.execSQL(sql)
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        var sql : String = "drop table if exists mytable"
        db?.execSQL(sql)
        onCreate(db)
    }

    fun insert(db: SQLiteDatabase, txt:String){
        var sql = "insert into mytable(txt)" +
                "values('${txt}')"
        db.execSQL(sql)
    }

    fun del(db: SQLiteDatabase, seq:Int){
        var sql = "delete from mytable where seq = ${seq}"
        db.execSQL(sql)
    }

    fun update(db: SQLiteDatabase, seq: Int, txt: String){
        var sql = "update mytable set txt = '${txt}' where seq = ${seq}"
        db.execSQL(sql)
    }

    fun select(db: SQLiteDatabase, seq: Int): String?{
        var sql = "select * from mytable where seq = ${seq}"
        var result = db.rawQuery(sql, null)

        var str:String? = ""
        while(result.moveToNext()){
            str += result.getString(result.getColumnIndex("seq")) + " " + result.getString(result.getColumnIndex("txt"))
        }
        return str
    }
}