package com.example.helloteca;

import android.content.Context;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBGenerator extends SQLiteOpenHelper{

    private static final String DB_NAME = "USERS";
    private static final int DB_VERSION = 7;

    public DBGenerator(Context context){
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE USERS(_id integer primary key autoincrement," +
                "name text not null," +
                "email text not null, " +
                "password text not null)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS USERS");
        onCreate(db);
    }
}
