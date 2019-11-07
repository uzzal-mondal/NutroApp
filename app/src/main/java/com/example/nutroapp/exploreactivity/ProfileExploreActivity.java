package com.example.nutroapp.exploreactivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

import com.example.nutroapp.R;
import com.example.nutroapp.profilelula.ItemRecyclerAdapter;
import com.example.nutroapp.profilelula.ProfileLulaActivity;
import com.example.nutroapp.schedule.ScheduleActivity;

import java.util.ArrayList;
import java.util.List;

public class ProfileExploreActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView recyclerCountView;
    private List<ItemImageModelIcon> itemImageModelIconList;
    private Button buttonViewExplore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explore);

        // use for transparent ... #
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);

        //find a view
        recyclerView = findViewById(R.id.recycler_explore_id);
        recyclerCountView = findViewById(R.id.recycler_explore_fast_count_id);
        buttonViewExplore = findViewById(R.id.button_explore_id);


        // adapter initialize to Count.
        RecyclerViewAdapterCount adapterCount = new RecyclerViewAdapterCount(this);
        recyclerCountView.setLayoutManager( new LinearLayoutManager(this,
                LinearLayoutManager.HORIZONTAL, false));
        recyclerCountView.setAdapter(adapterCount);


        // adapter initialize to Icon
       RecyclerViewAdapterIcon adapterIcon = new RecyclerViewAdapterIcon(this,
               itemImageModelIconList);
        recyclerView.setLayoutManager(new GridLayoutManager
                (ProfileExploreActivity.this, 3));
        recyclerView.setAdapter(adapterIcon);



        // create a arrayList all view adding ...
        List<ItemImageModelIcon> list = new ArrayList<>();
        list.add(new ItemImageModelIcon(R.drawable.ic_explore_1));
        list.add(new ItemImageModelIcon(R.drawable.ic_explore_2));
        list.add(new ItemImageModelIcon(R.drawable.ic_explore_3));
        list.add(new ItemImageModelIcon(R.drawable.ic_explore_4));
        list.add(new ItemImageModelIcon(R.drawable.ic_explore_5));
        list.add(new ItemImageModelIcon(R.drawable.ic_explore_6));
        list.add(new ItemImageModelIcon(R.drawable.ic_explore_7));
        list.add(new ItemImageModelIcon(R.drawable.ic_explore_8));
        list.add(new ItemImageModelIcon(R.drawable.ic_explore_9));


        // set an recycler adapter ...
        RecyclerViewAdapterIcon adapter = new RecyclerViewAdapterIcon(this, list);
        recyclerView.setAdapter(adapter);


          // go to ProfileActivity class.
        buttonViewExplore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

               startActivity(new Intent(ProfileExploreActivity.this,
                       ProfileLulaActivity.class));
            }
        });




    }
}
