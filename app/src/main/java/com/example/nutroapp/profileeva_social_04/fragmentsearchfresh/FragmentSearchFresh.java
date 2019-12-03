package com.example.nutroapp.profileeva_social_04.fragmentsearchfresh;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.nutroapp.R;

import com.example.nutroapp.helper.OverlapDecoration;

import java.util.ArrayList;
import java.util.List;

public class FragmentSearchFresh extends Fragment {

    ImageView imageView;
    RecyclerView recyclerfresh;
    List<FreshSearchModel> freshModelList;
    AppCompatImageView backImage;



    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_search_pro,container,false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        // find id ... ##
        imageView = view.findViewById(R.id.waterImage);
        recyclerfresh = view.findViewById(R.id.recyclerfresh_id);
        backImage = view.findViewById(R.id.imagebackcreate_id);

        /*backImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               // onBackPressed();
            }
        });

        // image view onClickListner ... ##
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               *//* startActivity(new Intent(FreshForseActivity.this,
                        StatasActivity.class));*//*
            }
        });*/



        List<FreshSearchModel> modelList = new ArrayList<>();
        modelList.add(new FreshSearchModel(R.drawable.profile_eva_olson_1));
        modelList.add(new FreshSearchModel(R.drawable.profile_eva_olson_2));
        modelList.add(new FreshSearchModel(R.drawable.profile_eva_ollson_3));
        FreshSearchRecyclerAdapter adapter = new FreshSearchRecyclerAdapter(getContext());
        recyclerfresh.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerfresh.setAdapter(adapter);
        recyclerfresh.addItemDecoration(new OverlapDecoration());

    }
    //set status bar color.. ##
    public void setStatusBarColor(Activity activity, int colorResourceId){
        Window window = activity.getWindow();
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        window.setStatusBarColor(
                ContextCompat.getColor(activity,colorResourceId));
    }
}
