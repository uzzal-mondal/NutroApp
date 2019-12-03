package com.example.nutroapp.dietaryhardinge_social_05_convertfragment;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class SpinnerAdapter {

  /*  private Context context;
    private SpinnerModel[] spinnerModels;

    public SpinnerAdapter(@NonNull Context context, int textViewResourceId,
                          SpinnerModel[] spinnerModels) {
        super(context, textViewResourceId, spinnerModels);
        this.context = context;
        this.spinnerModels = spinnerModels;
    }

    @Override
    public int getCount() {
        return spinnerModels.length;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        TextView label = (TextView) super.getView(position, convertView, parent);
        label.setTextColor(Color.WHITE);
        label.setText(spinnerModels[position].getVegName());

        return label;
    }

    @Override
    public View getDropDownView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        TextView label = (TextView) super.getDropDownView(position, convertView, parent);
        label.setTextColor(Color.BLACK);
        label.setText(spinnerModels[position].getVegName());

        return label;
    }*/
}
