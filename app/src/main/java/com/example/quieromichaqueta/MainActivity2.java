package com.example.quieromichaqueta;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    private Button inicio1;
    private Button servicio2;
    private Button sucursal2;
    Drawable drawable;
    ImageView mujer, hombre,nino;

    public MainActivity2() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
//--------------------imagenes-----------
        Resources res1 = getResources();
        drawable = res1.getDrawable(R.drawable.chaquetamujer, getTheme());

        mujer = (ImageView) findViewById(R.id.mujer);
        mujer.setImageDrawable(drawable);

        Resources res2 = getResources();
        drawable = res2.getDrawable(R.drawable.chaquetas, getTheme());

        hombre = (ImageView) findViewById(R.id.hombre);
        hombre.setImageDrawable(drawable);

        Resources res3 = getResources();
        drawable = res3.getDrawable(R.drawable.nino, getTheme());

        nino = (ImageView) findViewById(R.id.nino);
        nino.setImageDrawable(drawable);
    //------------------------------------------------

        inicio1 = (Button) findViewById(R.id.inicio1);
        inicio1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inicio1 = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(inicio1);
            }
        });

        servicio2 = (Button) findViewById(R.id.servicio2);
        servicio2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent servicio2 = new Intent(getApplicationContext(), MainActivity3.class);
                startActivity(servicio2);
            }
        });
        sucursal2 = (Button) findViewById(R.id.sucursal2);
        sucursal2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sucursal2 = new Intent(getApplicationContext(), MainActivity4.class);
                startActivity(sucursal2);
            }
        });
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu2, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.inicio) {
            Toast.makeText(this, " has seleccionado Inicio", Toast.LENGTH_LONG).show();
            Intent inicio=new Intent(this,MainActivity.class);
            startActivity(inicio);
        }
        if (id == R.id.servicios) {
            Toast.makeText(this, "  has seleccionado Servicios", Toast.LENGTH_LONG).show();
            Intent servicios =new Intent(this,MainActivity3.class);
            startActivity(servicios);
        }
        if (id == R.id.sucursales) {
            Toast.makeText(this, "  has seleccionado Sucursales", Toast.LENGTH_LONG).show();
            Intent sucursales =new Intent(this,MainActivity4.class);
            startActivity(sucursales);
        }
        return super.onOptionsItemSelected(item);

    }
}