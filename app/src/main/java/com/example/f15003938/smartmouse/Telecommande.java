package com.example.f15003938.smartmouse;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

public class Telecommande extends AppCompatActivity {

    private Button retour, precedent, suivant, quitter, demarrer;
    private RelativeLayout rl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_telecommande);

        /**
         * Initialisation des élements de la vue
         */
        rl = (RelativeLayout) findViewById(R.id.RL);
        retour = (Button) findViewById(R.id.retour);
        precedent = (Button) findViewById(R.id.prec);
        suivant = (Button) findViewById(R.id.suiv);
        quitter = (Button) findViewById(R.id.quitter);
        demarrer = (Button) findViewById(R.id.demarrerChrono);

        /**
         * Initialisation du style de vue
         */
        rl.setBackgroundColor(Color.parseColor(Parametres.get_fond()));
        retour.setTextSize(Parametres.get_font_size());
        retour.setTypeface(Parametres.get_font());
        precedent.setTextSize(Parametres.get_font_size());
        precedent.setTypeface(Parametres.get_font());
        suivant.setTextSize(Parametres.get_font_size());
        suivant.setTypeface(Parametres.get_font());
        quitter.setTextSize(Parametres.get_font_size());
        quitter.setTypeface(Parametres.get_font());
        demarrer.setTextSize(Parametres.get_font_size());
        demarrer.setTypeface(Parametres.get_font());



        /**
         * Ecouteur permettant de changer de menu
         */
        retour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ret = new Intent(Telecommande.this, Menu.class);
                ret.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                ret.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(ret);
            }
        });
    }
}

