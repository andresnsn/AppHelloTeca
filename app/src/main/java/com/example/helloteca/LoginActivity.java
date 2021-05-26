package com.example.helloteca;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.snackbar.Snackbar;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_screen);


        Button button = findViewById(R.id.login_button);
        Button button2 = findViewById(R.id.new_button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText login = findViewById(R.id.editTextTextEmailAddress);
                EditText password = findViewById(R.id.editTextTextPassword);
                String loginText = login.getText().toString();
                String passwordText = password.getText().toString();
                if(loginText.equals(user) && passwordText.equals(password.getText().toString())){
                    Intent intent = new Intent(LoginActivity.this, HomeScreenActivity.class);
                    startActivity(intent);
                    finish();
                }
                else{
                    Snackbar.make(v, "Usuário ou senha incorretos. Tente novamente.", Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();
                }
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this, FormActivity.class);
                startActivity(intent);
            }
        });

    }

    public static String user = "";
    public static String password = "";
}