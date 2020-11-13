package edu.unicauca.appstore;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

import edu.unicauca.appstore.Adaptadores.AdapterPersona;
import edu.unicauca.appstore.Entidades.Persona;

public class Femenino extends AppCompatActivity {
    ArrayList<Persona> listaPersonas;
    RecyclerView recyclerUsuarios;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_femenino);

        listaPersonas = new ArrayList<>();
        recyclerUsuarios = findViewById(R.id.recyclerView);
        recyclerUsuarios.setLayoutManager(new LinearLayoutManager(this));

        llenarPersona();
        AdapterPersona adapter = new AdapterPersona(listaPersonas);
        recyclerUsuarios.setAdapter(adapter);

    }

    private void llenarPersona() {
        listaPersonas.add(new Persona("Blusa Alien", "28.000",R.drawable.fem_1));
        listaPersonas.add(new Persona("Pijama Roja", "28.000",R.drawable.fem_2));
        listaPersonas.add(new Persona("Pijama Rosa", "30.000",R.drawable.fem_3));
        listaPersonas.add(new Persona("Blusa lost my mind", "28.000",R.drawable.fem_4));
        listaPersonas.add(new Persona("Blusa soda stereo  ", "28.000",R.drawable.fem_5));
        listaPersonas.add(new Persona("Blusa black  ", "28.000",R.drawable.fem_6));

    }
    public void inicio (View view){
        Intent inicio = new Intent(this, edu.unicauca.appstore.MainActivity.class);
        startActivity(inicio);
    }
}