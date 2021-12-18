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

public class MainActivity4 extends AppCompatActivity {
    private Button inicio3;
    private Button productos3;
    private Button servicios3;
    Drawable drawable;
    ImageView bogota, medellin, cali;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        //--------------------imagenes-----------
        Resources res1 = getResources();
        drawable = res1.getDrawable(R.drawable.bogota, getTheme());

        bogota= (ImageView) findViewById(R.id.bogota);
        bogota.setImageDrawable(drawable);

        Resources res2 = getResources();
        drawable = res2.getDrawable(R.drawable.medellin, getTheme());

        medellin = (ImageView) findViewById(R.id.medellin);
        medellin.setImageDrawable(drawable);

        Resources res3 = getResources();
        drawable = res3.getDrawable(R.drawable.cali, getTheme());

        cali = (ImageView) findViewById(R.id.cali);
        cali.setImageDrawable(drawable);
        //------------------------------------------------

        inicio3 = (Button) findViewById(R.id.inicio3);
        inicio3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inicio3 = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(inicio3);
            }
        });

        productos3 = (Button) findViewById(R.id.producto3);
        productos3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent productos3 = new Intent(getApplicationContext(), MainActivity2.class);
                startActivity(productos3);
            }
        });
        servicios3 = (Button) findViewById(R.id.servicios3);
        servicios3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent servicios3 = new Intent(getApplicationContext(), MainActivity3.class);
                startActivity(servicios3);
            }
        });
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu4, menu);
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
        if (id == R.id.productos) {
            Toast.makeText(this, "  has seleccionado Productos", Toast.LENGTH_LONG).show();
            Intent productos =new Intent(this,MainActivity2.class);
            startActivity(productos);
        }
        if (id == R.id.servicios) {
            Toast.makeText(this, "  has seleccionado Servicios", Toast.LENGTH_LONG).show();
            Intent servicios =new Intent(this,MainActivity3.class);
            startActivity(servicios);
        }
        return super.onOptionsItemSelected(item);

    }
}