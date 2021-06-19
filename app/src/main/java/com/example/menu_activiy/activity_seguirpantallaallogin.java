package com.example.menu_activiy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class activity_seguirpantallaallogin extends AppCompatActivity {

    Button iraempezar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seguirpantallaallogin);

        iraempezar = (Button)findViewById(R.id.btnIngresar);

        iraempezar.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {

                Intent i = new Intent(activity_seguirpantallaallogin.this, activity_pantalla_iniciando.class);
                startActivity(i);

            }
        });

    }
}