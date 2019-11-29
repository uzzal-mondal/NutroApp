package com.example.nutroapp.schedule_activity_03;

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

public class ScheduleRecyclerAdapter extends RecyclerView.
        Adapter<ScheduleRecyclerAdapter.MyViewHolder> {

    private Context context;
    private List<ScheduleModel> scheduleModelList;

    public ScheduleRecyclerAdapter(Context context, List<ScheduleModel> scheduleModelList) {
        this.context = context;
        this.scheduleModelList = scheduleModelList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(
                R.layout.item_schedule_row_recycler_layout,parent,false);
        MyViewHolder holder = new MyViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.imageschedule.setImageResource(scheduleModelList.get(position).getImage());

    }

    @Override
    public int getItemCount() {
        return scheduleModelList.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView imageschedule;
        ConstraintLayout constraintLayout;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            imageschedule = itemView.findViewById(R.id.imageCircle_scheduleRow_id);
            constraintLayout = itemView.findViewById(R.id.constraint_item_schedule_id);
        }
    }
}
