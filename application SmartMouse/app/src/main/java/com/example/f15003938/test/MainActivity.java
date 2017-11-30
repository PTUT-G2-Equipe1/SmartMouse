package com.example.f15003938.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView hello;
    private Button souris;
    private Button tele;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        hello = (TextView) findViewById(R.id.hello);
        souris = (Button) findViewById(R.id.souris);
        tele = (Button) findViewById(R.id.tele);

        souris.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sou = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(sou);
            }
        });

        tele.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("à compléter");
            }
        });
    }
}