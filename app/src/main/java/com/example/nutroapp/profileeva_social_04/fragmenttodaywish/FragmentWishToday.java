package com.example.nutroapp.profileeva_social_04.fragmenttodaywish;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.nutroapp.R;
import com.example.nutroapp.evaolson_social_02.EvaOlsonActivity;
import com.example.nutroapp.todayspecial_social_01.TodayActivity;

import java.util.List;

public class FragmentWishToday extends Fragment {

    private RecyclerView recyclerView;
    private RecyclerView recyclerViewPlace;
    private List<TodayWishModel> todayWishModelList;
    private List<SecondTodayWishModel> modelList;

    private AppCompatTextView todayText;
    private AppCompatImageView imageback;
    private Context context;

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        this.context = context;

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_wish_pro,container,false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);



        recyclerView = view.findViewById(R.id.recyclertoday);
        todayText =view.findViewById(R.id.todaytext);
        imageback = view.findViewById(R.id.backmenu_id);

        imageback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              //  onBackPressed();
            }
        });

        // go to another activity...##
        todayText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              //  startActivity(new Intent(TodayActivity.this, EvaOlsonActivity.class));
            }
        });

         // recycler adapter... ##
        RecyclerTodayWishAdapter adapter = new RecyclerTodayWishAdapter(context,
                TodayWishModel.getTodayModelList());

        // important grid layout... ##
        GridLayoutManager gridLayoutManager = new GridLayoutManager(context,2);
        gridLayoutManager.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() {
            @Override
            public int getSpanSize(int position) {
                return position == 0 ? 2 : 1;
            }
        });




           /*.........second recycler adapter.....###................*/


        //second recycler adapter ..##
        recyclerViewPlace = view.findViewById(R.id.recyclerplaceid);
        SecondTodayWishRecyclerAdapter recyclerAdapter = new SecondTodayWishRecyclerAdapter(context,
                SecondTodayWishModel.getsecondtodaymodel());
        recyclerViewPlace.setLayoutManager(new LinearLayoutManager(context,
                RecyclerView.VERTICAL, false));
        recyclerViewPlace.setAdapter(recyclerAdapter);


    }

    //status bar color... ##
    public void setStatusBarColor(Activity activity, int colorResourceId) {
        Window window = activity.getWindow();
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        window.setStatusBarColor(
                ContextCompat.getColor(activity, colorResourceId));
    }
}
