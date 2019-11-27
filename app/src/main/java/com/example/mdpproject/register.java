package com.example.mdpproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class register extends AppCompatActivity {
    EditText eduser,edpass;
    Button btnregis,btntologin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        eduser = findViewById(R.id.edusername_register);
        edpass = findViewById(R.id.edpassword_register);
        btnregis = findViewById(R.id.btnregister);
        btnregis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //register
            }
        });
        btntologin = findViewById(R.id.btntologin);
        btntologin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent t = new Intent(register.this,MainActivity.class);
                startActivity(t);
            }
        });
    }
}
