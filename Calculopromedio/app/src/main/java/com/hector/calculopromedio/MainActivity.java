package com.hector.calculopromedio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText txtName, note1, note2, note3, note4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtName = (EditText)findViewById(R.id.txname);
        note1 = (EditText)findViewById(R.id.txnote1);
        note2 = (EditText)findViewById(R.id.txnote2);
        note3 = (EditText)findViewById(R.id.txnote3);
        note4 = (EditText)findViewById(R.id.txnote4);
    }
    public void activateSecondActivity(View v){
        Intent i = new Intent(this, Prom.class);
        float grade1 = 0, grade2 = 0, grade3 = 0, grade4 = 0, avg;
        String message1 = "", message2 = "";
        grade1 = Float.valueOf(note1.getText().toString());
        grade2 = Float.valueOf(note2.getText().toString());
        grade3 = Float.valueOf(note3.getText().toString());
        grade4 = Float.valueOf(note4.getText().toString());
        avg = (grade1 + grade2 + grade3 + grade4) / 4;
        if(avg <= 5){
            message1 = "Reprobado";
        }else if(avg > 5 && avg < 7){
            message1 = "Regular";
        }else if(avg > 7 && avg <= 10){
            message1 = "Excelente";
            message2 = "Felicidades continua así";
        }
        i.putExtra("name",txtName.getText().toString());
        i.putExtra("avg",String.valueOf(avg));
        i.putExtra("state",message1);
        i.putExtra("congrats",message2);
        startActivity(i);
    }
}





