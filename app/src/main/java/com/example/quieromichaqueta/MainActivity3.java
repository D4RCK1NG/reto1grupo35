package com.example.quieromichaqueta;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {

    private Button inicio2;
    private Button producto2;
    private Button sucursal3;
    Drawable drawable;
    ImageView reparaciones, estampados, domicilios;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        //--------------------imagenes-----------
        Resources res1 = getResources();
        drawable = res1.getDrawable(R.drawable.arreglos, getTheme());

        reparaciones = (ImageView) findViewById(R.id.reparaciones);
        reparaciones.setImageDrawable(drawable);

        Resources res2 = getResources();
        drawable = res2.getDrawable(R.drawable.estampado, getTheme());

        estampados = (ImageView) findViewById(R.id.estampado);
        estampados.setImageDrawable(drawable);

        Resources res3 = getResources();
        drawable = res3.getDrawable(R.drawable.nino, getTheme());

        domicilios = (ImageView) findViewById(R.id.estampado);
        domicilios.setImageDrawable(drawable);
        //------------------------------------------------


        inicio2 = (Button) findViewById(R.id.inicio2);
        inicio2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inicio2 = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(inicio2);
            }
        });

        producto2 = (Button) findViewById(R.id.producto2);
        producto2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent producto2 = new Intent(getApplicationContext(), MainActivity2.class);
                startActivity(producto2);
            }
        });
        sucursal3 = (Button) findViewById(R.id.sucursal3);
        sucursal3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sucursal3 = new Intent(getApplicationContext(), MainActivity4.class);
                startActivity(sucursal3);
            }
        });
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu3, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.inicio) {
            Toast.makeText(this, " has seleccionado Inicio", Toast.LENGTH_LONG).show();
            Intent inicio =new Intent(this,MainActivity.class);
            startActivity(inicio);
        }
        if (id == R.id.producto) {
            Toast.makeText(this, "  has seleccionado Productos", Toast.LENGTH_LONG).show();
            Intent productos =new Intent(this,MainActivity2.class);
            startActivity(productos);
        }
        if (id == R.id.sucursal) {
            Toast.makeText(this, "  has seleccionado Sucursales", Toast.LENGTH_LONG).show();
            Intent sucursal =new Intent(this,MainActivity4.class);
            startActivity(sucursal);
        }
        return super.onOptionsItemSelected(item);

    }
}