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
public class LabFragment extends Fragment {
    ImageView imgChar,imgCamera,imgHelp,imgPrev,imgNext,imgCoin,imgLvl,imgEnergy,imgFullness,imgFun,imgHealth,imgShelf,imgPotion,imgShop;
    TextView tvPlace,tvCoin,tvLvl;
    user u;
    public LabFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_lab, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        imgChar=view.findViewById(R.id.imageCharLab);imgEnergy=view.findViewById(R.id.imageEnergyLab);
        imgCamera=view.findViewById(R.id.imageCameraLab);imgFullness=view.findViewById(R.id.imageFullnessLab);
        imgHelp=view.findViewById(R.id.imageHelpLab);imgFun=view.findViewById(R.id.imageFunLab);
        imgPrev=view.findViewById(R.id.imagePrevLab);imgHealth=view.findViewById(R.id.imageHealthLab);
        imgNext=view.findViewById(R.id.imageNextLab);imgShelf=view.findViewById(R.id.imageShelfLab);
        imgCoin=view.findViewById(R.id.imageCoinLab);imgPotion=view.findViewById(R.id.imagePotionLab);
        imgLvl=view.findViewById(R.id.imageLevelLab);imgShop=view.findViewById(R.id.imageShopLab);

        tvPlace=view.findViewById(R.id.textView6);tvCoin=view.findViewById(R.id.tvCoinLab);tvLvl=view.findViewById(R.id.tvLevelLab);

        tvCoin.setText(BedroomFragment.u.getCoin()+"");tvLvl.setText(BedroomFragment.u.getLvl()+"");

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
