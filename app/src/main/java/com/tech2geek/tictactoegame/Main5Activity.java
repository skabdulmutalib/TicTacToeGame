package com.tech2geek.tictactoegame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main5Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
    }
    public void startGame2(View view){
        Button startGame2 = findViewById(R.id.button);
        startGame2.animate().scaleXBy(-0.5f).scaleYBy(-0.5f).setDuration(1000);
        Intent intent = new Intent(this, Main6Activity.class);
        startActivity(intent);
        finish();
    }
    public void disclamer(View view){
        Intent intent=new Intent(this,Main3Activity.class);
        startActivity(intent);
    }
}
