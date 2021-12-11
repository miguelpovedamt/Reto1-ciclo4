package com.example.tiresportapp;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class servicios extends AppCompatActivity {

    //declara un boton para cotizar servicio
    private Button btnServircio1;

    //declara un boton para cotizar servicio
    private Button btnServircio2;

    //declara un boton para cotizar servicio
    private Button btnServircio3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_servicios);
        ActionBar barraMenu = getSupportActionBar();

        barraMenu.setDisplayShowHomeEnabled(true);
        barraMenu.setLogo(R.mipmap.ic_launcher);
        barraMenu.setTitle("Servicios");
        barraMenu.setSubtitle("Elige un servicio");
        barraMenu.setDisplayUseLogoEnabled(true);
        barraMenu.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#313d8c")));

        //busca por id el boton de servicio1
        btnServircio1= (Button) findViewById(R.id.btnservicio1);

        //crea un action listener para el boton servicio1
        btnServircio1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),
                        "usted a seleccionado el servicio de montallantas ",Toast.LENGTH_LONG).show();
            }
        });

        //busca por id el boton de servicio2
        btnServircio2= (Button) findViewById(R.id.btnServicio2);

        //crea un action listener para el boton servicio2
        btnServircio2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),
                        "usted a seleccionado el servicio de cambio de aceite ",Toast.LENGTH_LONG).show();
            }
        });

        //busca por id el boton de servicio3
        btnServircio3= (Button) findViewById(R.id.btnServicio3);

        //crea un action listener para el boton servicio3
        btnServircio3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),
                        "usted a seleccionado el servicio de paso de corriente ",Toast.LENGTH_LONG).show();
            }
        });
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menuPrincipal) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.mimnu,menuPrincipal);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected (MenuItem menuItem){
        switch (menuItem.getItemId())
        {
            case R.id.botonProductos:
                Intent principal = new Intent(getApplicationContext(),MainActivity.class );
                startActivity(principal);
                return true;

            case R.id.botonServicios:
                Intent servicios = new Intent(getApplicationContext(), servicios.class);
                startActivity(servicios);
                return true;

            case R.id.botonSucursales:
                Intent sucursales = new Intent(getApplicationContext(), sucursales.class);
                startActivity(sucursales);
                return true;

            case R.id.carrito:
                Toast.makeText(getApplicationContext(),
                        "El carrito se habilitara pronto",Toast.LENGTH_LONG).show();

            default:
                return true;


        }


    }


}