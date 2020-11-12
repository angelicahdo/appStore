package edu.unicauca.appstore;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void principal (View view){
        Intent principal = new Intent(this, edu.unicauca.appstore.Principal.class);
        startActivity(principal);
    }


}