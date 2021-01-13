package com.example.animaciaor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class Skyline_V35 extends AppCompatActivity {

    ImageView view;
    Animation anim;
    Button but;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_skyline__v35);
        view = (ImageView) findViewById(R.id.skylineId);

        anim = AnimationUtils.loadAnimation(this,R.anim.top);
        view.startAnimation(anim);

        but = (Button) findViewById(R.id.backId);
        but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Skyline_V35.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }
}