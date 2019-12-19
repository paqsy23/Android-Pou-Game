package com.example.mdpproject;


import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class ItemShopFragment extends Fragment {
    RecyclerView rv;
    ItemAdapter adapter;
    ImageView imgBack,imgClose;
    public ItemShopFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_item_shop, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        rv=view.findViewById(R.id.rvItemShop);
        imgBack=view.findViewById(R.id.imageBack);
        imgClose=view.findViewById(R.id.imageCloseShop);
        imgBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tutupShop();
            }
        });

        imgClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gantiPage(HomeActivity.pages);
            }
        });

        imgClose=view.findViewById(R.id.imageCloseShop);
        adapter = new ItemAdapter(ShopFragment.listitem, HomeActivity.u, new ItemAdapter.onRecyclerClickListener() {
            @Override
            public void OnClickListener(View v, int pos, ArrayList<item> listitem) {
                if(HomeActivity.u.getCoin()>=ShopFragment.listitem.get(pos).getPrice()){
                    HomeActivity.itemUser.add(ShopFragment.listitem.get(pos));
                    HomeActivity.u.setItems(HomeActivity.itemUser);
                    HomeActivity.u.setCoin(HomeActivity.u.getCoin()-ShopFragment.listitem.get(pos).getPrice());
                }
            }
        });

        rv.setHasFixedSize(true);
        rv.setLayoutManager(new LinearLayoutManager(getActivity()));
        rv.setAdapter(adapter);
    }

    public void tutupShop(){
        getFragmentManager().beginTransaction().remove(this).commit();
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
