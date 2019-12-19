package com.example.mdpproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class TicTacToe extends AppCompatActivity {
    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9;
    int giliran=0;
    String main="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tic_tac_toe);

        btn1=findViewById(R.id.btn1);
        btn2=findViewById(R.id.btn2);
        btn3=findViewById(R.id.btn3);
        btn4=findViewById(R.id.btn4);
        btn5=findViewById(R.id.btn5);
        btn6=findViewById(R.id.btn6);
        btn7=findViewById(R.id.btn7);
        btn8=findViewById(R.id.btn8);
        btn9=findViewById(R.id.btn9);
    }

    public void onClick(View v){
        switch (v.getId()){
            case R.id.btn1:
                if(btn1.getTag()==null) {
                    pasang();
                    btn1.setText(main);
                    btn1.setTag("isi");
                }
                break;
            case R.id.btn2:
                if(btn2.getTag()==null){
                    pasang();
                    btn2.setText(main);
                    btn2.setTag("isi");
                }
                break;
            case R.id.btn3:
                if(btn3.getTag()==null){
                    pasang();
                    btn3.setText(main);
                    btn3.setTag("isi");
                }
                break;
            case R.id.btn4:
                if(btn4.getTag()==null){
                    pasang();
                    btn4.setText(main);
                    btn4.setTag("isi");
                }
                break;
            case R.id.btn5:
                if(btn5.getTag()==null){
                    pasang();
                    btn5.setText(main);
                    btn5.setTag("isi");
                }
                break;
            case R.id.btn6:
                if(btn6.getTag()==null){
                    pasang();
                    btn6.setText(main);
                    btn6.setTag("isi");
                }
                break;
            case R.id.btn7:
                if(btn7.getTag()==null){
                    pasang();
                    btn7.setText(main);
                    btn7.setTag("isi");
                }
                break;
            case R.id.btn8:
                if(btn8.getTag()==null){
                    pasang();
                    btn8.setText(main);
                    btn8.setTag("isi");
                }
                break;
            case R.id.btn9:
                if(btn9.getTag()==null){
                    pasang();
                    btn9.setText(main);
                    btn9.setTag("isi");
                }
                break;
        }
    }
    
    public void pasang(){
        if(giliran==0){
            main="X";
            giliran=1;
        }else{
            main="O";
            giliran=0;
        }
    }
    public void cek(){
        if(btn1.getText()=="X" && btn2.getText()=="X" && btn3.getText()=="X"){
            Toast.makeText(this, "Menang", Toast.LENGTH_SHORT).show();
        }
    }
}
