package com.example.dayone;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText editText; //objects are declared it is grey cz its not used yet
    Button button;
    String s;
    TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);//setting the environment in java
        editText=findViewById(R.id.editText);//element of that id is binded by the edittext
        button=findViewById(R.id.button);//r.id.button is an integer value and above button is object
        textView=findViewById(R.id.TextView);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s=editText.getText().toString().trim();
                Toast.makeText(MainActivity.this, "hare krishna "+s, Toast.LENGTH_SHORT).show();
                textView.setText(s);
                textView.setGravity(View.TEXT_ALIGNMENT_CENTER);
                textView.setTextSize(20);
                textView.setTextColor(getResources().getColor(R.color.colorAccent));
                textView.setAllCaps(true);
                Intent intent = new Intent(MainActivity.this,Hello.class);
                startActivity(intent);

            }
        });

    }
}
