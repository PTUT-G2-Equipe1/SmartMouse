package com.example.f15003938.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    private Button retour;
    private Button droit;
    private Button gauche;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        retour = (Button) findViewById(R.id.retour);
        droit = (Button) findViewById(R.id.droit);
        gauche = (Button) findViewById(R.id.gauche);

        retour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ret = new Intent(Main2Activity.this, MainActivity.class);
                startActivity(ret);
            }
        });


    }
}
