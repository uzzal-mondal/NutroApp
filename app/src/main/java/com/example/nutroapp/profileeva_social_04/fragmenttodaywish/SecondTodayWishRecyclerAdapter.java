package com.example.nutroapp.profileeva_social_04.fragmenttodaywish;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.nutroapp.R;

import java.util.List;

public class SecondTodayWishRecyclerAdapter extends
        RecyclerView.Adapter<SecondTodayWishRecyclerAdapter.MySecondTodayHolder> {

    private Context context;
    private List<SecondTodayWishModel> todayWishModels;


    // create a constructor.. ##
    public SecondTodayWishRecyclerAdapter(Context context, List<SecondTodayWishModel> todayWishModels) {
        this.context = context;
        this.todayWishModels = todayWishModels;
    }

    @NonNull
    @Override
    public MySecondTodayHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.item_second_today,
                parent,false);
        MySecondTodayHolder holder = new MySecondTodayHolder(view);

        return holder;


    }

    @Override
    public void onBindViewHolder(@NonNull MySecondTodayHolder holder, int position) {

        holder.imageTs.setImageResource(todayWishModels.get(position).getImage());
        //  holder.headdingText.setText(secondTodayModels.get(position).getText());
    }

    @Override
    public int getItemCount() {
        return todayWishModels.size();
    }

    public class MySecondTodayHolder extends RecyclerView.ViewHolder {

        ImageView imageTs;
        //TextView headdingText;

        public MySecondTodayHolder(@NonNull View itemView) {
            super(itemView);

            imageTs = itemView.findViewById(R.id.image_itemsecond);
            // headdingText = itemView.findViewById(R.id.text_itemsecond);
        }
    }


}
