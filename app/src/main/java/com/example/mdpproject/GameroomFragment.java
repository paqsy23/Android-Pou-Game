package com.example.mdpproject;


import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 */
public class GameroomFragment extends Fragment {

    ImageView imgChar,imgCamera,imgHelp,imgPrev,imgNext,imgCoin,imgLvl,imgEnergy,imgFullness,imgFun,imgHealth,imgJoystick,imgBall,imgShop;
    TextView tvPlace,tvCoin,tvLvl;
    public GameroomFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_gameroom, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        imgChar=view.findViewById(R.id.imageCharGame);imgEnergy=view.findViewById(R.id.imageEnergyGame);
        imgCamera=view.findViewById(R.id.imageCameraGame);imgFullness=view.findViewById(R.id.imageFullnessGame);
        imgHelp=view.findViewById(R.id.imageHelpGame);imgFun=view.findViewById(R.id.imageFunGame);
        imgPrev=view.findViewById(R.id.imagePrevGame);imgHealth=view.findViewById(R.id.imageHealthGame);
        imgNext=view.findViewById(R.id.imageNextGame);imgJoystick=view.findViewById(R.id.imageJoystickGame);
        imgCoin=view.findViewById(R.id.imageCoinGame);imgBall=view.findViewById(R.id.imageBallGame);
        imgLvl=view.findViewById(R.id.imageLevelGame);imgShop=view.findViewById(R.id.imageShopGame);

        tvPlace=view.findViewById(R.id.textView6);tvCoin=view.findViewById(R.id.tvCoinGame);tvLvl=view.findViewById(R.id.tvLevelGame);

        tvCoin.setText(HomeActivity.u.getCoin()+"");tvLvl.setText(HomeActivity.u.getLvl()+"");
        if(HomeActivity.u.isAdult()){
            imgChar.setImageResource(R.drawable.poubesar);
        }else{
            imgChar.setImageResource(R.drawable.poukecil);
        }
        imgPrev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                HomeActivity.pages-=1;
                int angka= HomeActivity.pages;
                gantiPage(angka);
            }
        });
        imgNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                HomeActivity.pages+=1;
                int angka = HomeActivity.pages;
                gantiPage(angka);
            }
        });
        imgShop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getFragmentManager().beginTransaction().replace(R.id.myFragment, new ShopFragment()).addToBackStack(null).commit();
            }
        });
        imgBall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                HomeActivity.u.setFun(HomeActivity.u.getFun()+10);
                HomeActivity.u.setXp(HomeActivity.u.getXp()+1000);
                tvLvl.setText(HomeActivity.u.getLvl()+"");
                if(HomeActivity.u.isAdult()){
                    imgChar.setImageResource(R.drawable.poubesar);
                }else{
                    imgChar.setImageResource(R.drawable.poukecil);
                }
            }
        });
    }

    public void gantiPage(int angka){
        if(angka==0){
            getFragmentManager().beginTransaction().remove(this).commit();
            getFragmentManager().beginTransaction().replace(R.id.myFragment, new BedroomFragment()).addToBackStack(null).commit();
        }else if(angka==1){
            getFragmentManager().beginTransaction().remove(this).commit();
            getFragmentManager().beginTransaction().replace(R.id.myFragment, new EatFragment()).addToBackStack(null).commit();
        }else if(angka==2){
            getFragmentManager().beginTransaction().remove(this).commit();
            getFragmentManager().beginTransaction().replace(R.id.myFragment, new BathroomFragment()).addToBackStack(null).commit();
        }else if(angka==3){
            getFragmentManager().beginTransaction().remove(this).commit();
            getFragmentManager().beginTransaction().replace(R.id.myFragment, new LabFragment()).addToBackStack(null).commit();
        }else if(angka==4){
            getFragmentManager().beginTransaction().remove(this).commit();
            getFragmentManager().beginTransaction().replace(R.id.myFragment, new GameroomFragment()).addToBackStack(null).commit();
        }else if(angka>4){
            HomeActivity.pages=0;
            gantiPage(HomeActivity.pages);
        }else if(angka<0){
            HomeActivity.pages=4;
            gantiPage(HomeActivity.pages);
        }
    }
}
