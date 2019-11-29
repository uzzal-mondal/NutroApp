package com.example.nutroapp.statsdays_activity_05;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bosphere.verticalslider.VerticalSlider;
import com.example.nutroapp.R;

import java.util.List;

public class StatsRecyclerAdapter extends RecyclerView.Adapter<StatsRecyclerAdapter.MyViewHolder> {

    private Context context;
    private List<StatsModel> statsModelList;

    public StatsRecyclerAdapter(Context context, List<StatsModel> statsModelList) {
        this.context = context;
        this.statsModelList = statsModelList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context)
                .inflate(R.layout.item_stats_day_recycler_item, parent,false);
        MyViewHolder holder = new MyViewHolder(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {


        holder.slider.setProgress(statsModelList.get(position).getvSlide());
        holder.countNum.setText(String.valueOf(statsModelList.get(position).getCountDayNum()));


    }

    @Override
    public int getItemCount() {
        return statsModelList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        VerticalSlider slider;
        TextView countNum;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            slider = itemView.findViewById(R.id.vertical_slider);
            countNum = itemView.findViewById(R.id.day_count_num);

        }
    }
}
