package com.example.nutroapp.evaolson_social_02;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;


public class SpinnerAdapter extends ArrayAdapter<SpinnerModelEva> {

    private Context context;
    private SpinnerModelEva[] spinnerModels;

    public SpinnerAdapter(@NonNull Context context, int textViewResourceId,
                          SpinnerModelEva[] spinnerModels) {
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
        label.setText(spinnerModels[position].getTextadd());

        return label;
    }

    @Override
    public View getDropDownView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        TextView label = (TextView) super.getDropDownView(position, convertView, parent);
        label.setTextColor(Color.BLACK);
        label.setText(spinnerModels[position].getTextadd());

        return label;
    }
}
