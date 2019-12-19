package com.example.mdpproject;


import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 */
public class BedroomFragment extends Fragment {
    ImageView imgChar,imgCamera,imgHelp,imgPrev,imgNext,imgCoin,imgLvl,imgEnergy,imgFullness,imgFun,imgHealth,imgCloset,imgLamp,imgShop;
    TextView tvPlace,tvCoin,tvLvl;
    View shade;

    public BedroomFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_bedroom, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        imgChar=view.findViewById(R.id.imageCharBedroom);imgEnergy=view.findViewById(R.id.imageEnergyBedroom);
        imgCamera=view.findViewById(R.id.imageCameraBedroom);imgFullness=view.findViewById(R.id.imageFullnessBedroom);
        imgHelp=view.findViewById(R.id.imageHelpBedroom);imgFun=view.findViewById(R.id.imageFunBedroom);
        imgPrev=view.findViewById(R.id.imagePrevBedroom);imgHealth=view.findViewById(R.id.imageHealthBedroom);
        imgNext=view.findViewById(R.id.imageNextBedroom);imgCloset=view.findViewById(R.id.imageClosetBedroom);
        imgCoin=view.findViewById(R.id.imageCoinBedroom);imgLamp=view.findViewById(R.id.imageLampBedroom);
        imgLvl=view.findViewById(R.id.imageLevelBedroom);imgShop=view.findViewById(R.id.imageShopBedroom);
        tvPlace=view.findViewById(R.id.textView6);tvCoin=view.findViewById(R.id.tvCoinBedroom);tvLvl=view.findViewById(R.id.tvLevelBedroom);

        if(HomeActivity.u.isAdult()){
            imgChar.setImageResource(R.drawable.poubesar);
        }else{
            imgChar.setImageResource(R.drawable.poukecil);
        }
        if(HomeActivity.u.isLampStatus()==true){
            imgLamp.setImageResource(R.drawable.lamp_on);
            //shade.setVisibility(View.INVISIBLE);
        }else{
            imgLamp.setImageResource(R.drawable.lamp_off);
            //shade.setVisibility(View.VISIBLE);
        }

        imgLamp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(HomeActivity.u.isLampStatus()==true){
                    HomeActivity.u.setLampStatus(false);
                    imgLamp.setImageResource(R.drawable.lamp_off);
                    HomeActivity.u.setEnergy(HomeActivity.u.getEnergy()+10);
                }else{
                    HomeActivity.u.setLampStatus(true);
                    imgLamp.setImageResource(R.drawable.lamp_on);
                }
            }
        });

        tvCoin.setText(HomeActivity.u.getCoin()+"");tvLvl.setText(HomeActivity.u.getLvl()+"");

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
