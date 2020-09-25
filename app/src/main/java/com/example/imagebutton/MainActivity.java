package com.example.imagebutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Fiesta(View view){
        Toast.makeText(this,"Esta imagen es de Fiesta", Toast.LENGTH_LONG).show();
    }
    public void Cerveza(View view){
        Toast.makeText(this,"Esta imagen es de choque de cervezas", Toast.LENGTH_LONG).show();
    }
}