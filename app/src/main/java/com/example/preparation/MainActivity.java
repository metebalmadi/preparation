package com.example.preparation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button bttnToViewRecipe = (Button) findViewById(R.id.button);
        Button bttnToSpinner = (Button) findViewById(R.id.button2);
        Button bttnToRadio = (Button) findViewById(R.id.button3);
        Button bttnToList = (Button) findViewById(R.id.button4);
        Button bttnToAudio = (Button) findViewById(R.id.button5);

        bttnToViewRecipe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, ViewRecipe.class));
            }
        });

        bttnToSpinner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Spinner.class));
            }
        });

        bttnToRadio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, RadioConvert.class));
            }
        });

        bttnToList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, ListPics.class));
            }
        });


        bttnToAudio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, SplashScreen.class));
            }
        });
    }
}