package com.example.helloteca;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.Switch;

public class ReadingScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.reading_screen);
        View view = findViewById(R.id.full_background);
        Switch switchButton = findViewById(R.id.switch_button);

        switchButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    view.setBackgroundColor(0xFF000000);
                    setTheme(android.R.style.Theme_Black);

                }
                else{
                    view.setBackgroundResource(R.drawable.reading_screen_gradient);
                }
            }
        });

    }
}