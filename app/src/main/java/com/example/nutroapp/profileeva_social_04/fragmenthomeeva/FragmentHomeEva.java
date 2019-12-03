package com.example.nutroapp.profileeva_social_04.fragmenthomeeva;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import com.example.nutroapp.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.tbuonomo.viewpagerdotsindicator.DotsIndicator;

public class FragmentHomeEva extends Fragment {

    private Context context;
    private RecyclerView recyclerView;
    private ProfileRecyclerAdapter recyclerAdapter;


    private AppCompatTextView textViewEvaOlson;
    private ViewPager viewPager;
    private DotsIndicator indicator;

    private BottomNavigationView bottomNavigationView;
    private AppCompatImageView backtoomenuimage;
    private ActionBar toolbar;



    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        this.context = context;

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        //inflate the layout for this fragment.. ##
        return inflater.inflate(R.layout.fragment_home_pro,container,false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        recyclerView = view.findViewById(R.id.recyclerView_pro_eva_id);

        // this is for find all view ...##
        textViewEvaOlson = view.findViewById(R.id.text_main_eva_olson_id);
        viewPager = view.findViewById(R.id.viewPagerRecent_id);
        indicator =view.findViewById(R.id.inidicator_recent_id);
        backtoomenuimage = view.findViewById(R.id.menuback_id);
       /* backtoomenuimage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // back button listner..##
            }
        });*/

        recyclerAdapter = new ProfileRecyclerAdapter(context, ProfileItemModel.getProfileItemModellist());
        //recycler, view type
        recyclerView.setLayoutManager(new LinearLayoutManager
                (context,RecyclerView.HORIZONTAL,false));
        recyclerView.setAdapter(recyclerAdapter);







    }
}
