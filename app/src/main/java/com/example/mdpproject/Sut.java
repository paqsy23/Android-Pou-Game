package com.example.mdpproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class Sut extends AppCompatActivity {
    ImageView imgMusuh,imgPlayer,btnGunting,btnBatu,btnKertas;
    Button btnExit;
    TextView tvScore;
    int playerPil = 0;
    int musuhPil = 0;
    Random rand;
    int score;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sut);
        btnExit=findViewById(R.id.btnExit_Sut);
        imgMusuh=findViewById(R.id.imgMusuh_Sut);
        imgPlayer=findViewById(R.id.imgPlayer_Sut);
        tvScore=findViewById(R.id.tvScore_Sut);
        btnGunting=findViewById(R.id.btnGunting_Sut);
        btnBatu=findViewById(R.id.btnBatu_Sut);
        btnKertas=findViewById(R.id.btnKertas_Sut);
        btnExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Sut.this,home.class);
                startActivity(intent);
            }
        });
        btnGunting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gerakPlayer(0);
            }
        });
        btnBatu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gerakPlayer(1);
            }
        });
        btnKertas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gerakPlayer(2);
            }
        });
        updateScore(0);
    }
    public void gerakPlayer(int pil){
        rand=new Random();
        musuhPil=rand.nextInt(3);
        playerPil=pil;
        if(playerPil==0){
            imgPlayer.setImageResource(R.drawable.gunting);
            if(musuhPil==2){
                updateScore(score+10);
            }
        }else if(playerPil==1){
            imgPlayer.setImageResource(R.drawable.batu);
            if(musuhPil==0){
                updateScore(score+10);
            }
        }else if(playerPil==2){
            imgPlayer.setImageResource(R.drawable.kertas);
            if(musuhPil==1){
                updateScore(score+10);
            }
        }
        if(musuhPil==0){
            imgMusuh.setImageResource(R.drawable.gunting);
        }else if(musuhPil==1){
            imgMusuh.setImageResource(R.drawable.batu);
        }else if(musuhPil==2){
            imgMusuh.setImageResource(R.drawable.kertas);
        }
    }
    public void updateScore(int scoreBaru){
        tvScore.setText("Score : "+scoreBaru);
        score = scoreBaru;
    }
}
