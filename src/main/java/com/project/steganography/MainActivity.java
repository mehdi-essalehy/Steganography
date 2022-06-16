package com.project.steganography;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goToExtraction(View view) {
        // go to SecondActivity
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
    }

    public void goToInsertion(View view) {
        // go to FourthActivity
        Intent intent = new Intent(this, FourthActivity.class);
        startActivity(intent);
    }
}