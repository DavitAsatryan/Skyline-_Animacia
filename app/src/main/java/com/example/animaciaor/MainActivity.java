package com.example.animaciaor;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView text;
    Animation top,button;
    ImageView nissan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text = (TextView) findViewById(R.id.textId);
        nissan = (ImageView) findViewById(R.id.nissanId);

        button =  AnimationUtils.loadAnimation(this, R.anim.alpha);
        top =  AnimationUtils.loadAnimation(this, R.anim.scale);

        text.startAnimation(button);
        nissan.startAnimation(top);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this, Skyline_V35.class);
                startActivity(intent);
                finish();
            }
        },3000);
    }
}