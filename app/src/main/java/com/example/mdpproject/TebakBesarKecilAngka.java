package com.example.mdpproject;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class TebakBesarKecilAngka extends AppCompatActivity {
    TextView tvScore,tvAngka;
    Button btnUp,btnDown,btnClose;
    int score=0;
    int angka=0;
    int angkaCek=0;
    Random rand;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tebak_besar_kecil_angka);
        tvScore=findViewById(R.id.tvScore_Tebak_Angka);
        tvAngka=findViewById(R.id.tvAngka_Tebak_Angka);
        btnUp=findViewById(R.id.btnUp_Tebak_Angka);
        btnDown=findViewById(R.id.btnDown_Tebak_Angka);
        btnClose=findViewById(R.id.btnExit_Tebak_Angka);
        btnUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                angkaCek=angka;
                generateAngka();
                if(angkaCek<angka){
                    updateScore(score+10);
                    Toast.makeText(TebakBesarKecilAngka.this, "Kamu Menjawab Dengan Benar", Toast.LENGTH_SHORT).show();
                }else{
                    updateScore(score-5);
                    Toast.makeText(TebakBesarKecilAngka.this, "Kamu Kurang Beruntung", Toast.LENGTH_SHORT).show();
                }
            }
        });
        btnDown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                angkaCek=angka;
                generateAngka();
                if(angkaCek>angka){
                    updateScore(score+10);
                    Toast.makeText(TebakBesarKecilAngka.this, "Kamu Menjawab Dengan Benar", Toast.LENGTH_SHORT).show();
                }else{
                    updateScore(score-5);
                    Toast.makeText(TebakBesarKecilAngka.this, "Kamu Kurang Beruntung", Toast.LENGTH_SHORT).show();
                }
            }
        });
        btnClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TebakBesarKecilAngka.this,home.class);
                startActivity(intent);
            }
        });
        updateScore(score);
        generateAngka();
    }

    public void generateAngka(){
        rand = new Random();
        angka = rand.nextInt(101)+1;
        tvAngka.setText(angka+"");
    }

    public void updateScore(int scoreBaru){
        score = scoreBaru;
        if(score<0){score=0;}
        tvScore.setText("Score : "+scoreBaru);
    }
}
