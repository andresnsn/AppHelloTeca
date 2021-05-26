package com.example.helloteca;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import org.w3c.dom.Text;

public class HomeScreenActivity extends AppCompatActivity {

    TextView textView;

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_screen);

    }

    public void openBarackBook(View v){
        Intent intent = new Intent(HomeScreenActivity.this, RSBarackObama.class);
        startActivity(intent);
    }
    public void openEsteNaoEMaisUmLivroDeDieta(View v){
        Intent intent = new Intent(HomeScreenActivity.this, RSEsteNaoEMaisUmLivroDeDieta.class);
        startActivity(intent);
    }

    public void openGatilhosBook(View v){
        Intent intent = new Intent(HomeScreenActivity.this, RSGatilhosMentais.class);
        startActivity(intent);
    }

    public void openExtraordinarioBook(View v){
        Intent intent = new Intent(HomeScreenActivity.this, RSExtraordinario.class);
        startActivity(intent);
    }

    public void openOMenestrel(View v){
        Intent intent = new Intent(HomeScreenActivity.this, RSOMenestrel.class);
        startActivity(intent);
    }

    public void openOsDonosDoMundo(View v){
        Intent intent = new Intent(HomeScreenActivity.this, RSDonosDoMundo.class);
        startActivity(intent);
    }

}
