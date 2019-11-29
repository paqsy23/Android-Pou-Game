package com.example.mdpproject.sql;

import android.content.ContentValues;
import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class SQLHandler extends SQLiteOpenHelper {

    private static final int dbversion = 1;
    private static final String dbname = "android_api";

    public SQLHandler(@Nullable Context context) {
        super(context, dbname, null, dbversion);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String createusertable = "create table user(email text primary key,password text,username text unique,level integer)";
        db.execSQL(createusertable);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("drop table if exists user");
        onCreate(db);
    }
    public void adduser(String email,String password,String username,int level){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put("email",email);
        values.put("password",password);
        values.put("username",username);
        values.put("level",level);

    }
}
