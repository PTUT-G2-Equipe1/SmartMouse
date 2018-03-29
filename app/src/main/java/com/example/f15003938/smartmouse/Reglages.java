package com.example.f15003938.smartmouse;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.RelativeLayout;
import android.widget.Switch;
import android.widget.Toast;

public class Reglages extends AppCompatActivity {

    private Button retour, bold, basic, mono, petit, moyen, grand, vert, gris, rouge;
    private Switch modenuit;
    private RelativeLayout rl;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reglages);

        /**
         * Initialisation des élements de la vue
         */
        bold = (Button) findViewById(R.id.button);
        basic =(Button) findViewById(R.id.button2);
        mono = (Button)findViewById(R.id.button3);
        retour = (Button) findViewById(R.id.retour);
        petit =(Button) findViewById(R.id.button4);
        moyen=(Button)findViewById(R.id.button5);
        grand=(Button)findViewById(R.id.button6);
        vert = (Button) findViewById(R.id.button7);
        gris = (Button) findViewById(R.id.button8);
        rouge = (Button) findViewById(R.id.button9);
        rl = (RelativeLayout) findViewById(R.id.RL);
        modenuit = (Switch) findViewById(R.id.ModeNuit);

        /**
         * Initialisation du style de vue
         */
        rl.setBackgroundColor(Color.parseColor(Parametres.get_fond()));
        retour.setTextSize(Parametres.get_font_size());
        retour.setTypeface(Parametres.get_font());
        bold.setTextSize(Parametres.get_font_size());
        bold.setTypeface(Typeface.DEFAULT_BOLD);
        basic.setTextSize(Parametres.get_font_size());
        basic.setTypeface(Typeface.DEFAULT);
        mono.setTextSize(Parametres.get_font_size());
        mono.setTypeface(Typeface.MONOSPACE);
        petit.setTextSize(13);
        moyen.setTextSize(15);
        grand.setTextSize(17);
        vert.setTextSize(Parametres.get_font_size());
        vert.setTextColor(Color.parseColor("#00AA33"));
        gris.setTextSize(Parametres.get_font_size());
        gris.setTextColor(Color.parseColor("#888888"));
        rouge.setTextSize(Parametres.get_font_size());
        rouge.setTextColor(Color.parseColor("#991100"));
        modenuit.setTextSize(Parametres.get_font_size());
        modenuit.setTypeface(Parametres.get_font());

        /**
         * Mode nuit
         */
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

        /**
         * Boutons changement de couleur
         */
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
         * Boutons changement de la taille de police
         */
        petit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Parametres.set_font_size(13);
                recreate();
            }
        });
        moyen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Parametres.set_font_size(15);
                recreate();
            }
        });
        grand.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Parametres.set_font_size(17);
                recreate();
            }
        });

        /**
         * Boutons changement de police
         */
        bold.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Parametres.set_font(Typeface.DEFAULT_BOLD);
                recreate();
            }
        });
        basic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Parametres.set_font(Typeface.DEFAULT);
                recreate();
            }
        });
        mono.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Parametres.set_font(Typeface.MONOSPACE);
                recreate();
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
