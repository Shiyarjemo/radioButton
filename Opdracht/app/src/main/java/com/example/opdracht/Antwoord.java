package com.example.opdracht;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class Antwoord extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_antwoord);

        MainActivity mainActivity = new MainActivity();
        TextView textView = (TextView) findViewById(R.id.resultaat);

        if(MainActivity.antwoord ==false){
            textView.setText("fout antwoord");
        }
        if(MainActivity.antwoord ==true){
            textView.setText("Goed antwoord");
        }





        Button button2 = (Button) findViewById(R.id.button2);

        button2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                terug();

            }
        });
    }
    public void terug(){

        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}

