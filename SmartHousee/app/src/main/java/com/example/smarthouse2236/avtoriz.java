package com.example.smarthouse2236;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class avtoriz extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_avtoriz);
    }
    public void perehod1 (View v){
        Intent intent = new Intent(this,register.class);
        startActivity(intent);
    }
    public void kill (View v){
        Intent intent = new Intent(this,youhome.class);
        startActivity(intent);
    }
}