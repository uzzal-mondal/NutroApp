package com.example.nutroapp.exploreactivity_Activity_01;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;


import com.example.nutroapp.R;

import java.util.List;

public class RecyclerViewAdapterIcon extends RecyclerView.
        Adapter<RecyclerViewAdapterIcon.MyViewHolder> {

    // context and list asign ... ##
    private Context context;
    private List<ItemImageModelIcon> itemImageModelIconList;

    public RecyclerViewAdapterIcon(Context context, List<ItemImageModelIcon> itemImageModelIconList){

       this.context = context;
       this.itemImageModelIconList = itemImageModelIconList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       // inflate this is layout ... ##
        View view = LayoutInflater.from(context).inflate(R.layout.
                        item_explore_recycler_second_row_layouot,
                parent,false);
        final MyViewHolder myViewHolder = new MyViewHolder(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.imageViewExplore.setImageResource(itemImageModelIconList.get(position).getImage());
    }

    @Override
    public int getItemCount() {
        return itemImageModelIconList.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        private ImageView imageViewExplore;
        private ConstraintLayout constraint_item;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            constraint_item = itemView.findViewById(R.id.constrant_itemrow_layout_recycler_id);
            imageViewExplore = itemView.findViewById(R.id.image_item_explore_row_id);

        }
    }
}
