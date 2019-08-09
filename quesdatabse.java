package com.example.dynamic_quiz;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class quesdatabse extends SQLiteOpenHelper {
    public quesdatabse(Context context) {
        super(context, "quiz1", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String reg="create table registration(id integer primary key,user text,password text)";
        String ss="create table jtable(id integer primary key autoincrement,q text,op1 text,op2 text,op3 text,op4 text,ans text)";
        String ss1="create table ctable(id integer primary key autoincrement,q text,op1 text,op2 text,op3 text,op4 text,ans text)";
        String ss2="create table dtable(id integer primary key autoincrement,q text,op1 text,op2 text,op3 text,op4 text,ans text)";
       db.execSQL(reg);
       db.execSQL(ss);
        db.execSQL(ss1);
        db.execSQL(ss2);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {



    }
    public void ad_quiz(String qs,String p1,String p2,String p3,String p4,String anss){

        SQLiteDatabase d=this.getWritableDatabase();

        ContentValues cv=new ContentValues();
        cv.put("q",qs);
        cv.put("op1",p1);
        cv.put("op2",p2);
        cv.put("op3",p3);
        cv.put("op4",p4);
        cv.put("ans",anss);
        d.insert("jtable", null, cv);
        d.close();

    }

    public void ad_quiz1(String qs,String p1,String p2,String p3,String p4,String anss){

        SQLiteDatabase d=this.getWritableDatabase();

        ContentValues cv=new ContentValues();
        cv.put("q",qs);
        cv.put("op1",p1);
        cv.put("op2",p2);
        cv.put("op3",p3);
        cv.put("op4",p4);
        cv.put("ans",anss);
        d.insert("ctable", null, cv);
        d.close();

    }
    public void ad_quiz2(String qs,String p1,String p2,String p3,String p4,String anss){

        SQLiteDatabase d=this.getWritableDatabase();

        ContentValues cv=new ContentValues();
        cv.put("q",qs);
        cv.put("op1",p1);
        cv.put("op2",p2);
        cv.put("op3",p3);
        cv.put("op4",p4);
        cv.put("ans",anss);
        d.insert("dtable", null, cv);
        d.close();

    }
    public Cursor set_quiz(int idd){
        SQLiteDatabase d=this.getWritableDatabase();
        String qus = "select* from jtable where id="+idd+"";

        Cursor c= d.rawQuery(qus,null);
        return c;
    }

    public Cursor set_quiz1(int idd){
        SQLiteDatabase d=this.getWritableDatabase();
        String qus = "select* from ctable where id="+idd+"";

        Cursor c= d.rawQuery(qus,null);
        return c;
    }

    public Cursor set_quiz2(int idd){
        SQLiteDatabase d=this.getWritableDatabase();
        String qus = "select* from dtable where id="+idd+"";

        Cursor c= d.rawQuery(qus,null);
        return c;
    }


    public void user_reg(String id,String us,String ps){

        SQLiteDatabase d=this.getWritableDatabase();

        ContentValues cv=new ContentValues();
        cv.put("id",id);
        cv.put("user",us);
        cv.put("password",ps);
        d.insert("registration",null,cv);
        d.close();

    }
    public Cursor get_quiz(int idd, String ps){
        SQLiteDatabase d=this.getWritableDatabase();
        String qus="select* from registration where id="+idd+" and password='"+ps+"'";

        Cursor c= d.rawQuery(qus,null);


        return c;

    }

}
