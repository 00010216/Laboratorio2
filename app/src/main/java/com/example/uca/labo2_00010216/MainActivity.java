package com.example.uca.labo2_00010216;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //mala practica
    TextView fstTxtView, sndTxtView;

    @Override
    protected void onCreate(Bundle savedInstanceState) { /*metodo no es funcion pq este no tetorna algo
    define propiedades principals y es lo que corre al iniciar aplicacion*/
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // se creen objetos dentro de este y en este crea id
    }

    public void changeText(View v){
        String aux;
        fstTxtView = findViewById(R.id.fstTextView);
        sndTxtView = findViewById(R.id.sndTextView);

        aux = fstTxtView.getText().toString();
        fstTxtView.setText(sndTxtView.getText());
        sndTxtView.setText(aux);
    }
}
