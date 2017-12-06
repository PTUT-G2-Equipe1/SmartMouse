package com.example.f15003938.smartmouse;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.f15003938.smartmouse.R;

public class Menu extends AppCompatActivity {

    private TextView hello;
    private Button souris;
    private Button tele;
    private Button reglages;
    private Button connexion;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        hello = (TextView) findViewById(R.id.hello);
        souris = (Button) findViewById(R.id.souris);
        tele = (Button) findViewById(R.id.tele);
        reglages = (Button) findViewById(R.id.reglage);
        connexion = (Button) findViewById(R.id.connexion);

        souris.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sou = new Intent(Menu.this, Souris.class);
                startActivity(sou);
            }
        });

        tele.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tel = new Intent(Menu.this, Telecommande.class);
                startActivity(tel);
            }
        });

        connexion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tel = new Intent(Menu.this, Connexion.class);
                startActivity(tel);
            }
        });

        reglages.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent reg = new Intent(Menu.this, Reglages.class);
                startActivity(reg);
            }
        });
    }
}