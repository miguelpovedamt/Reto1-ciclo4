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
import android.widget.TableLayout;
import android.widget.TextView;
import android.widget.Toast;

//metodo principal de nuestra actividad
public class MainActivity extends AppCompatActivity {

    //declara un boton para comprar
    private Button btnComprar1;

    //declara un boton para comprar
    private Button btnComprar2;

    //declara un boton para buscar
    private Button btnBuscar;

    //declara un visor de texto
    private TextView txtLLanta;

    @Override
    //sobrescribe el metodo cuando se crea la actividad
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //declara una barra de accion
        ActionBar barraMenu = getSupportActionBar();

        //muestra la barra de acciones en la pantalla
        barraMenu.setDisplayShowHomeEnabled(true);

        //determina un logo previamente guardado
        barraMenu.setLogo(R.mipmap.ic_launcher);

        //muestra un titulo en la barra de acciones
        barraMenu.setTitle("Productos");

        //muestra un subtitulo en la barra de acciones
        barraMenu.setSubtitle("Elige un producto");

        //muestra un logo previamente determinado
        barraMenu.setDisplayUseLogoEnabled(true);

        //cambiar el color de la barra para que siempre sea el mismo
        barraMenu.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#313d8c")));


        //busca por id el boton de comprar 1
        btnComprar1 = (Button) findViewById(R.id.btnServicio2);


        //crea un action listener para el boton comprar 1
        btnComprar1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               txtLLanta = (TextView) findViewById(R.id.nombreLLanta1);
                Toast.makeText(getApplicationContext(),
                        "usted a seleccionado: "+txtLLanta.getText().toString(),Toast.LENGTH_SHORT).show();
            }
        });

        //busca por id el boton de comprar 2
        btnComprar2 = (Button) findViewById(R.id.btnComprar2);

        //crea un action listener para el boton comprar 2
        btnComprar2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtLLanta = (TextView) findViewById(R.id.nombreLLanta2);
                Toast.makeText(getApplicationContext(),
                        "usted a seleccionado: "+txtLLanta.getText().toString(),Toast.LENGTH_LONG).show();
            }
        });

        //busca por id el boton de buscar
        btnComprar2 = (Button) findViewById(R.id.btnbuscar);

        //crea un action listener para el boton comprar 2
        btnComprar2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtLLanta = (TextView) findViewById(R.id.nombreLLanta2);
                Toast.makeText(getApplicationContext(),
                        "El boton de buscar se habilitara pronto",Toast.LENGTH_LONG).show();
            }
        });

    }


    @Override
    //sobrescribe el metodo de creacion de menu
    public boolean onCreateOptionsMenu(Menu menuPrincipal) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.mimnu,menuPrincipal);
        return true;
    }
    @Override
    //determina que accion se va a ejecutar dependiendo de eleccion en el menu
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