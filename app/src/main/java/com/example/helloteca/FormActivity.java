package com.example.helloteca;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import com.example.helloteca.LoginActivity;
import com.example.helloteca.UserDAO;
import com.google.android.material.snackbar.Snackbar;

public class FormActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.form_screen);

        Button saveButton = findViewById(R.id.save_button);
        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText txtName = findViewById(R.id.formNickname);
                EditText txtEmail = findViewById(R.id.formEmail);
                EditText txtPassword = findViewById(R.id.formPassword);

                String name = txtName.getText().toString();
                String email = txtEmail.getText().toString();
                String password = txtPassword.getText().toString();
                String pass = password;

                LoginActivity.user = email;
                LoginActivity.password = pass;

                UserDAO dao = new UserDAO(getBaseContext());
                boolean success = dao.save(name, email, password);
                if(success){
                    txtName.setText("");
                    txtEmail.setText("");
                    txtPassword.setText("");

                    Snackbar.make(v, "Cadastrado com sucesso!", Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();

                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            Intent intent = new Intent(FormActivity.this, LoginActivity.class);
                            startActivity(intent);
                        }
                    },2500);


                }

            }
        });
    }
}