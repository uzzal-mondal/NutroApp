package com.example.nutroapp.todayspecial_social_01;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.nutroapp.R;

import java.util.List;

public class SecondTodayRecyclerAdapter extends
        RecyclerView.Adapter<SecondTodayRecyclerAdapter.MyViewHolder> {

    private Context context;
    private List<SecondTodayModel> secondTodayModels;

    public SecondTodayRecyclerAdapter(Context context, List<SecondTodayModel> secondTodayModels) {
        this.context = context;
        this.secondTodayModels = secondTodayModels;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.item_second_today,
                parent,false);
        MyViewHolder holder = new MyViewHolder(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.imageTs.setImageResource(secondTodayModels.get(position).getImage());
      //  holder.headdingText.setText(secondTodayModels.get(position).getText());

    }

    @Override
    public int getItemCount() {
        return secondTodayModels.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        ImageView imageTs;
        //TextView headdingText;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            imageTs = itemView.findViewById(R.id.image_itemsecond);
           // headdingText = itemView.findViewById(R.id.text_itemsecond);
        }
    }
}
