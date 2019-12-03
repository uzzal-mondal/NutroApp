package com.example.nutroapp.dietaryhardinge_social_05_convertfragment;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.nutroapp.R;

import java.util.List;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.MyViewHolder> {

    private Context context;
    private List<ItemImgModel> itemImgModelList;

    public RecyclerAdapter(Context context, List<ItemImgModel> itemImgModelList) {
        this.context = context;
        this.itemImgModelList = itemImgModelList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.item_hardinge_layout,
                parent,false);
        MyViewHolder holder = new MyViewHolder(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.imgpro.setImageResource(itemImgModelList.get(position).getImage());

    }

    @Override
    public int getItemCount() {
        return itemImgModelList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView imgpro;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            imgpro = itemView.findViewById(R.id.profileimage);
        }
    }
}
