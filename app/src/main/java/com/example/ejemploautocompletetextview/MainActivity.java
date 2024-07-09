package com.example.ejemploautocompletetextview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Spinner;

/*
Autor: Juan Francisco Sánchez González
Fecha: 09/10/2023
Clase: Actividad donde se utiliza un adaptador simple para asignar las opciones a un control AutoCompleteTextView
y a un Spinner.
*/

public class MainActivity extends AppCompatActivity {

    private AutoCompleteTextView marcas;

    private Spinner lista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Valores que se le van a pasar al adaptador
        String[] opcionesMarca = {"Lost", "Pukas", "Hurley", "QuickSilver", "NSP", "Indo", "Olaian"};

        // Adaptador simple
        ArrayAdapter<String> adaptadorMarca = new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line, opcionesMarca);

        // Control AutoCompleteTextView
        marcas = (AutoCompleteTextView) findViewById(R.id.autoCompleteTextView);
        marcas.setAdapter(adaptadorMarca);

        // Control Spinner
        lista = (Spinner) findViewById(R.id.spinner);
        lista.setAdapter(adaptadorMarca);
    }
}