package com.example.slideup;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.concurrent.TimeUnit;

public class MainActivity extends AppCompatActivity {

    Button btn1,btn2,startButton,stopButton;
    TextView textView;
    Animation button1,button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1=findViewById(R.id.button1);
        btn2=findViewById(R.id.button2);
        startButton=findViewById(R.id.start);
        stopButton=findViewById(R.id.stop);

        button1= AnimationUtils.loadAnimation(this,R.anim.button1);
        button2= AnimationUtils.loadAnimation(this,R.anim.button2);

        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startAnimation();
            }
        });
        stopButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stopAnimation();
            }
        });
        /*btn1.setVisibility(View.GONE);
        btn1.postDelayed(new Runnable() {
            @Override
            public void run() {
                btn1.clearAnimation();
                btn1.setVisibility(View.INVISIBLE);
            }
        },5000);*/
    }
    public void startAnimation()
    {
        btn1.startAnimation(button1);
        btn2.startAnimation(button2);
    }
    public void stopAnimation()
    {
        btn1.clearAnimation();
        btn2.clearAnimation();
    }
}
