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
    onRecyclerClickListener onclick;

    public ItemAdapter(ArrayList<item> listitem, user u,onRecyclerClickListener onclick) {
        this.listitem = listitem;
        this.u = u;
        this.onclick=onclick;
    }
    public interface onRecyclerClickListener{
        public void OnClickListener(View v, int pos, ArrayList<item> listitem);
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
            btnBuy=itemView.findViewById(R.id.btnBuy);

            btnBuy.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    onclick.OnClickListener(view,ViewHolder.this.getLayoutPosition(),listitem);
                }
            });
        }

        void bind(item i){
            if(i.getType().equals("Food")){
                if(i.getName().equals("food_bacon")){
                    imgItem.setImageResource(R.drawable.food_bacon);
                    tvItemName.setText(i.getName());
                    tvItemPrice.setText(i.getPrice()+"");
                }else if(i.getName().equals("food_bread_chocolate")){
                    imgItem.setImageResource(R.drawable.food_bread_chocolate);
                    tvItemName.setText(i.getName());
                    tvItemPrice.setText(i.getPrice()+"");
                }else if(i.getName().equals("food_cereal_chocolate")){
                    imgItem.setImageResource(R.drawable.food_cereal_chocolate);
                    tvItemName.setText(i.getName());
                    tvItemPrice.setText(i.getPrice()+"");
                }else if(i.getName().equals("food_croissant_cheese")){
                    imgItem.setImageResource(R.drawable.food_croissant_cheese);
                    tvItemName.setText(i.getName());
                    tvItemPrice.setText(i.getPrice()+"");
                }else if(i.getName().equals("food_croissant_chocolate")) {
                    imgItem.setImageResource(R.drawable.food_croissant_chocolate);
                    tvItemName.setText(i.getName());
                    tvItemPrice.setText(i.getPrice()+"");
                }
            }else if(i.getType().equals("Potion")){
                if(i.getName().equals("potions_adult")){
                    imgItem.setImageResource(R.drawable.potions_adult);
                    tvItemName.setText(i.getName());
                    tvItemPrice.setText(i.getPrice()+"");
                }else if(i.getName().equals("potions_all_max")){
                    imgItem.setImageResource(R.drawable.potions_all_max);
                    tvItemName.setText(i.getName());
                    tvItemPrice.setText(i.getPrice()+"");
                }else if(i.getName().equals("potions_baby")){
                    imgItem.setImageResource(R.drawable.potions_baby);
                    tvItemName.setText(i.getName());
                    tvItemPrice.setText(i.getPrice()+"");
                }else if(i.getName().equals("potions_energizer")){
                    imgItem.setImageResource(R.drawable.potions_energizer);
                    tvItemName.setText(i.getName());
                    tvItemPrice.setText(i.getPrice()+"");
                }else if(i.getName().equals("potions_fat_burner")){
                    imgItem.setImageResource(R.drawable.potions_fat_burner);
                    tvItemName.setText(i.getName());
                    tvItemPrice.setText(i.getPrice()+"");
                }else if(i.getName().equals("potions_health_big")){
                    imgItem.setImageResource(R.drawable.potions_health_big);
                    tvItemName.setText(i.getName());
                    tvItemPrice.setText(i.getPrice()+"");
                }else if(i.getName().equals("potions_health_small")){
                    imgItem.setImageResource(R.drawable.potions_health_small);
                    tvItemName.setText(i.getName());
                    tvItemPrice.setText(i.getPrice()+"");
                }else if(i.getName().equals("potions_hunger")){
                    imgItem.setImageResource(R.drawable.potions_hunger);
                    tvItemName.setText(i.getName());
                    tvItemPrice.setText(i.getPrice()+"");
                }
            }else if(i.getType().equals("Shower")){
                if(i.getName().equals("Shower_black")){
                    imgItem.setImageResource(R.drawable.shower_black);
                    tvItemName.setText(i.getName());
                    tvItemPrice.setText(i.getPrice()+"");
                }
                else if(i.getName().equals("Shower_red")){
                    imgItem.setImageResource(R.drawable.shower_red);
                    tvItemName.setText(i.getName());
                    tvItemPrice.setText(i.getPrice()+"");
                }else if(i.getName().equals("Shower_brown")){
                    imgItem.setImageResource(R.drawable.shower_brown);
                    tvItemName.setText(i.getName());
                    tvItemPrice.setText(i.getPrice()+"");
                }else if(i.getName().equals("Shower_pink")){
                    imgItem.setImageResource(R.drawable.shower_pink);
                    tvItemName.setText(i.getName());
                    tvItemPrice.setText(i.getPrice()+"");
                }
            }else if(i.getType().equals("Soap")){
                if(i.getName().equals("soap_red")){
                    imgItem.setImageResource(R.drawable.soap_red);
                    tvItemName.setText(i.getName());
                    tvItemPrice.setText(i.getPrice()+"");
                }
            }else if(i.getType().equals("Ball")){
//                if(i.getName().equals("ball_beach1")){
//                    imgItem.setImageResource(R.drawable.ball_beach1);
//                    tvItemName.setText(i.getName());
//                    tvItemPrice.setText(i.getPrice()+"");
//                }
//                else if(i.getName().equals("ball_beach2")){
//                    imgItem.setImageResource(R.drawable.ball_beach2);
//                    tvItemName.setText(i.getName());
//                    tvItemPrice.setText(i.getPrice()+"");
//                }else if(i.getName().equals("ball_beach3")){
//                    imgItem.setImageResource(R.drawable.ball_beach3);
//                    tvItemName.setText(i.getName());
//                    tvItemPrice.setText(i.getPrice()+"");
//                }else if(i.getName().equals("ball_beach4")){
//                    imgItem.setImageResource(R.drawable.ball_beach4);
//                    tvItemName.setText(i.getName());
//                    tvItemPrice.setText(i.getPrice()+"");
//                }else if(i.getName().equals("ball_beach5")){
//                    imgItem.setImageResource(R.drawable.ball_beach5);
//                    tvItemName.setText(i.getName());
//                    tvItemPrice.setText(i.getPrice()+"");
//                }else if(i.getName().equals("ball_beach6")){
//                    imgItem.setImageResource(R.drawable.ball_beach6);
//                    tvItemName.setText(i.getName());
//                    tvItemPrice.setText(i.getPrice()+"");
//                }else if(i.getName().equals("ball_beach7")){
//                    imgItem.setImageResource(R.drawable.ball_beach7);
//                    tvItemName.setText(i.getName());
//                    tvItemPrice.setText(i.getPrice()+"");
//                }else if(i.getName().equals("ball_beach8")){
//                    imgItem.setImageResource(R.drawable.ball_beach8);
//                    tvItemName.setText(i.getName());
//                    tvItemPrice.setText(i.getPrice()+"");
//                }
            }
        }
    }


}
