package com.example.uczen.juicetea;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity1 extends AppCompatActivity {

Button p1,p2,p3,p4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);

        p1 = (Button) findViewById(R.id.button3);

        p1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Scene1.class);
                startActivity(intent);

            }
        });

        p2 = (Button) findViewById(R.id.button4);

        p2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Scene2.class);
                startActivity(intent);

            }
              });
        p3 = (Button) findViewById(R.id.button1);

        p3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Scene3.class);
                startActivity(intent);

            }
        });
        p4 = (Button) findViewById(R.id.button2);

        p4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Scene4.class);
                startActivity(intent);

            }
    });
    }
}