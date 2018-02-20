package com.tech2geek.tictactoegame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class Main7Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);
    }
    public void startGame3(View view){
        Button startGame3 = findViewById(R.id.button);
        startGame3.animate().scaleXBy(-0.5f).scaleYBy(-0.5f).setDuration(700);
        Intent intent = new Intent(this, Main8Activity.class);
        startActivity(intent);
        finish();
    }
    public void disclamer(View view){
        Intent intent=new Intent(this,Main3Activity.class);
        startActivity(intent);
    }

}

