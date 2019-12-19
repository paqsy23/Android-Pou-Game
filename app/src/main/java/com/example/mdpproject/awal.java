package com.example.mdpproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class awal extends AppCompatActivity {

    Button btn1,btn2,btn3;
    boolean coba = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_awal);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);

    }
    public void klik(View v){
        if(v.getId() == btn1.getId()){
            Intent t = new Intent(awal.this,MainActivity.class);
            t.putExtra("arrnama",nama);
            t.putExtra("arrscore",score);
            startActivity(t);
        }if(v.getId() == btn2.getId()){
            sort();
            Intent t = new Intent(awal.this,highscore.class);
            t.putExtra("arrnama",nama);
            t.putExtra("arrscore",score);
            startActivity(t);
        }if(v.getId() == btn3.getId()){
            Intent t = new Intent(awal.this,undang.class);
            startActivity(t);
        }
    }
    public void sort(){
        int[] a = new int[score.size()];
        String[] b = new String[nama.size()];
        for(int i = 0;i < score.size();i++) {
            a[i] = score.get(i);
            b[i] = nama.get(i);
        }
        nama.clear();
        score.clear();
        for(int i = 0;i < a.length;i++){
            for(int j = 0;j < a.length;j++){
                int ctr = 0;
                String ctrn = "";
                if(a[i] > a[j]){
                    ctr = a[i];
                    ctrn = b[i];
                    a[i] = a[j];
                    b[i] = b[j];
                    a[j] = ctr;
                    b[j] = ctrn;
                }
            }
        }
        for(int i = 0;i < a.length;i++) {
            nama.add(b[i]);
            score.add(a[i]);
        }
    }
}
