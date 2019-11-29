package com.example.nutroapp.exploresecondactivity_activity_02;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.nutroapp.R;

import java.util.List;

public class RecyclerMonthNameAdapter extends RecyclerView.Adapter<RecyclerMonthNameAdapter.MyViewHolder> {


    private Context context;
    private List<MonthModel> modelList;

    public RecyclerMonthNameAdapter(Context context, List<MonthModel> modelList) {
        this.context = context;
        this.modelList = modelList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout
                        .item_month_explore_chart_layout, parent,false);
        MyViewHolder holder = new MyViewHolder(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.textmonth.setText(modelList.get(position).getMonthCountName());

    }

    @Override
    public int getItemCount() {
        return modelList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView textmonth;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            textmonth = itemView.findViewById(R.id.textmonthid);
        }
    }
}
