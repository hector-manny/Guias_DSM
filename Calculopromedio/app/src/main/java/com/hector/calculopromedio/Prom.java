package com.hector.calculopromedio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.view.View;

public class Prom extends AppCompatActivity {
    private TextView tvName, tvAvg, tvState, tvCongrat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prom);
        tvName = (TextView)findViewById(R.id.nameAl);
        tvAvg = (TextView)findViewById(R.id.nprom);
        tvState = (TextView)findViewById(R.id.estado);
        tvCongrat = (TextView)findViewById(R.id.mensaje);
        Bundle bund = getIntent().getExtras();

        String named = bund.getString("name");
        String avgd = bund.getString("avg");
        String stated = bund.getString("state");
        String congratd = bund.getString("congrats");

        tvName.setText(named);
        tvAvg.setText(avgd);
        tvState.setText(stated);
        tvCongrat.setText(congratd);


    }
    public void finished(View v){
        Intent j = new Intent(this, MainActivity.class);
        startActivity(j);
    }
}