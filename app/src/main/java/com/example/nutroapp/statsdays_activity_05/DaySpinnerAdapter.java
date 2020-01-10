package com.example.nutroapp.statsdays_activity_05;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class DaySpinnerAdapter extends ArrayAdapter<DaySpinnerModel> {

    private Context context;
    private  DaySpinnerModel[] daySpinnerModels;

    public DaySpinnerAdapter(@NonNull Context context, int textViewResourceId,
                             DaySpinnerModel[] daySpinnerModels) {
        super(context, textViewResourceId,daySpinnerModels);

        this.context = context;
        this.daySpinnerModels = daySpinnerModels;
    }


    @Override
    public int getCount() {
        return daySpinnerModels.length;
    }

    @Nullable
    @Override
    public DaySpinnerModel getItem(int position) {
        return daySpinnerModels[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {


        TextView labeltv = (TextView) super.getView(position, convertView, parent);
        labeltv.setTextColor(Color.BLACK);
        labeltv.setText(daySpinnerModels[position].getStatDayName());

        return labeltv;
    }

    @Override
    public View getDropDownView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        TextView labeltv;

        labeltv = (TextView) super.getView(position, convertView, parent);
        labeltv.setTextColor(Color.BLACK);
        labeltv.setText(daySpinnerModels[position].getStatDayName());

        return labeltv;
    }
}
