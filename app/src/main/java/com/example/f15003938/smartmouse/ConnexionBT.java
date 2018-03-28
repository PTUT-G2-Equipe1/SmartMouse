package com.example.f15003938.smartmouse;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;

import android.widget.ArrayAdapter;
import android.widget.ListView;

import android.widget.RelativeLayout;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class ConnexionBT extends AppCompatActivity {

    private Button retour;
    Button b1,b2,b3;
    private BluetoothAdapter BluetoothAdap;
    private Set<BluetoothDevice>pairedDevices;
    ListView listeVue;
    private Set<BluetoothDevice> appareilsProches = new HashSet<>();
    private RelativeLayout rl;

    @Override
    protected void onCreate(Bundle etatInstaceSauv) {
        super.onCreate(etatInstaceSauv);
        setContentView(R.layout.activity_connexionbt);

        retour = (Button) findViewById(R.id.retour);
        rl = (RelativeLayout) findViewById(R.id.RL);
        b1 =(Button) findViewById(R.id.button);
        b2=(Button)findViewById(R.id.button2);
        b3=(Button)findViewById(R.id.button3);

        BluetoothAdap = BluetoothAdapter.getDefaultAdapter();
        listeVue = (ListView)findViewById(R.id.listView);

        rl.setBackgroundColor(Color.parseColor(Parametres.get_fond()));

        /**
         * Ecouteur permettant de changer de menu
         */
        retour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ret = new Intent(ConnexionBT.this, Menu.class);
                ret.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                ret.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(ret);
            }
        });
    }

    /**
     *
     * @param v
     * Cette fonction permet de demander l'activation du bluetooth et d'activer ce dernier
     */
    public void activer(View v){
        if (!BluetoothAdap.isEnabled()) {
            Intent turnOn = new Intent(BluetoothAdapter.ACTION_REQUEST_ENABLE);
            startActivityForResult(turnOn, 0);
            Toast.makeText(getApplicationContext(), "Active",Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(getApplicationContext(), "Deja active !", Toast.LENGTH_LONG).show();
        }
    }

    /**
     *
     * @param v
     * Cette fonction permet de demander au telephone s'il souhaite etre visible par les recherches bluetooth
     */
    public  void visible(View v){
        Intent getVisible = new Intent(BluetoothAdapter.ACTION_REQUEST_DISCOVERABLE);
        startActivityForResult(getVisible, 0);
    }

    /**
     *
     * @param v
     * Cette fonction permet de creer une liste d'appareils deja connecte au telephone
     */
    public void liste(View v){
        pairedDevices = BluetoothAdap.getBondedDevices();

        ArrayList list = new ArrayList();

        for(BluetoothDevice bt : pairedDevices) list.add(bt.getName());
        Toast.makeText(getApplicationContext(), "Pairs..",Toast.LENGTH_SHORT).show();

        final ArrayAdapter adapteur = new  ArrayAdapter(this,android.R.layout.simple_list_item_1, list);

        listeVue.setAdapter(adapteur);
    }

    /**
     *
     * @param v
     * Cette fonction permet de rechercher les appareils bluetooth proche du telephone
     */
    public  void scanner(View v){
        Toast.makeText(getApplicationContext(), "Scan..", Toast.LENGTH_LONG).show();
        BluetoothAdap.cancelDiscovery();
        BluetoothAdap.startDiscovery();
        pairedDevices = BluetoothAdap.getBondedDevices();
        ArrayList list = new ArrayList();

        if (appareilsProches.size() == 0) Toast.makeText(getApplicationContext(), "Pas d'appareil à proximité",Toast.LENGTH_SHORT).show();

        for(BluetoothDevice bt : appareilsProches) list.add(bt.getName());
        Toast.makeText(getApplicationContext(), "Les appareils proches",Toast.LENGTH_SHORT).show();

        final ArrayAdapter adapteur = new  ArrayAdapter(this,android.R.layout.simple_list_item_1, list);

        listeVue.setAdapter(adapteur);
    }

    /**
     * Cette fonction permet d'interpreter le resultat de la recherche
     */
    private final BroadcastReceiver bluetoothReceiver = new BroadcastReceiver() {
        @Override
        public void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            if (BluetoothDevice.ACTION_FOUND.equals(action)) {
                BluetoothDevice device = intent.getParcelableExtra(BluetoothDevice.EXTRA_DEVICE);
                Toast.makeText(ConnexionBT.this, "Appareil à proximité " + device.getName(), Toast.LENGTH_SHORT).show();
                appareilsProches.add(device);
            }
        }
    };
}