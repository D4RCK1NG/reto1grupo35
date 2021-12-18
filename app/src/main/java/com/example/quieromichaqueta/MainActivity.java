package com.example.quieromichaqueta;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button product;
    private Button servicio;
    private Button sucursal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        product = (Button) findViewById(R.id.product);
        product.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent productos = new Intent(getApplicationContext(), MainActivity2.class);
                startActivity(productos);
            }
        });

        servicio = (Button) findViewById(R.id.servicio);
        servicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent servicio = new Intent(getApplicationContext(), MainActivity3.class);
                startActivity(servicio);
            }
        });
        sucursal = (Button) findViewById(R.id.sucursal);
        sucursal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sucursal = new Intent(getApplicationContext(), MainActivity4.class);
                startActivity(sucursal);
            }
        });
    }

    //Metodo para mostrar y ocultar el menu
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menugeneral, menu);
        return true;
    }

    //Metodo para agregar las acciones
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.productos) {
            Toast.makeText(this, " has seleccionado Productos", Toast.LENGTH_LONG).show();
            Intent productos = new Intent(this, MainActivity2.class);
            startActivity(productos);
        }
        if (id == R.id.servicios) {
            Toast.makeText(this, "  has seleccionado Servicios", Toast.LENGTH_LONG).show();
            Intent servicios = new Intent(this, MainActivity3.class);
            startActivity(servicios);
        }
        if (id == R.id.sucursales) {
            Toast.makeText(this, "  has seleccionado Sucursales", Toast.LENGTH_LONG).show();
            Intent sucursales = new Intent(this, MainActivity4.class);
            startActivity(sucursales);
        }
        return super.onOptionsItemSelected(item);

    }
}