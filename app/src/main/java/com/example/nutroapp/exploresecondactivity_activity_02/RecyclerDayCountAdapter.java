package com.example.nutroapp.exploresecondactivity_activity_02;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.example.nutroapp.R;

public class RecyclerDayCountAdapter extends RecyclerView.Adapter<RecyclerDayCountAdapter.MyViewHolder> {


    private Context context;
    private Integer selectedPosition = null;

    public RecyclerDayCountAdapter(Context  context){

        this.context = context;
    }


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.
                item_explore_recycler_first_row_layout,parent,false);

        MyViewHolder holder = new MyViewHolder(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, final int position) {

        // thank full to muzahid vaia, this is for important bg count .... ##
        holder.textCount.setText((position + 1) + "");
        if (selectedPosition != null) {
            if (position == selectedPosition) {
                holder.textCount.setBackgroundResource(R.drawable.bg_square_box);
                holder.textCount.setTextColor(context.getResources().getColor(R.color.white));
            } else {
                holder.textCount.setBackgroundResource(R.drawable.bg_square_gray);
                holder.textCount.setTextColor(context.getResources().getColor(R.color.color_text));
            }
        } else {
            holder.textCount.setBackgroundResource(R.drawable.bg_square_gray);
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
        return 31;
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
