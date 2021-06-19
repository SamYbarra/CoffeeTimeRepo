package com.example.menu_activiy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class activity_pantalla_iniciando extends AppCompatActivity {

    Button seguiranavegacion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla_iniciando);

        seguiranavegacion = (Button)findViewById(R.id.btn_Start);

        seguiranavegacion.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {

                Intent i = new Intent(activity_pantalla_iniciando.this, Menu_Navegation.class);
                startActivity(i);

            }
        });

    }
}