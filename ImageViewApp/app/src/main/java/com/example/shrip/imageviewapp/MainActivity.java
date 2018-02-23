package com.example.shrip.imageviewapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
boolean flag = true;

    public void clickFunction(View view) {
       ImageView imageView = findViewById(R.id.imageView2);
       if(flag) {
           imageView.setImageResource(R.drawable.cat);
           flag=false;
       }else {
           imageView.setImageResource(R.drawable.dog);
           flag = true;
       }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
