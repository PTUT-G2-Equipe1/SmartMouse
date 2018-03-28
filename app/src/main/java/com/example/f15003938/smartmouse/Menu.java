package com.example.f15003938.smartmouse;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TableLayout;
import android.widget.TextView;

import com.example.f15003938.smartmouse.R;

public class Menu extends AppCompatActivity {

    private Button souris;
    private Button tele;
    private Button reglages;
    private Button connexion;
    private TableLayout rl;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        souris = (Button) findViewById(R.id.souris);
        tele = (Button) findViewById(R.id.tele);
        reglages = (Button) findViewById(R.id.reglage);
        connexion = (Button) findViewById(R.id.connexion);
        rl = (TableLayout) findViewById(R.id.RL);

        rl.setBackgroundColor(Color.parseColor(Parametres.get_fond()));
        /**
         * Ecouteur permettant de changer de menu
         */
        souris.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sou = new Intent(Menu.this, Souris.class);
                startActivity(sou);
            }
        });

        /**
         * Ecouteur permettant de changer de menu
         */
        tele.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tel = new Intent(Menu.this, Telecommande.class);
                startActivity(tel);
            }
        });

        /**
         * Ecouteur permettant de changer de menu
         */
        connexion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tel = new Intent(Menu.this, ConnexionBT.class);
                startActivity(tel);
            }
        });

        /**
         * Ecouteur permettant de changer de menu
         */
        reglages.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent reg = new Intent(Menu.this, Reglages.class);
                startActivity(reg);
            }
        });
    }
}