package com.example.mdpproject;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Random;

public class gm1 extends AppCompatActivity {
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19,b20,b21,b22,b23,b24,b25;
    Button retry;
    EditText et;
    TextView tv;
    int score;
    int pilih = -1;
    int ctrpilih = -1;
    boolean win = false;
    String warna = "";
    String simpanwarna = "";
    String[][][] a = new String[3][5][5];
    ArrayList<Button> btn2 = new ArrayList<Button>();
    ArrayList<Integer> arr = new ArrayList<Integer>();
    Boolean[] arrbool = new Boolean[25];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gm1);
        ArrayList<Button> btn = new ArrayList<Button>();
        for (int i=0;i<3;i++){
            for (int j=0;j<5;j++){
                for (int k=0;k<5;k++){
                    a[i][k][j] = "";
                }
            }
        }
        a[0][0][0] = "Y";
        a[0][1][0] = "G";
        a[0][4][0] = "G";
        a[0][1][1] = "R";
        a[0][2][1] = "B";
        a[0][2][2] = "Y";
        a[0][2][3] = "R";
        a[0][4][4] = "B";
        a[1][2][0] = "Y";
        a[1][3][0] = "R";
        a[1][1][1] = "B";
        a[1][2][2] = "G";
        a[1][1][3] = "G";
        a[1][2][3] = "B";
        a[1][1][4] = "Y";
        a[1][2][4] = "R";
        a[2][0][0] = "R";
        a[2][1][0] = "Y";
        a[2][3][1] = "B";
        a[2][1][2] = "B";
        a[2][2][2] = "Y";
        a[2][1][3] = "G";
        a[2][3][4] = "R";
        a[2][4][4] = "G";
        et=findViewById(R.id.editText);
        tv = findViewById(R.id.textView);
        b1 = findViewById(R.id.button1);
        b2 = findViewById(R.id.button2);
        b3 = findViewById(R.id.button3);
        b4 = findViewById(R.id.button4);
        b5 = findViewById(R.id.button5);
        b6 = findViewById(R.id.button6);
        b7 = findViewById(R.id.button7);
        b8 = findViewById(R.id.button8);
        b9 = findViewById(R.id.button9);
        b10 = findViewById(R.id.button10);
        b11 = findViewById(R.id.button11);
        b12 = findViewById(R.id.button12);
        b13 = findViewById(R.id.button13);
        b14 = findViewById(R.id.button14);
        b15 = findViewById(R.id.button15);
        b16 = findViewById(R.id.button16);
        b17 = findViewById(R.id.button17);
        b18 = findViewById(R.id.button18);
        b19 = findViewById(R.id.button19);
        b20 = findViewById(R.id.button20);
        b21 = findViewById(R.id.button21);
        b22 = findViewById(R.id.button22);
        b23 = findViewById(R.id.button23);
        b24 = findViewById(R.id.button24);
        b25 = findViewById(R.id.button25);
        btn.add(b1);
        btn.add(b2);
        btn.add(b3);
        btn.add(b4);
        btn.add(b5);
        btn.add(b6);
        btn.add(b7);
        btn.add(b8);
        btn.add(b9);
        btn.add(b10);
        btn.add(b11);
        btn.add(b12);
        btn.add(b13);
        btn.add(b14);
        btn.add(b15);
        btn.add(b16);
        btn.add(b17);
        btn.add(b18);
        btn.add(b19);
        btn.add(b20);
        btn.add(b21);
        btn.add(b22);
        btn.add(b23);
        btn.add(b24);
        btn.add(b25);
        retry = findViewById(R.id.button27);
        retry.setText("restart");
        for (int i = 0;i < 25;i++){
            btn2.add(btn.get(i));
        }
        play(btn2);

    }
    public void play(ArrayList<Button> btn){
        Random r = new Random();
        int rand = r.nextInt(3);
        score=0;
        win = false;
        refresh(win);
        int ctr = 0;
        Button b = new Button(this);
        for (int j=0;j<5;j++){
            for (int k=0;k<5;k++){
                btn.get(ctr).setText("");
                if(a[rand][k][j] == ""){
                    btn.get(ctr).setBackground(b.getBackground());
                    arrbool[ctr] = false;
                }
                if(a[rand][k][j] == "Y"){
                    btn.get(ctr).setBackgroundColor(Color.YELLOW);
                    btn.get(ctr).setText("Y");
                    arrbool[ctr] = true;
                }
                if(a[rand][k][j] == "R"){
                    btn.get(ctr).setBackgroundColor(Color.RED);
                    btn.get(ctr).setText("R");
                    arrbool[ctr] = true;
                }
                if(a[rand][k][j] == "G"){
                    btn.get(ctr).setBackgroundColor(Color.GREEN);
                    btn.get(ctr).setText("G");
                    arrbool[ctr] = true;
                }
                if(a[rand][k][j] == "B"){
                    btn.get(ctr).setBackgroundColor(Color.CYAN);
                    btn.get(ctr).setText("B");
                    arrbool[ctr] = true;
                }
                ctr++;
            }
        }
    }
    public void refresh(boolean win){
        if(win == true){
            retry.setText("Play Again");
            et.setText("YOU WIN!!!");
        }else{
            retry.setText("Restart");
            et.setText("");
        }
    }
    public void cekwarna(){
        Button b = new Button(this);
        if(simpanwarna!=warna){
            for (int i = 0;i < arr.size();i++){
                btn2.get(arr.get(i)).setBackground(b.getBackground());
                arrbool[arr.get(i)] =false;
            }
            simpanwarna  = warna;
            arr.clear();
        }else {
            arr.clear();
            pilih = -1;
        }
    }
    public void cekgerak(){
        int a = ctrpilih+1;
        int c = ctrpilih-1;
        int d = ctrpilih+5;
        int e = ctrpilih-5;
        if(pilih == -1){
            pilih =ctrpilih;
        }
        if(a == pilih){
            pilih = ctrpilih;
        }else if(c == pilih){
            pilih = ctrpilih;
        }else if(d == pilih){
            pilih = ctrpilih;
        }else if(e == pilih){
            pilih = ctrpilih;
        }
    }
    public void klik(View v){
        refresh(win);
        if(v.getId() == b1.getId()){
            ctrpilih = 1;
            cekgerak();
        }if(v.getId() == b2.getId()){
            ctrpilih = 2;
            cekgerak();
        }if(v.getId() == b3.getId()){
            ctrpilih = 3;
            cekgerak();
        }if(v.getId() == b4.getId()){
            ctrpilih = 4;
            cekgerak();
        }if(v.getId() == b5.getId()){
            ctrpilih = 5;
            cekgerak();
        }if(v.getId() == b6.getId()){
            ctrpilih = 6;
            cekgerak();
        }if(v.getId() == b7.getId()){
            ctrpilih = 7;
            cekgerak();
        }if(v.getId() == b8.getId()){
            ctrpilih = 8;
            cekgerak();
        }if(v.getId() == b9.getId()){
            ctrpilih = 9;
            cekgerak();
        }if(v.getId() == b10.getId()){
            ctrpilih = 10;
            cekgerak();
        }if(v.getId() == b11.getId()){
            ctrpilih = 11;
            cekgerak();
        }if(v.getId() == b12.getId()){
            ctrpilih = 12;
            cekgerak();
        }if(v.getId() == b13.getId()){
            ctrpilih = 13;
            cekgerak();
        }if(v.getId() == b14.getId()){
            ctrpilih = 14;
            cekgerak();
        }if(v.getId() == b15.getId()){
            ctrpilih = 15;
            cekgerak();
        }if(v.getId() == b16.getId()){
            ctrpilih = 16;
            cekgerak();
        }if(v.getId() == b17.getId()){
            ctrpilih = 17;
            cekgerak();
        }if(v.getId() == b18.getId()){
            ctrpilih = 18;
            cekgerak();
        }if(v.getId() == b19.getId()){
            ctrpilih = 19;
            cekgerak();
        }if(v.getId() == b20.getId()){
            ctrpilih = 20;
            cekgerak();
        }if(v.getId() == b21.getId()){
            ctrpilih = 21;
            cekgerak();
        }if(v.getId() == b22.getId()){
            ctrpilih = 22;
            cekgerak();
        }if(v.getId() == b23.getId()){
            ctrpilih = 23;
            cekgerak();
        }if(v.getId() == b24.getId()){
            ctrpilih = 24;
            cekgerak();
        }if(v.getId() == b25.getId()){
            ctrpilih = 25;
            cekgerak();
        }


        if(pilih>0){
            if(btn2.get(ctrpilih-1).getText() == "R"){
                warna = "merah";
                score++;
                cekwarna();
            }else if(btn2.get(ctrpilih-1).getText() == "G"){
                warna = "hijau";
                score++;
                cekwarna();
            }else if(btn2.get(ctrpilih-1).getText() == "B"){
                warna = "biru";
                score++;
                cekwarna();
            }else if(btn2.get(ctrpilih-1).getText() == "Y"){
                warna = "kuning";
                score++;
                cekwarna();
            }else{
                if(warna == "merah" && btn2.get(pilih-1).getText() == ""){
                    btn2.get(pilih-1).setBackgroundColor(Color.RED);
                    arr.add(pilih-1);
                    arrbool[pilih-1] = true;
                    score++;
                }else if(warna == "hijau" && btn2.get(pilih-1).getText() == ""){
                    btn2.get(pilih-1).setBackgroundColor(Color.GREEN);
                    arr.add(pilih-1);
                    arrbool[pilih-1] = true;
                    score++;
                }else if(warna == "biru" && btn2.get(pilih-1).getText() == ""){
                    btn2.get(pilih-1).setBackgroundColor(Color.CYAN);
                    arr.add(pilih-1);
                    arrbool[pilih-1] = true;
                    score++;
                }else if(warna == "kuning" && btn2.get(pilih-1).getText() == ""){
                    btn2.get(pilih-1).setBackgroundColor(Color.YELLOW);
                    arr.add(pilih-1);
                    arrbool[pilih-1] = true;
                    score++;
                }
            }
        }
        cekwin();
        if(v.getId() == retry.getId()){
            play(btn2);
        }
        tv.setText("Move : " + String.valueOf(score));
    }

    public void cekwin() {
        win = true;
        for(int i = 0;i < 25;i++){
            if(arrbool[i] == false){
                win = false;
            }
        }
    }
}
