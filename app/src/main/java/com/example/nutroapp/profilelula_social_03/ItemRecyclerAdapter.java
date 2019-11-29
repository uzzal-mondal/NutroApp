package com.example.nutroapp.profilelula_social_03;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.nutroapp.R;

import java.util.List;

public class ItemRecyclerAdapter extends RecyclerView
        .Adapter<ItemRecyclerAdapter.MyViewHolder> {

    Context context;
    List<ItemModel> itemModelList;


    public ItemRecyclerAdapter(Context context, List<ItemModel> itemModelList) {
        this.context = context;
        this.itemModelList = itemModelList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.
                        item_lula_long_recycler_row_layout,parent,false);
        MyViewHolder holder = new MyViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.imagePro.setImageResource(itemModelList.get(position).getImage());
    }

    @Override
    public int getItemCount() {
        return itemModelList.size();
    }

    public static   class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView imagePro;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            imagePro = (ImageView) itemView.findViewById(R.id.imageView_row_long_id);
        }
    }
}
