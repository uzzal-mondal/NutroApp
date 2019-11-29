package com.example.nutroapp.statistic_stats_03;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.nutroapp.R;
import com.skydoves.progressview.ProgressView;

import java.util.List;

public class RecyclerStatisticAdapter extends RecyclerView.Adapter<RecyclerStatisticAdapter.MyViewHolder> {


    private Context context;
    private List<StatisticModel> statisticModelList;

    public RecyclerStatisticAdapter(Context context, List<StatisticModel> statisticModelList) {
        this.context = context;
        this.statisticModelList = statisticModelList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context)
                .inflate(R.layout.item_statistic_recycler_item, parent,false);
        MyViewHolder holder = new MyViewHolder(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.progressView.setProgress(statisticModelList.get(position).getProgress());
        holder.dayTv.setText(statisticModelList.get(position).getMonth());

    }

    @Override
    public int getItemCount() {
        return statisticModelList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        ProgressView progressView;
        TextView dayTv;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            progressView = itemView.findViewById(R.id.progressView);
            dayTv = itemView.findViewById(R.id.text_day_id);
        }
    }
}
