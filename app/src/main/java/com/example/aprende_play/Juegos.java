package com.example.aprende_play;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.aprende_play.juegos.Juego;

public class Juegos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_juegos);
    }

    public void ins(View v){
    Intent i = new  Intent(Juegos.this, Instrucciones.class);
            startActivity(i);
    }


    public void memo(View v){
        Intent pasajuego = new Intent(Juegos.this, Juego.class);
        startActivity(pasajuego);
    }

    public void onclick(View view) {
        switch (view.getId()) {

            case R.id.btnBloquead:
                AlertDialog.Builder builder = new AlertDialog.Builder(this);
                builder.setTitle("Quieres acceder a mas contenido?");
                builder.setMessage("Actualice al plan premium");
                builder.setPositiveButton("Aceptar", null);

                AlertDialog dialog = builder.create();
                dialog.show();
                break;

            case R.id.dod:
                AlertDialog.Builder b = new AlertDialog.Builder(this);
                b.setTitle("Quieres acceder a mas contenido?");
                b.setMessage("Actualice al plan premium");
                b.setPositiveButton("Aceptar", null);

                AlertDialog d = b.create();
                d.show();
                break;


            case R.id.dia:
                AlertDialog.Builder bu = new AlertDialog.Builder(this);
                bu.setTitle("Quieres acceder a mas contenido?");
                bu.setMessage("Actualice al plan premium");
                bu.setPositiveButton("Aceptar", null);

                AlertDialog i = bu.create();
                i.show();
                break;

            case R.id.rom:
                AlertDialog.Builder bui = new AlertDialog.Builder(this);
                bui.setTitle("Quieres acceder a mas contenido?");
                bui.setMessage("Actualice al plan premium");
                bui.setPositiveButton("Aceptar", null);

                AlertDialog l = bui.create();
                l.show();
                break;
        }
    }
}
