package com.example.menu_activiy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class activity_seguirpantalla extends AppCompatActivity {

    Button Ingresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seguirpantalla);

        Ingresar = (Button)findViewById(R.id.btn_signup);

        Ingresar.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {

                Intent i = new Intent(activity_seguirpantalla.this, activity_seguirpantallaallogin.class);
                startActivity(i);

            }
        });

    }

}