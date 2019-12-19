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
public class BathroomFragment extends Fragment {
    ImageView imgChar,imgCamera,imgHelp,imgPrev,imgNext,imgCoin,imgLvl,imgEnergy,imgFullness,imgFun,imgHealth,imgShower,imgSoap,imgShop;
    TextView tvPlace,tvCoin,tvLvl;
    user u;
    public boolean sabun=false;
    public BathroomFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_bathroom, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        imgChar=view.findViewById(R.id.imageCharBathroom);imgEnergy=view.findViewById(R.id.imageEnergyBathroom);
        imgCamera=view.findViewById(R.id.imageCameraBathroom);imgFullness=view.findViewById(R.id.imageFullnessBathroom);
        imgHelp=view.findViewById(R.id.imageHelpBathroom);imgFun=view.findViewById(R.id.imageFunBathroom);
        imgPrev=view.findViewById(R.id.imagePrevBathroom);imgHealth=view.findViewById(R.id.imageHealthBathroom);
        imgNext=view.findViewById(R.id.imageNextBathroom);imgShower=view.findViewById(R.id.imageShowerBathroom);
        imgCoin=view.findViewById(R.id.imageCoinBathroom);imgSoap=view.findViewById(R.id.imageSoapBathroom);
        imgLvl=view.findViewById(R.id.imageLevelBathroom);imgShop=view.findViewById(R.id.imageShopBathroom);

        tvPlace=view.findViewById(R.id.textView6);tvCoin=view.findViewById(R.id.tvCoinBathroom);tvLvl=view.findViewById(R.id.tvLevelBathroom);

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
        imgSoap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(u.isClean()==false){
                    sabun=true;
                }
            }
        });

        imgShower.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(u.isClean()==false && sabun==true){
                    sabun=false;
                    u.setClean(true);
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
