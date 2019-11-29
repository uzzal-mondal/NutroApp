package com.example.nutroapp.statsdays_activity_05;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class SpinnerStatsAdapter extends ArrayAdapter<SpinnerStatsModel> {

    private Context context;
    private  SpinnerStatsModel[] spinnerStatsModels;


    public SpinnerStatsAdapter(@NonNull Context context, int textViewResourceId,
                               SpinnerStatsModel[] spinnerStatsModels) {
        super(context, textViewResourceId, spinnerStatsModels);

        this.context =context;
        this.spinnerStatsModels = spinnerStatsModels;

    }


    @Override
    public int getCount() {
        return spinnerStatsModels.length;
    }

    @Nullable
    @Override
    public SpinnerStatsModel getItem(int position) {
        return spinnerStatsModels[position];

    }

    @Override
    public long getItemId(int position) {
        return position;
        // this is for the passive for the spinner
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        TextView label = (TextView) super.getView(position, convertView, parent);
        label.setTextColor(Color.BLACK);
        label.setText(spinnerStatsModels[position].getStatsmonthName());

        return label;
    }

    @Override
    public View getDropDownView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {


        TextView label = (TextView) super.getView(position, convertView, parent);
        label.setTextColor(Color.BLACK);
        label.setText(spinnerStatsModels[position].getStatsmonthName());

        return label;
    }
}
