package com.example.shrip.myapplication;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int count=0;
    public void clickFunction(View view) {
        EditText userName = (EditText) findViewById(R.id.userName);
        EditText password = (EditText) findViewById(R.id.password);
        CharSequence charSequenceUserName= userName.getText();
        CharSequence charSequencePassword= password.getText();
        Log.i("UserName", charSequenceUserName.toString());
        Log.i("Password", password.getText().toString());
        String toast = charSequenceUserName.toString();
        userName.setText("");
        password.setText("");
        Toast toast1 = Toast.makeText(MainActivity.this, toast, Toast.LENGTH_LONG);
        toast1.setGravity(Gravity.TOP| Gravity.CENTER_VERTICAL,0,0);
        toast1.show();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
