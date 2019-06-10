package com.example.dayone;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Hello extends AppCompatActivity {
    TextView t1; //objects are declared it is grey cz its not used yet
    Button b1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello);
        t1=findViewById(R.id.TextView);//element of that id is binded by the edittext
        b1=findViewById(R.id.button2);//r.id.button is an integer value and above button is object

        b1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v1) {
                Toast.makeText(Hello.this, "well done!!", Toast.LENGTH_SHORT).show();

                Intent i1 = new Intent(Hello.this,Hellonext.class);
                startActivity(i1);

            }
        });

    }
}
