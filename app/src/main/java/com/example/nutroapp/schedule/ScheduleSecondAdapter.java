package com.example.nutroapp.schedule;

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

public class ScheduleSecondAdapter extends RecyclerView.Adapter<ScheduleSecondAdapter.MyViewHolder> {

    private Context context;
    private List<ScheduleSecondModel>  scheduleSecondModelList;

    public ScheduleSecondAdapter(Context context, List<ScheduleSecondModel> scheduleSecondModelList) {
        this.context = context;
        this.scheduleSecondModelList = scheduleSecondModelList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.
                item_schedule_second_row_layout,parent,false);
        MyViewHolder holder = new MyViewHolder(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.imagePlums.setImageResource(scheduleSecondModelList.get(position).getImage());
    }

    @Override
    public int getItemCount() {
        return scheduleSecondModelList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView imagePlums;
        ConstraintLayout constraintLayout;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            imagePlums = itemView.findViewById(R.id.imagePlums_id);
            constraintLayout = itemView.findViewById(R.id.constraint_schedule_second_row);
        }
    }


}
