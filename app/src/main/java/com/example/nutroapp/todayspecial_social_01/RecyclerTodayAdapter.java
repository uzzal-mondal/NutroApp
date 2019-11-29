package com.example.nutroapp.todayspecial_social_01;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.nutroapp.R;

import java.util.List;

public class RecyclerTodayAdapter extends RecyclerView.Adapter<RecyclerTodayAdapter.MyViewHolder> {

   private Context context;
   private List<TodayModel>  todayModelList;


    public RecyclerTodayAdapter(Context context, List<TodayModel> todayModelList) {
        this.context = context;
        this.todayModelList = todayModelList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context)
                .inflate(R.layout.item_today,parent,false);
        MyViewHolder holder = new MyViewHolder(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.imageToday.setImageResource(todayModelList.get(position).getMainImg());
        holder.tvHourTime.setText(todayModelList.get(position).getTimeTv());

    }

    @Override
    public int getItemCount() {
        return todayModelList.size();
    }



    public class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView imageToday;
        TextView tvHourTime;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            // image
            imageToday = itemView.findViewById(R.id.imageItemToday);
            //text
            tvHourTime = itemView.findViewById(R.id.hour_text_today);


        }
    }
}
