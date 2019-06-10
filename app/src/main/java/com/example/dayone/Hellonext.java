package com.example.dayone;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Hellonext extends AppCompatActivity {
    TextView t2; //objects are declared it is grey cz its not used yet
    Button b2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hellonext);
        t2=findViewById(R.id.editText);//element of that id is binded by the edittext
        b2=findViewById(R.id.button);//r.id.button is an integer value and above button is object


        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v2) {

                Toast.makeText(Hellonext.this, "chanting..", Toast.LENGTH_SHORT).show();
                Intent i2 = new Intent(Hellonext.this, MainActivity.class);
                startActivity(i2);
            }
        });

    }
}