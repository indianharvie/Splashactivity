package com.example.splashactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class introducttion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_introducttion);
        Thread obj=new Thread(){
            public void run(){
                try {
                    sleep(3000);
                }
                catch (Exception e)
                {
                    e.printStackTrace();// used for mother of all error to print

                }
                finally {
                    Intent intent=new Intent(introducttion.this,MainActivity.class);
                    startActivity(intent);

                }
            }

        };obj.start();

    }
}