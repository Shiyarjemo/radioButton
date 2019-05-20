package com.example.opdracht;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {
public static boolean antwoord;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                RadioButton radioButton;


                radioButton = (RadioButton) findViewById(R.id.mainActivity);

                if(radioButton.isChecked()){
                    antwoordPagina();
                    MainActivity.antwoord = true;
                }
                else{
                    MainActivity.antwoord = false;
                    antwoordPagina();
                }



            }
        });


    }

    public void antwoordPagina(){

        Intent intent = new Intent(this,Antwoord.class);
        startActivity(intent);
    }
}
