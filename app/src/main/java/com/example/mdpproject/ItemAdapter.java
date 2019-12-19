package com.example.mdpproject;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.ViewHolder>  {
    public ArrayList<item> listitem;
    public user u;

    public ItemAdapter(ArrayList<item> listitem, user u) {
        this.listitem = listitem;
        this.u = u;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.rv_item,parent,false);
        ItemAdapter.ViewHolder holder=new ItemAdapter.ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final item item = listitem.get(position);
        holder.bind(item);
    }

    @Override
    public int getItemCount() {
        return listitem.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imgItem;
        TextView tvJumlah;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imgItem=itemView.findViewById(R.id.imageItem);
            tvJumlah=itemView.findViewById(R.id.tvJumlah);
        }

        void bind(item i){
            if(i.getType().equals("Food")){
                if(i.getName().equals("food_bacon")){
                    imgItem.setImageResource(R.drawable.food_bacon);
                }else if(i.getName().equals("food_bread_chocolate")){
                    imgItem.setImageResource(R.drawable.food_bread_chocolate);
                }else if(i.getName().equals("food_cereal_chocolate")){
                    imgItem.setImageResource(R.drawable.food_cereal_chocolate);
                }else if(i.getName().equals("food_croissant_cheese")){
                    imgItem.setImageResource(R.drawable.food_croissant_cheese);
                }else if(i.getName().equals("food_croissant_chocolate")) {
                    imgItem.setImageResource(R.drawable.food_croissant_chocolate);
                }
            }else if(i.getType().equals("Potions")){
                if(i.getName().equals("PotionsAdult")){
                    imgItem.setImageResource(R.drawable.potions_adult);
                }else if(i.getName().equals("PotionsAllMax")){
                    imgItem.setImageResource(R.drawable.potions_all_max);
                }else if(i.getName().equals("PotionsBaby")){
                    imgItem.setImageResource(R.drawable.potions_baby);
                }else if(i.getName().equals("PotionsEnergizer")){
                    imgItem.setImageResource(R.drawable.potions_energizer);
                }else if(i.getName().equals("PotionsFatBurner")){
                    imgItem.setImageResource(R.drawable.potions_fat_burner);
                }else if(i.getName().equals("PotionsHealthBig")){
                    imgItem.setImageResource(R.drawable.potions_health_big);
                }else if(i.getName().equals("PotionsHealthSmall")){
                    imgItem.setImageResource(R.drawable.potions_health_small);
                }else if(i.getName().equals("PotionsHunger")){
                    imgItem.setImageResource(R.drawable.potions_hunger);
                }
            }else if(i.getType().equals("Shower")){
                if(i.getName().equals("Shower_black")){
                    imgItem.setImageResource(R.drawable.shower_black);
                }
                else if(i.getName().equals("Shower_red")){
                    imgItem.setImageResource(R.drawable.shower_red);
                }else if(i.getName().equals("Shower_brown")){
                    imgItem.setImageResource(R.drawable.shower_brown);
                }else if(i.getName().equals("Shower_pink")){
                    imgItem.setImageResource(R.drawable.shower_pink);
                }
            }else if(i.getType().equals("Soaps")){
                if(i.getName().equals("Soap_red")){
                    imgItem.setImageResource(R.drawable.soap_red);
                }
            }else if(i.getType().equals("Balls")){

            }
        }
    }


}
