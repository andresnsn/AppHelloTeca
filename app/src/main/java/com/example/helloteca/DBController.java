package com.example.helloteca;

import android.content.ContentValues;
import android.content.Context;

import android.database.sqlite.SQLiteDatabase;

public class DBController {

    private static DBController gw;
    private SQLiteDatabase db;

    public DBController(Context context){
        DBGenerator auxDb = new DBGenerator(context);
        db = auxDb.getWritableDatabase();
    }

    public static DBController getInstance(Context context){
        if(gw == null)
            gw = new DBController(context);
        return gw;
    }

    public SQLiteDatabase getDatabase(){
        return this.db;
    }

    public void insert(UserModel user){
        ContentValues values = new ContentValues();
        values.put("name", user.getNome());
        values.put("email", user.getEmail());
        values.put("password", user.getPassword());

        db.insert("user", null, values);
    }


}
