package com.tech2geek.tictactoegame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {

    Button startGame;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Button startGame = findViewById(R.id.button);
        startGame.animate().scaleXBy(0.5f).scaleYBy(0.5f).setDuration(700);
    }
    public void startGame(View view){
        Button startGame = findViewById(R.id.button);
        startGame.animate().scaleXBy(-0.5f).scaleYBy(-0.5f).setDuration(700);
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
    public void disclamer(View view){
        Intent intent=new Intent(this,Main3Activity.class);
        startActivity(intent);
    }
}
