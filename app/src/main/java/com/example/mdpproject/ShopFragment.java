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

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class ShopFragment extends Fragment {
    ImageView imgClose,imgPotion,imgFood,imgShower,imgSoap,imgBalls;
    public static ArrayList<item> listitem = new ArrayList<>();
    public ShopFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_shop, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        imgClose=view.findViewById(R.id.imageCloseShop);imgFood=view.findViewById(R.id.imageFoodShop);
        imgPotion=view.findViewById(R.id.imagePotionShop);imgShower=view.findViewById(R.id.imageShowerShop);
        imgSoap=view.findViewById(R.id.imageSoapShop);imgBalls=view.findViewById(R.id.imageBallShop);
        imgClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int angka = HomeActivity.pages;
                gantiPage(angka);
            }
        });
        imgShower.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listitem.clear();
                listitem.add(new item(300,"Shower_red","Shower"));
                listitem.add(new item(300,"Shower_brown","Shower"));
                listitem.add(new item(300,"Shower_black","Shower"));
                listitem.add(new item(300,"Shower_pink","Shower"));
                bukaShop();
            }
        });
        imgFood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listitem.clear();
                listitem.add(new item(300,"food_croissant_chocolate","Food"));
                listitem.add(new item(300,"food_croissant_cheese","Food"));
                listitem.add(new item(300,"food_bacon","Food"));
                listitem.add(new item(300,"food_bread_chocolate","Food"));
                listitem.add(new item(300,"food_cereal_chocolate","Food"));
                bukaShop();
            }
        });
        imgSoap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listitem.clear();
                listitem.add(new item(300,"soap_red","Soap"));
                bukaShop();
            }
        });
        imgPotion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listitem.clear();
                listitem.add(new item(300,"potions_adult","Potion"));
                listitem.add(new item(300,"potions_all_max","Potion"));
                listitem.add(new item(300,"potions_baby","Potion"));
                listitem.add(new item(300,"potions_energizer","Potion"));
                listitem.add(new item(300,"potions_fat_burner","Potion"));
                listitem.add(new item(300,"potions_health_big","Potion"));
                listitem.add(new item(300,"potions_healt_small","Potion"));
                listitem.add(new item(300,"potions_hunger","Potion"));
                bukaShop();
            }
        });
        imgBalls.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listitem.clear();
                listitem.add(new item(300,"ball_beach1","Ball"));
                listitem.add(new item(300,"ball_beach2","Ball"));
                listitem.add(new item(300,"ball_beach3","Ball"));
                listitem.add(new item(300,"ball_beach4","Ball"));
                listitem.add(new item(300,"ball_beach5","Ball"));
                listitem.add(new item(300,"ball_beach6","Ball"));
                listitem.add(new item(300,"ball_beach7","Ball"));
                listitem.add(new item(300,"ball_beach8","Ball"));
                bukaShop();
            }
        });

    }

    public void bukaShop(){
        getFragmentManager().beginTransaction().replace(R.id.myFragment, new ItemShopFragment()).addToBackStack(null).commit();
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
