package com.drop.learnversioncontrol;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String messageFromUser1 = "third message by user1";
        String messageFromUser2 = "This is the First message from user2";
    }
}