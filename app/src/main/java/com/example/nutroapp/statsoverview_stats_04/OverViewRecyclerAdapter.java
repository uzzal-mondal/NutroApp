package com.example.nutroapp.statsoverview_stats_04;

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

public class OverViewRecyclerAdapter extends RecyclerView.Adapter<OverViewRecyclerAdapter.MyViewHolder> {

    private Context context;
    private List<OverviewModel> overviewModelList;

    public OverViewRecyclerAdapter(Context context, List<OverviewModel> overviewModelList) {
        this.context = context;
        this.overviewModelList = overviewModelList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.
                item_recipes_weekly_recycler_item, parent, false);
        MyViewHolder holder = new MyViewHolder(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.progressViewRecp.setProgress(overviewModelList.get(position).getProgressRecp());
        holder.dayTvRecp.setText(overviewModelList.get(position).getDayRecp());

    }

    @Override
    public int getItemCount() {
        return overviewModelList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        ProgressView progressViewRecp;
        TextView dayTvRecp;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            progressViewRecp = itemView.findViewById(R.id.progressView);
            dayTvRecp = itemView.findViewById(R.id.text_day_id);
        }
    }
}
