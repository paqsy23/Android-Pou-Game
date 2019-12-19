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
public class EatFragment extends Fragment {

    ImageView imgChar,imgCamera,imgHelp,imgPrev,imgNext,imgCoin,imgLvl,imgEnergy,imgFullness,imgFun,imgHealth,imgFridge,imgShop,imgPrevFood,imgNextFood,imgFood;
    TextView tvPlace,tvCoin,tvLvl;

    public EatFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_eat, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        imgChar=view.findViewById(R.id.imageCharEat);imgEnergy=view.findViewById(R.id.imageEnergyEat);
        imgCamera=view.findViewById(R.id.imageCameraEat);imgFullness=view.findViewById(R.id.imageFullnessEat);
        imgHelp=view.findViewById(R.id.imageHelpEat);imgFun=view.findViewById(R.id.imageFunEat);
        imgPrev=view.findViewById(R.id.imagePrevEat);imgHealth=view.findViewById(R.id.imageHealthEat);
        imgNext=view.findViewById(R.id.imageNextEat);imgFridge=view.findViewById(R.id.imageFridgeEat);
        imgCoin=view.findViewById(R.id.imageCoinEat);imgNextFood=view.findViewById(R.id.imageNextFoodEat);
        imgLvl=view.findViewById(R.id.imageLevelEat);imgShop=view.findViewById(R.id.imageShopEat);
        imgPrevFood=view.findViewById(R.id.imagePrevFoodEat);imgFood=view.findViewById(R.id.imageFoodEat);

        tvPlace=view.findViewById(R.id.textView6);tvCoin=view.findViewById(R.id.tvCoinEat);tvLvl=view.findViewById(R.id.tvLevelEat);

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
            angka=0;
            gantiPage(HomeActivity.pages);
        }else if(angka<0){
            angka=4;
            gantiPage(HomeActivity.pages);
        }
    }
}
