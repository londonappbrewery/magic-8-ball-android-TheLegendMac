package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.lang.reflect.Array;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    /*
    The Fortune - 8 Ball Edition

    Developed by Mac

    On June 22nd, 2017
     */


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ImageView ballDisplay = (ImageView) findViewById(R.id.image_eightBall);

        Button myBtn = (Button) findViewById(R.id.askBtn);

        final int[] ballArray = {
                R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5,
        };

        myBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //creating and running the random number generator
                Random randomNumberGenerator = new Random();

                int number = randomNumberGenerator.nextInt(5);

                ballDisplay.setImageResource(ballArray[number]);
            }
        });
    }
}
