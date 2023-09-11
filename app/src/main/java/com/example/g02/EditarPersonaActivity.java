package com.example.g02;

import static com.example.g02.MainActivity.lstPersonas;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.g02.clases.Persona;

public class EditarPersonaActivity extends AppCompatActivity {
    EditText edtNombre, edtApellido, edtEdad, edtCorreo;
    Button btnProcesar;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_editar_persona);

        edtNombre = findViewById(R.id.edtNombre);
        edtApellido = findViewById(R.id.edtApellido);
        edtEdad = findViewById(R.id.edtEdad);
        edtCorreo = findViewById(R.id.edtCorreo);
        btnProcesar = findViewById(R.id.btnProcesar);

        Intent intent = getIntent();
        String nombre = intent.getStringExtra("nombre");
        String apellido = intent.getStringExtra("apellido");
        String correo = intent.getStringExtra("correo");
        int edad = intent.getIntExtra("edad", 0);
        int posicion = intent.getIntExtra("posicion", 0);
        int idPersona = intent.getIntExtra("idPersona", 0);

        edtNombre.setText(nombre);
        edtApellido.setText(apellido);
        edtEdad.setText(String.valueOf(edad));
        edtCorreo.setText(correo);

        btnProcesar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                lstPersonas.set(posicion, new Persona(idPersona, edtNombre.getText().toString(),
                        edtApellido.getText().toString(), Integer.parseInt(edtEdad.getText().toString()), edtCorreo.getText().toString()));
                Toast.makeText(EditarPersonaActivity.this, "Actualizacion exitosa", Toast.LENGTH_SHORT).show();
                finish();
            }
        });

    }
}
