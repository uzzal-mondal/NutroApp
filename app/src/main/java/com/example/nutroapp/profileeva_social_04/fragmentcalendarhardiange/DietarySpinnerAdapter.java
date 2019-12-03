package com.example.nutroapp.profileeva_social_04.fragmentcalendarhardiange;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;


public class DietarySpinnerAdapter extends ArrayAdapter<DietarySpinnerModel> {

    private Context context;
    private DietarySpinnerModel[] dietarySpinnerModels;


    public DietarySpinnerAdapter(@NonNull Context context, int textViewResourceId,
                                 DietarySpinnerModel[] dietarySpinnerModels) {
        super(context, textViewResourceId, dietarySpinnerModels);
        this.context = context;
        this.dietarySpinnerModels = dietarySpinnerModels;

    }

    @Override
    public int getCount() {
        return dietarySpinnerModels.length;
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
      //  label.setText(DietarySpinnerModel[position].getVegName());
        label.setText(dietarySpinnerModels[position].getVegName());
        return label;
    }

    @Override
    public View getDropDownView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        TextView label = (TextView) super.getDropDownView(position, convertView, parent);
        label.setTextColor(Color.BLACK);
        label.setText(dietarySpinnerModels[position].getVegName());

        return label;
    }
}
