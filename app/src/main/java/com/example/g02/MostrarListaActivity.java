package com.example.g02;

import static com.example.g02.MainActivity.lstPersonas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.g02.clases.Persona;

public class MostrarListaActivity extends AppCompatActivity {

    private ListView lsvPersonas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mostrar_lista);

        lsvPersonas = findViewById(R.id.lsvPersona);

        ArrayAdapter<Persona> arrayAdapter = new ArrayAdapter<>
                (this, android.R.layout.simple_list_item_1, lstPersonas);

        lsvPersonas.setAdapter(arrayAdapter);

        lsvPersonas.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Persona elementoAEditar = lstPersonas.get(i);

                Intent intent = new Intent(MostrarListaActivity.this, EditarPersonaActivity.class);
                intent.putExtra("posicion", i);

                intent.putExtra("idPersona", elementoAEditar.getIdPersona());
                intent.putExtra("nombre", "" + elementoAEditar.getNombrePersona());
                intent.putExtra("apellido", "" + elementoAEditar.getApellidoPersona());
                intent.putExtra("edad", elementoAEditar.getEdadPersona());
                intent.putExtra("correo", "" + elementoAEditar.getCorreoPersona());
                startActivity(intent);
            }
        });

        lsvPersonas.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long l) {

                lstPersonas.remove(i);
                Toast.makeText(MostrarListaActivity.this, "Eliminacion Exitosa", Toast.LENGTH_SHORT).show();
                arrayAdapter.notifyDataSetChanged();
                lsvPersonas.setAdapter(arrayAdapter);
                return true;
            }
        });

    }

    @Override
    protected void onResume() {
        super.onResume();

        ArrayAdapter<Persona> arrayAdapter = new ArrayAdapter<>
                (this, android.R.layout.simple_list_item_1, lstPersonas);
        arrayAdapter.notifyDataSetChanged();
        lsvPersonas.setAdapter(arrayAdapter);
    }
}