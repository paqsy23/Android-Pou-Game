package com.example.mdpproject;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Random;

public class gm2 extends AppCompatActivity {

    Button a1,a2,a3,a4,a5,a6,a7,a8,a9,a10,a11,a12,a13,a14,a15,a16,a17,a18,a19,a20,a21,a22,a23,a24,a25,a26,a27,a28,a29,a30,a31,a32,a33,a34,a35,a36,a37,a38,a39,a40,a41,a42,a43,a44,a45,a46,a47,a48,a49,a50;
    Button a51,a52,a53,a54,a55,a56,a57,a58,a59,a60,a61,a62,a63,a64,a65,a66,a67,a68,a69,a70,a71,a72,a73,a74,a75,a76,a77,a78,a79,a80,a81,a82,a83,a84,a85,a86,a87,a88,a89,a90,a91,a92,a93,a94,a95,a96,a97,a98,a99,a100;
    Button[][] b= new Button[10][10];
    int ronde = 0;
    EditText ed;
    TextView tv;
    int score = 0;
    String[][] map = new String[10][10];

    ArrayList<String> nama = new ArrayList<String>();
    ArrayList<Integer> arrscore = new ArrayList<Integer>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gm2);
        ed = findViewById(R.id.nama);
        tv = findViewById(R.id.textView3);
        a1 = findViewById(R.id.b1);a2 = findViewById(R.id.b2);a3 = findViewById(R.id.b3);
        a4 = findViewById(R.id.b4);a5 = findViewById(R.id.b5);a6 = findViewById(R.id.b6);
        a7 = findViewById(R.id.b7);a8 = findViewById(R.id.b8);a9 = findViewById(R.id.b9);
        a10 = findViewById(R.id.b10);a11 = findViewById(R.id.b11);a12 = findViewById(R.id.b12);
        a13 = findViewById(R.id.b13);a14 = findViewById(R.id.b14);a15 = findViewById(R.id.b15);
        a16 = findViewById(R.id.b16);a17 = findViewById(R.id.b17);a18 = findViewById(R.id.b18);
        a19 = findViewById(R.id.b19);a20 = findViewById(R.id.b20);a21 = findViewById(R.id.b21);
        a22 = findViewById(R.id.b22);a23 = findViewById(R.id.b23);a24 = findViewById(R.id.b24);
        a25 = findViewById(R.id.b25);a26 = findViewById(R.id.b26);a27 = findViewById(R.id.b27);
        a28 = findViewById(R.id.b28);a29 = findViewById(R.id.b29);a30 = findViewById(R.id.b30);
        a31 = findViewById(R.id.b31);a32 = findViewById(R.id.b32);a33 = findViewById(R.id.b33);
        a34 = findViewById(R.id.b34);a35 = findViewById(R.id.b35);a36 = findViewById(R.id.b36);
        a37 = findViewById(R.id.b37);a38 = findViewById(R.id.b38);a39 = findViewById(R.id.b39);
        a40 = findViewById(R.id.b40);a41 = findViewById(R.id.b41);a42 = findViewById(R.id.b42);
        a43 = findViewById(R.id.b43);a44 = findViewById(R.id.b44);a45 = findViewById(R.id.b45);
        a46 = findViewById(R.id.b46);a47 = findViewById(R.id.b47);a48 = findViewById(R.id.b48);
        a49 = findViewById(R.id.b49);a50 = findViewById(R.id.b50);a51 = findViewById(R.id.b51);
        a52 = findViewById(R.id.b52);a53 = findViewById(R.id.b53);a54 = findViewById(R.id.b54);
        a55 = findViewById(R.id.b55);a56 = findViewById(R.id.b56);a57 = findViewById(R.id.b57);
        a58 = findViewById(R.id.b58);a59 = findViewById(R.id.b59);a60 = findViewById(R.id.b60);
        a61 = findViewById(R.id.b61);a62 = findViewById(R.id.b62);a63 = findViewById(R.id.b63);
        a64 = findViewById(R.id.b64);a65 = findViewById(R.id.b65);a66 = findViewById(R.id.b66);
        a67 = findViewById(R.id.b67);a68 = findViewById(R.id.b68);a69 = findViewById(R.id.b69);
        a70 = findViewById(R.id.b70);a71 = findViewById(R.id.b71);a72 = findViewById(R.id.b72);
        a73 = findViewById(R.id.b73);a74 = findViewById(R.id.b74);a75 = findViewById(R.id.b75);
        a76 = findViewById(R.id.b76);a77 = findViewById(R.id.b77);a78 = findViewById(R.id.b78);
        a79 = findViewById(R.id.b79);a80 = findViewById(R.id.b80);a81 = findViewById(R.id.b81);
        a82 = findViewById(R.id.b82);a83 = findViewById(R.id.b83);a84 = findViewById(R.id.b84);
        a85 = findViewById(R.id.b85);a86 = findViewById(R.id.b86);a87 = findViewById(R.id.b87);
        a88 = findViewById(R.id.b88);a89 = findViewById(R.id.b89);a90 = findViewById(R.id.b90);
        a91 = findViewById(R.id.b91);a92 = findViewById(R.id.b92);a93 = findViewById(R.id.b93);
        a94 = findViewById(R.id.b94);a95 = findViewById(R.id.b95);a96 = findViewById(R.id.b96);
        a97 = findViewById(R.id.b97);a98 = findViewById(R.id.b98);a99 = findViewById(R.id.b99);
        a100 = findViewById(R.id.b100);
        b[0][0] = a1;b[0][1] = a2;b[0][2] = a3;
        b[0][3] = a4;b[0][4] = a5;b[0][5] = a6;
        b[0][6] = a7;b[0][7] = a8;b[0][8] = a9;
        b[0][9] = a10;
        b[1][0] = a11;b[1][1] = a12;b[1][2] = a13;
        b[1][3] = a14;b[1][4] = a15;b[1][5] = a16;
        b[1][6] = a17;b[1][7] = a18;b[1][8] = a19;
        b[1][9] = a20;
        b[2][0] = a21;b[2][1] = a22;b[2][2] = a23;
        b[2][3] = a24;b[2][4] = a25;b[2][5] = a26;
        b[2][6] = a27;b[2][7] = a28;b[2][8] = a29;
        b[2][9] = a30;
        b[3][0] = a31;b[3][1] = a32;b[3][2] = a33;
        b[3][3] = a34;b[3][4] = a35;b[3][5] = a36;
        b[3][6] = a37;b[3][7] = a38;b[3][8] = a39;
        b[3][9] = a40;
        b[4][0] = a41;b[4][1] = a42;b[4][2] = a43;
        b[4][3] = a44;b[4][4] = a45;b[4][5] = a46;
        b[4][6] = a47;b[4][7] = a48;b[4][8] = a49;
        b[4][9] = a50;
        b[5][0] = a51;b[5][1] = a52;b[5][2] = a53;
        b[5][3] = a54;b[5][4] = a55;b[5][5] = a56;
        b[5][6] = a57;b[5][7] = a58;b[5][8] = a59;
        b[5][9] = a60;
        b[6][0] = a61;b[6][1] = a62;b[6][2] = a63;
        b[6][3] = a64;b[6][4] = a65;b[6][5] = a66;
        b[6][6] = a67;b[6][7] = a68;b[6][8] = a69;
        b[6][9] = a70;
        b[7][0] = a71;b[7][1] = a72;b[7][2] = a73;
        b[7][3] = a74;b[7][4] = a75;b[7][5] = a76;
        b[7][6] = a77;b[7][7] = a78;b[7][8] = a79;
        b[7][9] = a80;
        b[8][0] = a81;b[8][1] = a82;b[8][2] = a83;
        b[8][3] = a84;b[8][4] = a85;b[8][5] = a86;
        b[8][6] = a87;b[8][7] = a88;b[8][8] = a89;
        b[8][9] = a90;
        b[9][0] = a91;b[9][1] = a92;b[9][2] = a93;
        b[9][3] = a94;b[9][4] = a95;b[9][5] = a96;
        b[9][6] = a97;b[9][7] = a98;b[9][8] = a99;
        b[9][9] = a100;
        warnai();
        Intent penerima = getIntent();
        nama  =penerima.getStringArrayListExtra("arrnama");
        arrscore = penerima.getIntegerArrayListExtra("arrscore");
    }
    public void klik(View v){
        Random r = new Random();
        boolean bolehdipencet = false;
        if(ed.getText().length()>0){
            bolehdipencet = true;
        }else{
            Toast.makeText(this, "Inputkan nama dulu", Toast.LENGTH_SHORT).show();
        }
        if(bolehdipencet == true && ronde <=10){
            ronde++;
            for (int i = 0;i < 10;i++){
                for (int j = 0;j < 10;j++){
                    if(v.getId() == b[i][j].getId()){
                        if(i == 0 && j == 0){
                            if(map[i][j+1].equals(map[i][j])){
                                map[i][j+1] = " ";
                                score++;
                            }
                            if(map[i+1][j+1].equals(map[i][j])){
                                map[i+1][j+1] = " ";
                                score++;
                            }
                            if(map[i+1][j].equals(map[i][j])){
                                map[i+1][j] = " ";
                                score++;
                            }
                        }else if(i == 0 && j == 9){
                            if(map[i][j-1].equals(map[i][j])){
                                map[i][j-1] = " ";
                                score++;
                            }
                            if(map[i+1][j-1].equals(map[i][j])){
                                map[i+1][j-1] = " ";
                                score++;
                            }
                            if(map[i+1][j].equals(map[i][j])){
                                map[i+1][j] = " ";
                                score++;
                            }
                        }else if(i == 9 && j == 0){
                            if(map[i-1][j].equals(map[i][j])){
                                map[i-1][j] = " ";
                                score++;
                            }
                            if(map[i-1][j+1].equals(map[i][j])){
                                map[i-1][j+1] = " ";
                                score++;
                            }
                            if(map[i][j+1].equals(map[i][j])){
                                map[i][j+1] = " ";
                                score++;
                            }
                        }else if(i == 9&& j == 9){
                            if(map[i-1][j].equals(map[i][j])){
                                map[i-1][j] = " ";
                                score++;
                            }
                            if(map[i-1][j-1].equals(map[i][j])){
                                map[i-1][j-1] = " ";
                                score++;
                            }
                            if(map[i][j-1].equals(map[i][j])){
                                map[i][j-1] = " ";
                                score++;
                            }
                        }else if(i == 0){
                            if(map[i][j-1].equals(map[i][j])){
                                map[i][j-1] = " ";
                                score++;
                            }
                            if(map[i][j+1].equals(map[i][j])){
                                map[i][j+1] = " ";
                                score++;
                            }
                            if(map[i+1][j-1].equals(map[i][j])){
                                map[i+1][j-1] = " ";
                                score++;
                            }
                            if(map[i+1][j].equals(map[i][j])){
                                map[i+1][j] = " ";
                                score++;
                            }
                            if(map[i+1][j+1].equals(map[i][j])){
                                map[i+1][j+1] = " ";
                                score++;
                            }
                        }
                        else if(i == 9){
                            if(map[i-1][j-1].equals(map[i][j])){
                                map[i-1][j-1] = " ";
                                score++;
                            }
                            if(map[i-1][j].equals(map[i][j])){
                                map[i-1][j] = " ";
                                score++;
                            }
                            if(map[i-1][j+1].equals(map[i][j])){
                                map[i-1][j+1] = " ";
                                score++;
                            }
                            if(map[i][j-1].equals(map[i][j])){
                                map[i][j-1] = " ";
                                score++;
                            }
                            if(map[i][j+1].equals(map[i][j])){
                                map[i][j+1] = " ";
                                score++;
                            }
                        }
                        else if(j == 0){
                            if(map[i-1][j].equals(map[i][j])){
                                map[i-1][j] = " ";
                                score++;
                            }
                            if(map[i-1][j+1].equals(map[i][j])){
                                map[i-1][j+1] = " ";
                                score++;
                            }
                            if(map[i][j+1].equals(map[i][j])){
                                map[i][j+1] = " ";
                                score++;
                            }
                            if(map[i+1][j].equals(map[i][j])){
                                map[i+1][j] = " ";
                                score++;
                            }
                            if(map[i+1][j+1].equals(map[i][j])){
                                map[i+1][j+1] = " ";
                                score++;
                            }
                        }
                        else if(j == 9){
                            if(map[i-1][j-1].equals(map[i][j])){
                                map[i-1][j-1] = " ";
                                score++;
                            }
                            if(map[i-1][j].equals(map[i][j])){
                                map[i-1][j] = " ";
                                score++;
                            }
                            if(map[i][j-1].equals(map[i][j])){
                                map[i][j-1] = " ";
                                score++;
                            }
                            if(map[i+1][j-1].equals(map[i][j])){
                                map[i+1][j-1] = " ";
                                score++;
                            }
                            if(map[i+1][j].equals(map[i][j])){
                                map[i+1][j] = " ";
                                score++;
                            }
                        }
                        else{
                            if(map[i-1][j-1].equals(map[i][j])){
                                map[i-1][j-1] = " ";
                                score++;
                            }
                            if(map[i-1][j].equals(map[i][j])){
                                map[i-1][j] = " ";
                                score++;
                            }
                            if(map[i-1][j+1].equals(map[i][j])){
                                map[i-1][j+1] = " ";
                                score++;
                            }
                            if(map[i][j-1].equals(map[i][j])){
                                map[i][j-1] = " ";
                                score++;
                            }
                            if(map[i][j+1].equals(map[i][j])){
                                map[i][j+1] = " ";
                                score++;
                            }
                            if(map[i+1][j-1].equals(map[i][j])){
                                map[i+1][j-1] = " ";
                                score++;
                            }
                            if(map[i+1][j].equals(map[i][j])){
                                map[i+1][j] = " ";
                                score++;
                            }
                            if(map[i+1][j+1].equals(map[i][j])){
                                map[i+1][j+1] = " ";
                                score++;
                            }
                        }
                        map[i][j] = " ";
                        score++;
                    }
                }
            }
        }
        if(ronde == 10){
            nama.add(ed.getText().toString());
            arrscore.add(score);
            Intent t = new Intent(MainActivity.this,awal.class);
            t.putExtra("bool",true);
            t.putExtra("arrnama",nama);
            t.putExtra("arrscore",arrscore);
            startActivity(t);
        }

        tv.setText("Score : " +score);
        for (int i = 0;i < 10;i++){
            for (int j = 0;j < 10;j++){
                int rand = r.nextInt(4);
                if(rand == 0 && map[i][j] == " "){
                    map[i][j] = "r";
                    b[i][j].setBackgroundColor(Color.RED);
                }
                if(rand == 1 && map[i][j] == " "){
                    map[i][j] = "g";
                    b[i][j].setBackgroundColor(Color.GREEN);
                }
                if(rand == 2 && map[i][j] == " "){
                    map[i][j] = "b";
                    b[i][j].setBackgroundColor(Color.BLUE);
                }
                if(rand == 3 && map[i][j] == " "){
                    map[i][j] = "y";
                    b[i][j].setBackgroundColor(Color.YELLOW);
                }
            }
        }

    }

    public void warnai(){
        Random r = new Random();
        for (int i = 0;i < 10;i++){
            for (int j = 0;j < 10;j++){
                int rand = r.nextInt(4);
                if(rand == 0){
                    map[i][j] = "r";
                    b[i][j].setBackgroundColor(Color.RED);
                }
                if(rand == 1){
                    map[i][j] = "g";
                    b[i][j].setBackgroundColor(Color.GREEN);
                }
                if(rand == 2){
                    map[i][j] = "b";
                    b[i][j].setBackgroundColor(Color.BLUE);
                }
                if(rand == 3){
                    map[i][j] = "y";
                    b[i][j].setBackgroundColor(Color.YELLOW);
                }
            }
        }
    }
}
