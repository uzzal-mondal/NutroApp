package com.example.nutroapp.FreshSearchActivity;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.example.nutroapp.R;

import java.util.ArrayList;
import java.util.List;

public class FreshSearchRecyclerAdapter extends RecyclerView
        .Adapter<FreshSearchRecyclerAdapter.MyFreshSearchHolder> {

    List<CardView> cardViewList = new ArrayList<>();
    private Context context;
    private List<FreshSearchModels> freshModelList;

    public FreshSearchRecyclerAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public MyFreshSearchHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context)
                .inflate(R.layout.item_fresh_forse,parent,false);

        MyFreshSearchHolder holder = new MyFreshSearchHolder(view);

        return holder;


    }

    @Override
    public void onBindViewHolder(@NonNull MyFreshSearchHolder holder, int position) {


        if (position == 0){
            holder.cardview.setCardBackgroundColor(Color.parseColor("#5DD9DE"));
        }

        else if(position==1){
            holder.cardview.setCardBackgroundColor(Color.parseColor("#FF86A3"));
            //  holder.tv1.setTextColor(Color.parseColor("#ffffff"));
        }


        else if(position==2){
            holder.cardview.setCardBackgroundColor(Color.parseColor("#ffffff"));
            //  holder.tv1.setTextColor(Color.parseColor("#ffffff"));
        }

        else if(position==3){
            holder.cardview.setCardBackgroundColor(Color.parseColor("#567845"));
            //  holder.tv1.setTextColor(Color.parseColor("#ffffff"));
        }

        else if(position==4){
            holder.cardview.setCardBackgroundColor(Color.parseColor("#258785"));
            //  holder.tv1.setTextColor(Color.parseColor("#ffffff"));
        }

        else if(position==5){
            holder.cardview.setCardBackgroundColor(Color.parseColor("#ffffff"));
            //  holder.tv1.setTextColor(Color.parseColor("#ffffff"));
        }

        else if(position==6){
            holder.cardview.setCardBackgroundColor(Color.parseColor("#125485"));
            //  holder.tv1.setTextColor(Color.parseColor("#ffffff"));
        }
        else
        {
            holder.cardview.setCardBackgroundColor(Color.parseColor("#ffffff"));

        }



    }

    @Override
    public int getItemCount() {
        return 6;
    }

    public class MyFreshSearchHolder extends RecyclerView.ViewHolder {

        CardView cardview;
        ImageView imagefruit;
        ConstraintLayout constraintLayout;

        public MyFreshSearchHolder(@NonNull View itemView) {
            super(itemView);

            imagefruit = itemView.findViewById(R.id.imagepepe);
            cardview = itemView.findViewById(R.id.cardviewstatics);
            // texforse = itemView.findViewById(R.id.freshforsetext);
            // constraintLayout = itemView.findViewById(R.id.cardconstrant);
        }
    }

}
