package com.tech2geek.tictactoegame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Main4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        Toast.makeText(this, "Please click on any pair to start", Toast.LENGTH_SHORT).show();
    }
    public void secondPageObama(View view){
        Intent intent = new Intent(this,Main2Activity.class);
        startActivity(intent);
        finish();
    }
    public void secondPageRonaldo(View view){
        Intent intent = new Intent(this,Main5Activity.class);
        startActivity(intent);
        finish();
    }
    public void secondPageRahul(View view){
        Intent intent = new Intent(this,Main7Activity.class);
        startActivity(intent);
        finish();
    }
}
