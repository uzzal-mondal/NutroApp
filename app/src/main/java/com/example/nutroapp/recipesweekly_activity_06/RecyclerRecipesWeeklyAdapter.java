package com.example.nutroapp.recipesweekly_activity_06;

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

public class RecyclerRecipesWeeklyAdapter extends RecyclerView
        .Adapter<RecyclerRecipesWeeklyAdapter.MyViewHolder> {

   private Context context;
   private List<RecipesWeeklyModels> recipesWeeklyModelsList;

    public RecyclerRecipesWeeklyAdapter(Context context,
                                        List<RecipesWeeklyModels> recipesWeeklyModelsList) {
        this.context = context;
        this.recipesWeeklyModelsList = recipesWeeklyModelsList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {


        View view = LayoutInflater.from(context).inflate(R.layout.
                        item_recipes_weekly_recycler_item, parent,false);
        MyViewHolder holder = new MyViewHolder(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

            holder.progressView.setProgress(recipesWeeklyModelsList.get(position).getProgress());
            holder.dayTv.setText(recipesWeeklyModelsList.get(position).getDay());
    }

    @Override
    public int getItemCount() {
        return recipesWeeklyModelsList.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        ProgressView progressView;
        TextView dayTv;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            progressView = itemView.findViewById(R.id.progressView);
            dayTv = itemView.findViewById(R.id.text_day_id);
        }
    }
}
