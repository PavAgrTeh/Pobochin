package com.example.watch;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import com.example.watch.databinding.ActivityMainBinding;

public class MainActivity extends Activity {

    private TextView mTextView;
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        View myImageView = findViewById(R.id.imageView);
        final Animation animationRotateCenter = AnimationUtils.loadAnimation(
                this, R.anim.rotate_center);
        myImageView.startAnimation(animationRotateCenter);


    }
    public void gotohome(View view){setContentView(R.layout.room);}
    public void gotolog(View view){setContentView(R.layout.log);}
    public void gotoroom(View view){setContentView(R.layout.room);}
}