package com.example.smarthouse2236;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class seetings extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seetings);
    }
    public void perehod8 (View v){
        Intent intent = new Intent(this,youhome.class);
        startActivity(intent);
    }
    public void perehod9 (View v){
        Intent intent = new Intent(this,seetings.class);
        startActivity(intent);
    }
}