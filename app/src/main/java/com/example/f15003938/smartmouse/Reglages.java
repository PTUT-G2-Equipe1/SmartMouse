package com.example.f15003938.smartmouse;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatDelegate;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.RelativeLayout;
import android.widget.SimpleAdapter;
import android.widget.Switch;
import android.widget.Toast;
import android.widget.Toolbar;

public class Reglages extends AppCompatActivity {

    private Button retour;
    private Button vert;
    private Button gris;
    private Button rouge;
    private Switch modenuit;
    private RelativeLayout rl;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reglages);

        retour = (Button) findViewById(R.id.retour);
        vert = (Button) findViewById(R.id.button7);
        gris = (Button) findViewById(R.id.button8);
        rouge = (Button) findViewById(R.id.button9);
        rl = (RelativeLayout) findViewById(R.id.RL);

        rl.setBackgroundColor(Color.parseColor(Parametres.get_fond()));

        /**
         * Mode nuit
         */
        modenuit = (Switch) findViewById(R.id.ModeNuit);
        if (Parametres.get_fond().equals("#222222")) modenuit.setChecked(true);
        modenuit.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    Toast.makeText(getApplicationContext(),
                            "Mode nuit activé", Toast.LENGTH_LONG).show();
                    rl.setBackgroundColor(Color.parseColor("#222222"));
                    Parametres.set_fond("#222222");

                } else {
                    Toast.makeText(getApplicationContext(),
                            "Mode nuit désactivé", Toast.LENGTH_LONG).show();
                    rl.setBackgroundColor(Color.parseColor("#FFFFFF"));
                    Parametres.set_fond("#FFFFFF");
                }
            }
        });

        vert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rl.setBackgroundColor(Color.parseColor("#00AA33"));
                Parametres.set_fond("#00AA33");
            }
        });

        gris.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rl.setBackgroundColor(Color.parseColor("#888888"));
                Parametres.set_fond("#888888");
            }
        });

        rouge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rl.setBackgroundColor(Color.parseColor("#991100"));
                Parametres.set_fond("#991100");
            }
        });

        /**
         * Ecouteur permettant de changer de menu
         */
        retour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ret = new Intent(Reglages.this, Menu.class);
                ret.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                ret.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(ret);
            }
        });


    }
}
