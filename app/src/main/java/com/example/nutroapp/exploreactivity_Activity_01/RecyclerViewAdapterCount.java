package com.example.nutroapp.exploreactivity_Activity_01;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.example.nutroapp.R;

public class RecyclerViewAdapterCount extends RecyclerView.
        Adapter<RecyclerViewAdapterCount.MyViewHolder> {

    private Context context;
    private TextView preText;
    private Integer selectedPosition = null;

    public RecyclerViewAdapterCount(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate
                (R.layout.item_explore_recycler_first_row_layout, parent, false);
        MyViewHolder holder = new MyViewHolder(view);
        return holder;

    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    @SuppressLint("SetTextI18n")
    @Override
    public void onBindViewHolder(@NonNull final MyViewHolder holder, final int position) {
        // thank full to muzahid vaia, this is for important bg count .... ##
        holder.textCount.setText((position + 1) + "");
        if (selectedPosition != null) {
            if (position == selectedPosition) {
                holder.textCount.setBackgroundResource(R.drawable.bg_square_box);
                holder.textCount.setTextColor(context.getResources().getColor(R.color.white));
            } else {
                holder.textCount.setBackgroundResource(R.drawable.bg_square_white);
                holder.textCount.setTextColor(context.getResources().getColor(R.color.color_text));
            }
        } else {
            holder.textCount.setBackgroundResource(R.drawable.bg_square_white);
            holder.textCount.setTextColor(context.getResources().getColor(R.color.color_text));
        }
        holder.textCount.setOnClickListener(new View.OnClickListener() {
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
        TextView textCount;
        ConstraintLayout constraintLayout;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            textCount = (TextView) itemView.findViewById(R.id.textExplore_count_id);
            constraintLayout = (ConstraintLayout) itemView.findViewById(R.id.
                    constrant_itemrow_explore_id);
        }
    }
}
