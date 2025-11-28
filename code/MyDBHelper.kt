 package com.example.a21bsit046_casestudy

import android.content.ContentValues
import android.content.Context
import android.database.Cursor
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import android.widget.Toast

class MyDBHelper(context:Context):SQLiteOpenHelper(context,"CustomerDetails",null,1) {
    override fun onCreate(p0: SQLiteDatabase?) {
        val query:String="create table customer( cid integer primary key autoincrement, cname text,cpass text)"
        p0?.execSQL(query)
    }

    override fun onUpgrade(p0: SQLiteDatabase?, p1: Int, p2: Int) {
//        TODO("Not yet implemented")
    }

    fun insert(uname:String,upass:String):Long
    {
        val db:SQLiteDatabase=this.writableDatabase
        val cv=ContentValues()
        cv.put("cname",uname)
        cv.put("cpass",upass)
        var res=db.insert("Customer",null,cv)
        return res
    }
    fun login(uname:String,upass:String):Boolean
    {
        val db:SQLiteDatabase=this.readableDatabase
        val cursor:Cursor=db.rawQuery("select * from customer where cname=? and cpass=?",arrayOf(uname,upass))
        if(cursor.count>0)
        {
            return true
        }
        else
        {
            return false
        }
    }
}
