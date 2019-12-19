package com.example.mdpproject;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class g256 extends AppCompatActivity {

    TextView [][] ArrLabel;
    TextView score;
    TextView t1;
    TextView t2;
    TextView t3;
    TextView t4;
    TextView t5;
    TextView t6;
    TextView t7;
    TextView t8;
    TextView t9;
    TextView t10;
    TextView t11;
    TextView t12;
    TextView t13;
    TextView t14;
    TextView t15;
    TextView t16;
    Button btnReset;
    Button btn_Up;
    Button btn_Down;
    Button btn_Left;
    Button btn_Right;
    int htgScore;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_g256);
        ArrLabel = new TextView[4][4];
        score = findViewById(R.id.score);
        htgScore=0;
        t1 = findViewById(R.id.textView1);
        t2 = findViewById(R.id.textView2);
        t3 = findViewById(R.id.textView3);
        t4 = findViewById(R.id.textView4);
        t5 = findViewById(R.id.textView5);
        t6 = findViewById(R.id.textView6);
        t7 = findViewById(R.id.textView7);
        t8 = findViewById(R.id.textView8);
        t9 = findViewById(R.id.textView9);
        t10 = findViewById(R.id.textView10);
        t11 = findViewById(R.id.textView11);
        t12 = findViewById(R.id.textView12);
        t13 = findViewById(R.id.textView13);
        t14 = findViewById(R.id.textView14);
        t15 = findViewById(R.id.textView15);
        t16 = findViewById(R.id.textView16);

        ArrLabel[0][0] = t1;
        ArrLabel[0][1] = t2;
        ArrLabel[0][2] = t3;
        ArrLabel[0][3] = t4;
        ArrLabel[1][0] = t5;
        ArrLabel[1][1] = t6;
        ArrLabel[1][2] = t7;
        ArrLabel[1][3] = t8;
        ArrLabel[2][0] = t9;
        ArrLabel[2][1] = t10;
        ArrLabel[2][2] = t11;
        ArrLabel[2][3] = t12;
        ArrLabel[3][0] = t13;
        ArrLabel[3][1] = t14;
        ArrLabel[3][2] = t15;
        ArrLabel[3][3] = t16;

        btn_Down = findViewById(R.id.btn_Down);
        btn_Up = findViewById(R.id.btn_Up);
        btn_Left = findViewById(R.id.btn_Left);
        btn_Right = findViewById(R.id.btn_Right);
        btnReset = findViewById(R.id.btnReset);

        gameStart();
    }

    public void klikArah(View view){
        Boolean start = false;
        switch (view.getId() ){
            case R.id.btnReset:
                start = true;
            break;
            case R.id.btn_Down:
                down();
                break;
            case R.id.btn_Left:
                left();
                break;
            case R.id.btn_Right:
                right();
                break;
            case R.id.btn_Up:
                up();
                break;
            }

        Random r = new Random();
        int rand1=0;
        int rand2=0;
        int isi=0;
        int counter = 0;
        int counterKosong = 0;
        int countJalan = 0;

        for (int i = 0; i<4; i++){
            for (int j = 0; j<4; j++){
                if(ArrLabel[i][j].getText().equals("")){
                    counterKosong++;
                }
            }
        }

        for (int i = 0; i<4; i++){
            for (int j = 0; j<4; j++){
                if(i!=3 && j!=3){
                    if(ArrLabel[i][j].getText().equals(ArrLabel[i][j+1].getText()) || ArrLabel[i][j].getText().equals(ArrLabel[i+1][j].getText())){
                        counter++;
                    }
                }else if(i!=3 && j==3){
                    if (ArrLabel[i][j].getText().equals(ArrLabel[i+1][j].getText())){
                        counter++;
                    }
                }

            }
        }
//
        if (counterKosong>0){
            do {
                r=new Random();
                rand1=r.nextInt(4);
                r=new Random();
                rand2=r.nextInt(4);
                r=new Random();
                isi=(r.nextInt(2)+1)*2;
                counterKosong=0;
                for (int i = 0; i<4; i++){
                    for (int j = 0; j<4; j++){
                        if(ArrLabel[i][j].getText().equals("")){
                            counterKosong = counterKosong+1;
                        }
                    }
                }
            }while (!ArrLabel[rand1][rand2].getText().equals(""));
                ArrLabel[rand1][rand2].setText(isi+"");
            counter=0;
            counterKosong=0;
            for (int i = 0; i<4; i++){
                for (int j = 0; j<4; j++){
                    if(ArrLabel[i][j].getText().equals("")){
                        counterKosong++;
                    }
                }
            }
            for (int i = 0; i<4; i++){
                for (int j = 0; j<4; j++){
                    if(i!=3 && j!=3){
                        if(ArrLabel[i][j].getText().equals(ArrLabel[i][j+1].getText()) || ArrLabel[i][j].getText().equals(ArrLabel[i+1][j].getText())){
                            counter++;
                        }
                    }else if(i!=3 && j==3){
                        if (ArrLabel[i][j].getText().equals(ArrLabel[i+1][j].getText())){
                            counter++;
                        }
                    }

                }
            }

        }
        if(counter==0 && counterKosong==0){
            Toast.makeText(this, "You Lose!!!!", Toast.LENGTH_LONG).show();
            btn_Down.setVisibility(View.INVISIBLE);
            btn_Up.setVisibility(View.INVISIBLE);
            btn_Right.setVisibility(View.INVISIBLE);
            btn_Left.setVisibility(View.INVISIBLE);
        }

        if (start == true){
            gameStart();
        }
        for (int i = 0; i<4; i++){
            for (int j = 0; j<4; j++){
                if (ArrLabel[i][j].getText().equals("")){
                    ArrLabel[i][j].setBackgroundColor(Color.TRANSPARENT);
                }else if (ArrLabel[i][j].getText().equals("2")){
                    ArrLabel[i][j].setBackgroundColor(Color.rgb(0,60,255));
//                    hitungScore=hitungScore+2;
                }else if (ArrLabel[i][j].getText().equals("4")){
                    ArrLabel[i][j].setBackgroundColor(Color.rgb(0,175,255));
//                    hitungScore=hitungScore+4;
                }else if (ArrLabel[i][j].getText().equals("8")){
                    ArrLabel[i][j].setBackgroundColor(Color.rgb(0,255,255));
//                    hitungScore=hitungScore+8;
                }else if (ArrLabel[i][j].getText().equals("16")){
                    ArrLabel[i][j].setBackgroundColor(Color.rgb(0,255,100));
//                    hitungScore=hitungScore+16;
                }else if (ArrLabel[i][j].getText().equals("32")){
                    ArrLabel[i][j].setBackgroundColor(Color.rgb(200,255,0));
//                    hitungScore=hitungScore+32;
                }else if (ArrLabel[i][j].getText().equals("64")){
                    ArrLabel[i][j].setBackgroundColor(Color.rgb(255,140,0));
//                    hitungScore=hitungScore+64;
                }else if (ArrLabel[i][j].getText().equals("128")){
                    ArrLabel[i][j].setBackgroundColor(Color.rgb(255,0,0));
//                    hitungScore=hitungScore+128;
                    Toast.makeText(this, "You've Clear The Game!!!!", Toast.LENGTH_LONG).show();
                    btn_Down.setVisibility(View.INVISIBLE);
                    btn_Up.setVisibility(View.INVISIBLE);
                    btn_Right.setVisibility(View.INVISIBLE);
                    btn_Left.setVisibility(View.INVISIBLE);
                }
            }
        }
        score.setText("Score : " + htgScore);


        }

    public void gameStart(){
        htgScore=0;
        score.setText("Score : 0");
        for (int i=0; i<4; i++){
            for (int j=0; j<4; j++){
                ArrLabel[i][j].setText("");
//                ArrLabel[i][j].setVisibility(View.INVISIBLE);
                ArrLabel[i][j].setText("");
                ArrLabel[i][j].setBackgroundColor(Color.TRANSPARENT);
            }
        }
        Random r = new Random();
        int rand1=r.nextInt(4);
        r=new Random();
        int rand2=r.nextInt(4);
        r=new Random();
        int isi=2;
        ArrLabel[rand1][rand2].setText(isi+"");
        ArrLabel[rand1][rand2].setBackgroundColor(Color.rgb(0,60,255));
        do {
            r=new Random();
            rand1=r.nextInt(4);
            r=new Random();
            rand2=r.nextInt(4);
            r=new Random();
        }while (!ArrLabel[rand1][rand2].getText().equals(""));
        ArrLabel[rand1][rand2].setText(isi+"");
        ArrLabel[rand1][rand2].setBackgroundColor(Color.rgb(0,60,255));
        btn_Down.setVisibility(View.VISIBLE);
        btn_Up.setVisibility(View.VISIBLE);
        btn_Right.setVisibility(View.VISIBLE);
        btn_Left.setVisibility(View.VISIBLE);

    }


    public void right(){
        int i1=0;
        int i2=0;
        int i3=0;
        int i4=0;
        for (int i=0; i<4; i++){
            for (int j=0; j<4; j++){
                if (ArrLabel[i][j].getText().equals("")){
                }else{
                    if (i==0){
                        if(j!=3 && i1==0){
                            if (ArrLabel[i][j].getText().equals(ArrLabel[i][j+1].getText())){
                                String tampung1 = (String) ArrLabel[i][j].getText();
                                String tampung2 = (String) ArrLabel[i][j+1].getText();
                                int temp = Integer.parseInt(tampung1)+Integer.parseInt(tampung2);
                                htgScore+=temp;
                                ArrLabel[i][j+1].setText(temp+"");
                                ArrLabel[i][j].setText("");
                                i1++;
                            }else if(ArrLabel[i][j+1].getText().equals("")){
                                ArrLabel[i][j+1].setText(ArrLabel[i][j].getText());
                                ArrLabel[i][j].setText("");
                            }

                        }
                    }else if (i==1){
                        if(j!=3 && i2==0){
                            if (ArrLabel[i][j].getText().equals(ArrLabel[i][j+1].getText())){
                                String tampung1 = (String) ArrLabel[i][j].getText();
                                String tampung2 = (String) ArrLabel[i][j+1].getText();
                                int temp = Integer.parseInt(tampung1)+Integer.parseInt(tampung2);
                                htgScore+=temp;
                                ArrLabel[i][j+1].setText(temp+"");
                                ArrLabel[i][j].setText("");
                                i2++;
                            }else if(ArrLabel[i][j+1].getText().equals("")){
                                ArrLabel[i][j+1].setText(ArrLabel[i][j].getText());
                                ArrLabel[i][j].setText("");
                            }

                        }
                    }else if (i==2){
                        if(j!=3 && i3==0){
                            if (ArrLabel[i][j].getText().equals(ArrLabel[i][j+1].getText())){
                                String tampung1 = (String) ArrLabel[i][j].getText();
                                String tampung2 = (String) ArrLabel[i][j+1].getText();
                                int temp = Integer.parseInt(tampung1)+Integer.parseInt(tampung2);
                                htgScore+=temp;
                                ArrLabel[i][j+1].setText(temp+"");
                                ArrLabel[i][j].setText("");
                                i3++;
                            }else if(ArrLabel[i][j+1].getText().equals("")){
                                ArrLabel[i][j+1].setText(ArrLabel[i][j].getText());
                                ArrLabel[i][j].setText("");
                            }

                        }
                    }else if (i==3){
                        if(j!=3 && i4==0){
                            if (ArrLabel[i][j].getText().equals(ArrLabel[i][j+1].getText())){
                                String tampung1 = (String) ArrLabel[i][j].getText();
                                String tampung2 = (String) ArrLabel[i][j+1].getText();
                                int temp = Integer.parseInt(tampung1)+Integer.parseInt(tampung2);
                                htgScore+=temp;
                                ArrLabel[i][j+1].setText(temp+"");
                                ArrLabel[i][j].setText("");
                                i4++;
                            }else if(ArrLabel[i][j+1].getText().equals("")){
                                ArrLabel[i][j+1].setText(ArrLabel[i][j].getText());
                                ArrLabel[i][j].setText("");
                            }

                        }
                    }

                }
            }

        }
        for (int i = 0; i<4; i++){
            for (int j = 0; j<4; j++){
                if (j!=3){
                    if(ArrLabel[i][j+1].getText().equals("")){
                        ArrLabel[i][j+1].setText(ArrLabel[i][j].getText());
                        ArrLabel[i][j].setText("");
                    }
                }

            }
        }
    }public void left(){
        int i1=0;
        int i2=0;
        int i3=0;
        int i4=0;
//        Toast.makeText(this, "Left", Toast.LENGTH_SHORT).show();
        for (int i=0; i<4; i++){
            for (int j=3; j>=0; j--){
                if (ArrLabel[i][j].getText().equals("")){
                }else{
                    if (i==0){
                        if(j!=0 && i1==0){
                            if (ArrLabel[i][j].getText().equals(ArrLabel[i][j-1].getText())){
                                String tampung1 = (String) ArrLabel[i][j].getText();
                                String tampung2 = (String) ArrLabel[i][j-1].getText();
                                int temp = Integer.parseInt(tampung1)+Integer.parseInt(tampung2);
                                htgScore+=temp;
                                ArrLabel[i][j-1].setText(temp+"");
                                ArrLabel[i][j].setText("");
                                i1++;
                            }else if(ArrLabel[i][j-1].getText().equals("")){
                                ArrLabel[i][j-1].setText(ArrLabel[i][j].getText());
                                ArrLabel[i][j].setText("");
                            }

                        }
                    }else if (i==1){
                        if(j!=0 && i2==0){
                            if (ArrLabel[i][j].getText().equals(ArrLabel[i][j-1].getText())){
                                String tampung1 = (String) ArrLabel[i][j].getText();
                                String tampung2 = (String) ArrLabel[i][j-1].getText();
                                int temp = Integer.parseInt(tampung1)+Integer.parseInt(tampung2);
                                htgScore+=temp;
                                ArrLabel[i][j-1].setText(temp+"");
                                ArrLabel[i][j].setText("");
                                i2++;
                            }else if(ArrLabel[i][j-1].getText().equals("")){
                                ArrLabel[i][j-1].setText(ArrLabel[i][j].getText());
                                ArrLabel[i][j].setText("");
                            }

                        }
                    }else if (i==2){
                        if(j!=0 && i3==0){
                            if (ArrLabel[i][j].getText().equals(ArrLabel[i][j-1].getText())){
                                String tampung1 = (String) ArrLabel[i][j].getText();
                                String tampung2 = (String) ArrLabel[i][j-1].getText();
                                int temp = Integer.parseInt(tampung1)+Integer.parseInt(tampung2);
                                htgScore+=temp;
                                ArrLabel[i][j-1].setText(temp+"");
                                ArrLabel[i][j].setText("");
                                i3++;
                            }else if(ArrLabel[i][j-1].getText().equals("")){
                                ArrLabel[i][j-1].setText(ArrLabel[i][j].getText());
                                ArrLabel[i][j].setText("");
                            }

                        }
                    }else if (i==3){
                        if(j!=0 && i4==0){
                            if (ArrLabel[i][j].getText().equals(ArrLabel[i][j-1].getText())){
                                String tampung1 = (String) ArrLabel[i][j].getText();
                                String tampung2 = (String) ArrLabel[i][j-1].getText();
                                int temp = Integer.parseInt(tampung1)+Integer.parseInt(tampung2);
                                htgScore+=temp;
                                ArrLabel[i][j-1].setText(temp+"");
                                ArrLabel[i][j].setText("");
                                i4++;
                            }else if(ArrLabel[i][j-1].getText().equals("")){
                                ArrLabel[i][j-1].setText(ArrLabel[i][j].getText());
                                ArrLabel[i][j].setText("");
                            }

                        }
                    }

                }
            }

        }
        for (int i = 0; i<4; i++){
            for (int j=3; j>=0; j--){
                if (j!=0){
                    if(ArrLabel[i][j-1].getText().equals("")){
                        ArrLabel[i][j-1].setText(ArrLabel[i][j].getText());
                        ArrLabel[i][j].setText("");
                    }
                }

            }
        }
    }public void up(){
//        Toast.makeText(this, "Up", Toast.LENGTH_SHORT).show();
        int i1=0;
        int i2=0;
        int i3=0;
        int i4=0;
        for (int i=3; i>=0; i--){
            for (int j=0; j<4; j++){
                if (ArrLabel[i][j].getText().equals("")){
                }else{
                    if (j==0){
                        if(i!=0 && i1==0){
                            if (ArrLabel[i][j].getText().equals(ArrLabel[i-1][j].getText())){
                                String tampung1 = (String) ArrLabel[i][j].getText();
                                String tampung2 = (String) ArrLabel[i-1][j].getText();
                                int temp = Integer.parseInt(tampung1)+Integer.parseInt(tampung2);
                                htgScore+=temp;
                                ArrLabel[i-1][j].setText(temp+"");
                                ArrLabel[i][j].setText("");
                                i1++;
                            }else if(ArrLabel[i-1][j].getText().equals("")){
                                ArrLabel[i-1][j].setText(ArrLabel[i][j].getText());
                                ArrLabel[i][j].setText("");
                            }

                        }
                    }else if (j==1){
                        if(i!=0 && i2==0){
                            if (ArrLabel[i][j].getText().equals(ArrLabel[i-1][j].getText())){
                                String tampung1 = (String) ArrLabel[i][j].getText();
                                String tampung2 = (String) ArrLabel[i-1][j].getText();
                                int temp = Integer.parseInt(tampung1)+Integer.parseInt(tampung2);
                                htgScore+=temp;
                                ArrLabel[i-1][j].setText(temp+"");
                                ArrLabel[i][j].setText("");
                                i2++;
                            }else if(ArrLabel[i-1][j].getText().equals("")){
                                ArrLabel[i-1][j].setText(ArrLabel[i][j].getText());
                                ArrLabel[i][j].setText("");
                            }

                        }
                    }else if (j==2){
                        if(i!=0 && i3==0){
                            if (ArrLabel[i][j].getText().equals(ArrLabel[i-1][j].getText())){
                                String tampung1 = (String) ArrLabel[i][j].getText();
                                String tampung2 = (String) ArrLabel[i-1][j].getText();
                                int temp = Integer.parseInt(tampung1)+Integer.parseInt(tampung2);
                                htgScore+=temp;
                                ArrLabel[i-1][j].setText(temp+"");
                                ArrLabel[i][j].setText("");
                                i3++;
                            }else if(ArrLabel[i-1][j].getText().equals("")){
                                ArrLabel[i-1][j].setText(ArrLabel[i][j].getText());
                                ArrLabel[i][j].setText("");
                            }

                        }
                    }else if (j==3){
                        if(i!=0 && i4==0){
                            if (ArrLabel[i][j].getText().equals(ArrLabel[i-1][j].getText())){
                                String tampung1 = (String) ArrLabel[i][j].getText();
                                String tampung2 = (String) ArrLabel[i-1][j].getText();
                                int temp = Integer.parseInt(tampung1)+Integer.parseInt(tampung2);
                                htgScore+=temp;
                                ArrLabel[i-1][j].setText(temp+"");
                                ArrLabel[i][j].setText("");
                                i4++;
                            }else if(ArrLabel[i-1][j].getText().equals("")){
                                ArrLabel[i-1][j].setText(ArrLabel[i][j].getText());
                                ArrLabel[i][j].setText("");
                            }

                        }
                    }

                }
            }

        }
        for (int i = 0; i<4; i++){
            for (int j=3; j>=0; j--){
                if (i!=0){
                    if(ArrLabel[i-1][j].getText().equals("")){
                        ArrLabel[i-1][j].setText(ArrLabel[i][j].getText());
                        ArrLabel[i][j].setText("");
                    }
                }

            }
        }
    }
    public void down(){
//        Toast.makeText(this, "Down", Toast.LENGTH_SHORT).show();
        int i1=0;
        int i2=0;
        int i3=0;
        int i4=0;
        for (int i=0; i<4; i++){
            for (int j=0; j<4; j++){
                if (ArrLabel[i][j].getText().equals("")){
                }else{
                    if (j==0){
                        if(i!=3 && i1==0){
                            if (ArrLabel[i][j].getText().equals(ArrLabel[i+1][j].getText())){
                                String tampung1 = (String) ArrLabel[i][j].getText();
                                String tampung2 = (String) ArrLabel[i+1][j].getText();
                                int temp = Integer.parseInt(tampung1)+Integer.parseInt(tampung2);
                                htgScore+=temp;
                                ArrLabel[i+1][j].setText(temp+"");
                                ArrLabel[i][j].setText("");
                                i1++;
                            }else if(ArrLabel[i+1][j].getText().equals("")){
                                ArrLabel[i+1][j].setText(ArrLabel[i][j].getText());
                                ArrLabel[i][j].setText("");
                            }

                        }
                    }else if (j==1){
                        if(i!=3 && i2==0){
                            if (ArrLabel[i][j].getText().equals(ArrLabel[i+1][j].getText())){
                                String tampung1 = (String) ArrLabel[i][j].getText();
                                String tampung2 = (String) ArrLabel[i+1][j].getText();
                                int temp = Integer.parseInt(tampung1)+Integer.parseInt(tampung2);
                                htgScore+=temp;
                                ArrLabel[i+1][j].setText(temp+"");
                                ArrLabel[i][j].setText("");
                                i2++;
                            }else if(ArrLabel[i+1][j].getText().equals("")){
                                ArrLabel[i+1][j].setText(ArrLabel[i][j].getText());
                                ArrLabel[i][j].setText("");
                            }

                        }
                    }else if (j==2){
                        if(i!=3 && i3==0){
                            if (ArrLabel[i][j].getText().equals(ArrLabel[i+1][j].getText())){
                                String tampung1 = (String) ArrLabel[i][j].getText();
                                String tampung2 = (String) ArrLabel[i+1][j].getText();
                                int temp = Integer.parseInt(tampung1)+Integer.parseInt(tampung2);
                                htgScore+=temp;
                                ArrLabel[i+1][j].setText(temp+"");
                                ArrLabel[i][j].setText("");
                                i3++;
                            }else if(ArrLabel[i+1][j].getText().equals("")){
                                ArrLabel[i+1][j].setText(ArrLabel[i][j].getText());
                                ArrLabel[i][j].setText("");
                            }

                        }
                    }else if (j==3){
                        if(i!=3 && i4==0){
                            if (ArrLabel[i][j].getText().equals(ArrLabel[i+1][j].getText())){
                                String tampung1 = (String) ArrLabel[i][j].getText();
                                String tampung2 = (String) ArrLabel[i+1][j].getText();
                                int temp = Integer.parseInt(tampung1)+Integer.parseInt(tampung2);
                                htgScore+=temp;
                                ArrLabel[i+1][j].setText(temp+"");
                                ArrLabel[i][j].setText("");
                                i4++;
                            }else if(ArrLabel[i+1][j].getText().equals("")){
                                ArrLabel[i+1][j].setText(ArrLabel[i][j].getText());
                                ArrLabel[i][j].setText("");
                            }

                        }
                    }

                }
            }

        }
        for (int i = 0; i<4; i++){
            for (int j=0; j<4; j++){
                if (i!=3){
                    if(ArrLabel[i+1][j].getText().equals("")){
                        ArrLabel[i+1][j].setText(ArrLabel[i][j].getText());
                        ArrLabel[i][j].setText("");
                    }
                }

            }
        }
    }

}
