package com.example.nutroapp.statasactivity_stats_01;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.nutroapp.R;

import java.util.List;

public class RecyclerAdaptercount extends RecyclerView.Adapter<RecyclerAdaptercount.MyViewHolder> {

    Context context;
    List<CountModel> countModelList;
    private Integer selectedPosition = null;
    private int count = 10;

    public RecyclerAdaptercount(Context context, List<CountModel> countModelList) {
        this.context = context;
        this.countModelList = countModelList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate
                (R.layout.item_explore_recycler_first_row_layout,parent,false);
        MyViewHolder holder = new MyViewHolder(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, final int position) {

        // thank full to muzahid vaia, this is for important bg count .... ##
        holder.tvCount.setText((position + 100) + "");
        if (selectedPosition != null) {
            if (position == selectedPosition) {
                holder.tvCount.setBackgroundResource(R.drawable.bg_square_box);
                holder.tvCount.setTextColor(context.getResources().getColor(R.color.white));
            } else {
                holder.tvCount.setBackgroundResource(R.drawable.bg_square_white);
                holder.tvCount.setTextColor(context.getResources().getColor(R.color.color_text));
            }
        } else {
            holder.tvCount.setBackgroundResource(R.drawable.bg_square_white);
            holder.tvCount.setTextColor(context.getResources().getColor(R.color.color_text));
        }
        holder.tvCount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectedPosition = position;
                notifyDataSetChanged();
            }
        });

    }

    @Override
    public int getItemCount() {
        return 50;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView tvCount;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            tvCount = itemView.findViewById(R.id.textExplore_count_id);
        }
    }
}
