package com.example.helloteca;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class HomeScreenActivity extends AppCompatActivity {

    int i = 0;

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_screen);
    }

    public void openBook(View v){
        Intent intent = new Intent(HomeScreenActivity.this, ReadingScreenActivity.class);
        startActivity(intent);
    }
}
