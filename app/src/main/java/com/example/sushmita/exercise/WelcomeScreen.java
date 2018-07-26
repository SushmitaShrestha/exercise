package com.example.sushmita.exercise;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
/**
 * Sushmita Shrestha - 16366
 */
public class WelcomeScreen extends AppCompatActivity {

    //variables
    private Button btnBmi, btnWorkout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_screen);

        // find buttons
        btnBmi = (Button) findViewById(R.id.bmi);
        btnWorkout = (Button) findViewById(R.id.workout);


        //set on click listener
        btnBmi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(WelcomeScreen.this, BmiMain.class));
            }
        });

        btnWorkout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(WelcomeScreen.this, Home.class));
            }
        });
    }
}
