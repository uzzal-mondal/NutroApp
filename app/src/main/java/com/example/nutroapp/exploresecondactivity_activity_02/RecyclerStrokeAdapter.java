package com.example.nutroapp.exploresecondactivity_activity_02;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.nutroapp.R;

import java.util.List;

public class RecyclerStrokeAdapter extends RecyclerView.Adapter<RecyclerStrokeAdapter.MyviewHolder> {

    private Context context;
    private List<StrokeTimeModel> strokeTimeModelList;

    public RecyclerStrokeAdapter(Context context, List<StrokeTimeModel> strokeTimeModelList) {
        this.context = context;
        this.strokeTimeModelList = strokeTimeModelList;
    }

    @NonNull
    @Override
    public MyviewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.item_stroke_time,
                parent,false);
        MyviewHolder holder = new MyviewHolder(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyviewHolder holder, int position) {

        holder.textNine.setText(strokeTimeModelList.get(position).getTimeshows());
        holder.strokeimg.setImageResource(R.drawable.bg_stroke_line);

    }

    @Override
    public int getItemCount() {
        return strokeTimeModelList.size();
    }

    public class MyviewHolder extends RecyclerView.ViewHolder {
        TextView textNine;
        ImageView strokeimg;
        public MyviewHolder(@NonNull View itemView) {
            super(itemView);

            textNine = itemView.findViewById(R.id.nine);
            strokeimg = itemView.findViewById(R.id.imagestroke_id);
        }
    }
}
