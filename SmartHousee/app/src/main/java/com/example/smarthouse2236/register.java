package com.example.smarthouse2236;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
    }
    public void perehod2 (View v){
        Intent intent = new Intent(this,register.class);
        startActivity(intent);
    }
    public void perehod3 (View v){
        Intent intent = new Intent(this,avtoriz.class);
        startActivity(intent);
    }
}