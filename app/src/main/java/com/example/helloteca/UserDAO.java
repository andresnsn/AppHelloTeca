package com.example.helloteca;

import android.content.ContentValues;
import android.content.Context;

public class UserDAO {

    private final String TABLE_USERS = "Users";
    private DBController gw;

    public UserDAO(Context context){
        gw = DBController.getInstance(context);
    }

    public boolean save(String name, String email, String password){
        ContentValues cv = new ContentValues();
        cv.put("name", name);
        cv.put("email", email);
        cv.put("password", password);
        return gw.getDatabase().insert(TABLE_USERS, null, cv) > 0;

    }
}
