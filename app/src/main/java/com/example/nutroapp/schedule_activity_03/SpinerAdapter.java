package com.example.nutroapp.schedule_activity_03;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class SpinerAdapter extends ArrayAdapter<MonthModel> {

    LayoutInflater inflater;
    private Context context;
    private MonthModel[] monthModels;

    public SpinerAdapter(@NonNull Context context, int textViewResourceId,
                         MonthModel[] monthModels) {
        super(context, textViewResourceId, monthModels);
        this.context = context;
        this.monthModels = monthModels;
    }

    @Override
    public int getCount() {
        return monthModels.length;
    }

    @Nullable
    @Override
    public MonthModel getItem(int position) {
        return monthModels[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }


    // this is for the "passive"state for the spinner
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        TextView label = (TextView) super.getView(position, convertView, parent);
        label.setTextColor(Color.WHITE);
        label.setText(monthModels[position].getMonthName());

        return label;
    }

    @Override
    public View getDropDownView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        TextView label = (TextView) super.getDropDownView(position, convertView, parent);
        label.setTextColor(Color.BLACK);
        label.setText(monthModels[position].getMonthName());

        return label;
    }

}