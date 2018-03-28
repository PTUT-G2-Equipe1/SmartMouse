package com.example.f15003938.smartmouse;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

public class Souris extends AppCompatActivity {

    private Button retour;
    private Button droit;
    private Button gauche;
    private RelativeLayout rl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_souris);
        rl = (RelativeLayout) findViewById(R.id.RL);
        retour = (Button) findViewById(R.id.retour);
        droit = (Button) findViewById(R.id.droit);
        gauche = (Button) findViewById(R.id.gauche);

        rl.setBackgroundColor(Color.parseColor(Parametres.get_fond()));

        /**
         * Ecouteur permettant de changer de menu
         */
        retour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ret = new Intent(Souris.this, Menu.class);
                ret.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                ret.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(ret);
            }
        });


    }
}
