package com.example.menuspri;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatActivity;



    public class MenuOpcionesActivity extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
        }

        @Override
        public boolean onCreateOptionsMenu(Menu menu) {
            getMenuInflater().inflate(R.menu.menu_opciones, menu);
            return true;
        }

        @Override
        public boolean onOptionsItemSelected(MenuItem item) {
            int id = item.getItemId();


            if (id == R.id.context)
                Toast.makeText(this, "Ir a Menu Contextual", Toast.LENGTH_SHORT).show();
            if (id == R.id.popup)
                Toast.makeText(this, "Ir a Menu Popup", Toast.LENGTH_SHORT).show();
            if (id == R.id.principal)
                Toast.makeText(this, "Regresar al Menú Principal", Toast.LENGTH_SHORT).show();
            if (id == R.id.salir)
            { Toast.makeText(this, "Salir de la App", Toast.LENGTH_SHORT).show();
                    finishAffinity();}




            return super.onOptionsItemSelected(item);
        }
    }


