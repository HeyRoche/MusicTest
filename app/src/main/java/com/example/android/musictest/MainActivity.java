package com.example.android.musictest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Used to find the view for the artist selections
        View xXX = findViewById(R.id.xxx);
        View khalid = findViewById(R.id.khalid);
        View juice = findViewById(R.id.juice);
        View billie = findViewById(R.id.billie);

        //Sets the on click listener on the view that displays the songs categories


        xXX.setOnClickListener(new View.OnClickListener() {

            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent numbersIntent = new Intent(MainActivity.this, XXXActivity.class);
                startActivity(numbersIntent);
            }
        });

        khalid.setOnClickListener(new View.OnClickListener() {

            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent numbersIntent = new Intent(MainActivity.this, KhalidActivity.class);
                startActivity(numbersIntent);
            }
        });

        juice.setOnClickListener(new View.OnClickListener() {

            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent numbersIntent = new Intent(MainActivity.this, JuiceActivity.class);
                startActivity(numbersIntent);
            }
        });

        billie.setOnClickListener(new View.OnClickListener() {

            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent numbersIntent = new Intent(MainActivity.this, BillieActivity.class);
                startActivity(numbersIntent);
            }
        });

    }
}
