package com.example.nutroapp.schedule;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.nutroapp.R;

public class SpinerAdapter extends ArrayAdapter<Month> {

    LayoutInflater inflater;
    private Context context;
    private Month[] months;

    public SpinerAdapter(@NonNull Context context, int textViewResourceId, Month[] months) {
        super(context, textViewResourceId, months);
        this.context = context;
        this.months = months;
    }

    @Override
    public int getCount() {
        return months.length;
    }

    @Nullable
    @Override
    public Month getItem(int position) {
        return months[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }


    // this is for the "passive"state for the spinner

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {


        TextView label = (TextView) super.getView(position,convertView,parent);
        label.setTextColor(Color.BLACK);
        label.setText(months[position].getMonth());

        return label;
    }

    @Override
    public View getDropDownView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {


       TextView label = (TextView) super.getDropDownView(position,convertView,parent);
        label.setTextColor(Color.BLACK);
        label.setText(months[position].getMonth());

        return label;
    }

    /*  @Override
    public int getCount() {
        return month.length;
    }

    @Override
    public Object getItem(int position) {
        return month[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {



        if (convertView == null) {
            inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.spinner_view, parent, false);
        }
         textView = convertView.findViewById(R.id.textSpinnerList_id);
         textView.setTextColor(Color.WHITE);
         textView.setText(month[position]);


        return convertView;
    }

    @Override
    public View getDropDownView(int position, View convertView, ViewGroup parent) {
        return super.getDropDownView(position, convertView, parent);

        TextView label;
        label = (TextView) super.getView(position, convertView, parent);*/



}
