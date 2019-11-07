package com.example.nutroapp.profileeva;

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

public class ProfileRecyclerAdapter extends RecyclerView.Adapter<ProfileRecyclerAdapter.MyViewHolder> {


    private Context context;
    private List<ProfileItemModel> profileItemModelList;


    // create a constructor.
    public ProfileRecyclerAdapter(Context context, List<ProfileItemModel> profileItemModelList) {
        this.context = context;
        this.profileItemModelList = profileItemModelList;
    }
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout
                .item_profile_eva_row_recycler_layout,parent,false);
        MyViewHolder holder = new MyViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.profileImageView.setImageResource(profileItemModelList.get(position)
                .getProfileImage());
    }

    @Override
    public int getItemCount() {
       return profileItemModelList.size() ;
    }

    // create a static class then extends to ViewHolder.
    public static class  MyViewHolder extends RecyclerView.ViewHolder {

        ImageView profileImageView;
        ConstraintLayout profileConstrantLayout;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            profileConstrantLayout = itemView.findViewById(R.id.
                    constraint_item_row_profile_eva_olson_id);

            profileImageView = itemView.findViewById(R.id.
                    image_profile_eva_olson_id);
        }
    }
}
