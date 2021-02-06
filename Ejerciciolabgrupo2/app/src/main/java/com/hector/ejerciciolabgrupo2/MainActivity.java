package com.hector.ejerciciolabgrupo2;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private EditText n1, n2, n3;
    private TextView vista1, vista2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        n1 = (EditText) findViewById(R.id.n1);
        n2 = (EditText) findViewById(R.id.n2);
        n3 = (EditText) findViewById(R.id.n3);
        vista1 = (TextView) findViewById(R.id.vista1);
        vista2 = (TextView) findViewById(R.id.vista2);

    }
    public void promedio(View view ){
        String v1 = n1.getText().toString();
        String v2 = n2.getText().toString();
        String v3 = n3.getText().toString();

        int num1 = Integer.parseInt(v1);
        int num2 = Integer.parseInt(v2);
        int num3 = Integer.parseInt(v3);

        float prom = (num1+num2+num3)/3;
        String result;
        if(prom>=7){
            result="Promocionado";
        }else if(prom>=4 && prom<7){
            result = "Regular";
        }else{
            result = "Reprobado";
        }
        vista1.setText("El Promedio es: "+ prom);
        vista2.setText("El estudiante esta: "+ result);
    }
}