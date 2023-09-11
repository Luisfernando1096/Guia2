package com.example.g02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import com.example.g02.clases.Persona;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    public static ArrayList<Persona> lstPersonas = new ArrayList<>();

    private Button btnAgregarPersona, btnMostrarPersonas, btnDatos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAgregarPersona = findViewById(R.id.btnIrAgregar);

        btnMostrarPersonas = findViewById(R.id.btnMostrarLista);

        btnDatos = findViewById(R.id.btnDatos);

        btnAgregarPersona.setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this, AgregarPersonaActivity.class));
        });

        btnMostrarPersonas.setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this, MostrarListaActivity.class));

        });

        btnDatos.setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this, AcercaDeActivity.class));

        });

        /*rellenarLista();

       */

    }

    private void rellenarLista(){
        lstPersonas.add(new Persona(lstPersonas.size() + 1, "Juan", "Perez", 18, "juan@gmail.com"));
    }

    @Override
    protected void onStart() {
        super.onStart();
        //Toast.makeText(this, "Estoy en el onStart", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        //Toast.makeText(this, "Estoy en el onResume", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        //Toast.makeText(this, "Estoy en el onPause", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        //Toast.makeText(this, "Estoy en el onStop", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        //Toast.makeText(this, "Estoy en el onDestroy", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        //Toast.makeText(this, "Estoy en el onRestart", Toast.LENGTH_SHORT).show();
    }
}