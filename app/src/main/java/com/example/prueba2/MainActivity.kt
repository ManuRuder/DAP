package com.manadigital.userinterface1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    TextView tv;
    Button btn1;
    Button btn2:

        override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

            tv = (TextView) findViewByid(R.id.textView);              //Referencia de vistas al xml
            btn1 = (Button) findViewByid(R.id.buttonShow);
            btn2 = (Button) findViewByid(R.id.buttonHide);

            btn1.setOnClickListener(new View.On.ClickListener() {
            public void onClick(View v){
             tv.setText("Hola");

            }

            } );
            btn2.setOnClickListener(new View.On.ClickListener() {
                public void onClick(View v){
                    tv.setText("");

                }

            } );


        }
    }
