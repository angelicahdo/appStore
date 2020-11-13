package edu.unicauca.appstore;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;


public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                //Cuando pasan los 2 segundos , pasamos a la actividad principal
                Intent intent = new Intent(edu.unicauca.appstore.Splash.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        },2000);
    }
}