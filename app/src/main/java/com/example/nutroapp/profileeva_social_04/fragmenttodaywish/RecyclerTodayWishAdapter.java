package com.example.nutroapp.profileeva_social_04.fragmenttodaywish;

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

public class RecyclerTodayWishAdapter extends RecyclerView.Adapter<RecyclerTodayWishAdapter.MyViewTodayHolder> {


    private Context context;
    private List<TodayWishModel> todayWishModelList;

    public RecyclerTodayWishAdapter(Context context, List<TodayWishModel> todayWishModelList) {
        this.context = context;
        this.todayWishModelList = todayWishModelList;
    }

    @NonNull
    @Override
    public MyViewTodayHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context)
                .inflate(R.layout.item_today,parent,false);

     MyViewTodayHolder holder = new MyViewTodayHolder(view);
        return holder;

    }

    @Override
    public void onBindViewHolder(@NonNull MyViewTodayHolder holder, int position) {

        holder.imageToday.setImageResource(todayWishModelList.get(position).getMainImg());
        holder.tvHourTime.setText(todayWishModelList.get(position).getTimeTv());


    }

    @Override
    public int getItemCount() {
        return todayWishModelList.size();
    }

    public class MyViewTodayHolder extends RecyclerView.ViewHolder {

        ImageView imageToday;
        TextView tvHourTime;


        public MyViewTodayHolder(@NonNull View itemView) {
            super(itemView);

            // image
            imageToday = itemView.findViewById(R.id.imageItemToday);
            //text
            tvHourTime = itemView.findViewById(R.id.hour_text_today);

        }
    }
}
