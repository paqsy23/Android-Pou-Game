package com.example.mdpproject;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
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
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.rv_item_shop,parent,false);
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
        TextView tvItemName,tvItemPrice;
        Button btnBuy;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imgItem=itemView.findViewById(R.id.imageItem);
            tvItemName=itemView.findViewById(R.id.tvItemName);
            tvItemPrice=itemView.findViewById(R.id.tvPrice);
        }

        void bind(item i){
            if(i.getType().equals("Food")){
                if(i.getName().equals("food_bacon")){
                    imgItem.setImageResource(R.drawable.food_bacon);
                    tvItemName.setText(i.getName());
                    tvItemPrice.setText(i.getPrice());
                }else if(i.getName().equals("food_bread_chocolate")){
                    imgItem.setImageResource(R.drawable.food_bread_chocolate);
                }else if(i.getName().equals("food_cereal_chocolate")){
                    imgItem.setImageResource(R.drawable.food_cereal_chocolate);
                }else if(i.getName().equals("food_croissant_cheese")){
                    imgItem.setImageResource(R.drawable.food_croissant_cheese);
                }else if(i.getName().equals("food_croissant_chocolate")) {
                    imgItem.setImageResource(R.drawable.food_croissant_chocolate);
                }
            }else if(i.getType().equals("Potion")){
                if(i.getName().equals("potions_adult")){
                    imgItem.setImageResource(R.drawable.potions_adult);
                }else if(i.getName().equals("potions_all_max")){
                    imgItem.setImageResource(R.drawable.potions_all_max);
                }else if(i.getName().equals("potions_baby")){
                    imgItem.setImageResource(R.drawable.potions_baby);
                }else if(i.getName().equals("potions_energizer")){
                    imgItem.setImageResource(R.drawable.potions_energizer);
                }else if(i.getName().equals("potions_fat_burner")){
                    imgItem.setImageResource(R.drawable.potions_fat_burner);
                }else if(i.getName().equals("potions_health_big")){
                    imgItem.setImageResource(R.drawable.potions_health_big);
                }else if(i.getName().equals("potions_health_small")){
                    imgItem.setImageResource(R.drawable.potions_health_small);
                }else if(i.getName().equals("potions_hunger")){
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
            }else if(i.getType().equals("Soap")){
                if(i.getName().equals("soap_red")){
                    imgItem.setImageResource(R.drawable.soap_red);
                }
            }else if(i.getType().equals("Ball")){
//                if(i.getName().equals("ball_beach1")){
//                    imgItem.setImageResource(R.drawable.ball_beach1);
//                }
//                else if(i.getName().equals("ball_beach2")){
//                    imgItem.setImageResource(R.drawable.ball_beach2);
//                }else if(i.getName().equals("ball_beach3")){
//                    imgItem.setImageResource(R.drawable.ball_beach3);
//                }else if(i.getName().equals("ball_beach4")){
//                    imgItem.setImageResource(R.drawable.ball_beach4);
//                }else if(i.getName().equals("ball_beach5")){
//                    imgItem.setImageResource(R.drawable.ball_beach5);
//                }else if(i.getName().equals("ball_beach6")){
//                    imgItem.setImageResource(R.drawable.ball_beach6);
//                }else if(i.getName().equals("ball_beach7")){
//                    imgItem.setImageResource(R.drawable.ball_beach7);
//                }else if(i.getName().equals("ball_beach8")){
//                    imgItem.setImageResource(R.drawable.ball_beach8);
//                }
            }
        }
    }


}
