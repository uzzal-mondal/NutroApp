package com.example.nutroapp.recipes_activity_05;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.nutroapp.R;

import java.util.List;

public class RecyclerRecipesAdapter extends RecyclerView
        .Adapter<RecyclerRecipesAdapter.MyViewHolder>  {

    List<RecipesModel> recipesModelList;
    Context context;

    public RecyclerRecipesAdapter(List<RecipesModel> recipesModelList, Context context) {
        this.recipesModelList = recipesModelList;
        this.context = context;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.item_recipes_recycler_row
        ,parent,false);

        MyViewHolder holder = new MyViewHolder(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.headerImg.setImageResource(recipesModelList.get(position).getHeaderImg());
        holder.subImg.setImageResource(recipesModelList.get(position).getSubImg());
        holder.wishImg.setImageResource(recipesModelList.get(position).getWishImg());

        holder.gdtv.setText(recipesModelList.get(position).getGoodText());
        holder.countliketv.setText(String.valueOf(recipesModelList.get(position).getCountLikes()));
        holder.liketv.setText(recipesModelList.get(position).getLikeText());


        holder.caloriestv.setText(recipesModelList.get(position).getCalText());
        holder.counttv.setText(String.valueOf(recipesModelList.get(position).getCount()));
        holder.timertv.setText(recipesModelList.get(position).getTimer());


    }

    @Override
    public int getItemCount() {
        return recipesModelList.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {

       ImageView headerImg,subImg,wishImg;
       TextView  gdtv, countliketv, liketv,caloriestv,counttv,timertv;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            headerImg = itemView.findViewById(R.id.imagebg_recips_id);
            subImg = itemView.findViewById(R.id.imageRecipesPlamsIcon_id);
            wishImg = itemView.findViewById(R.id.iamge_wishes_id);

            gdtv = itemView.findViewById(R.id.text_good_id);

            countliketv = itemView.findViewById(R.id.likes_thirteen_id);
            liketv = itemView.findViewById(R.id.likesTv_id);

            caloriestv = itemView.findViewById(R.id.calories_id);
            counttv = itemView.findViewById(R.id.text_count_id);
            timertv = itemView.findViewById(R.id.text_time_id);






        }
    }

}
