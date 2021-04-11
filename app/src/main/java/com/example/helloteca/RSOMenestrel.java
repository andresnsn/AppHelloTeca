package com.example.helloteca;

import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.Switch;

import androidx.appcompat.app.AppCompatActivity;

public class RSOMenestrel extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.rs_o_menestrel);


        View view = findViewById(R.id.full_background);
        Switch switchButton = findViewById(R.id.switch_button);
        switchButton.setChecked(false);

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
