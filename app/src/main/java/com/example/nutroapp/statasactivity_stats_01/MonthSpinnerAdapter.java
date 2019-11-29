package com.example.nutroapp.statasactivity_stats_01;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class MonthSpinnerAdapter  extends ArrayAdapter<MonthSpinnerModel> {

    private Context context;
    private MonthSpinnerModel[] monthSpinnerModels;

    public MonthSpinnerAdapter(@NonNull Context context,  int textViewResourceId,
                               MonthSpinnerModel[] monthSpinnerModels) {
        super(context, textViewResourceId, monthSpinnerModels);
        this.context =context;
        this.monthSpinnerModels = monthSpinnerModels;
    }

    @Override
    public int getCount() {
        return monthSpinnerModels.length;
    }

    @Nullable
    @Override
    public MonthSpinnerModel getItem(int position) {
      return monthSpinnerModels[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    // this is for the passive for the spinner


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {


        TextView label = (TextView) super.getView(position, convertView, parent);
        label.setTextColor(Color.WHITE);
        label.setText(monthSpinnerModels[position].getMonthName());

        return label;

    }

    @Override
    public View getDropDownView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        TextView label = (TextView) super.getDropDownView(position, convertView, parent);
        label.setTextColor(Color.BLACK);
        label.setText(monthSpinnerModels[position].getMonthName());

        return label;
    }
}
