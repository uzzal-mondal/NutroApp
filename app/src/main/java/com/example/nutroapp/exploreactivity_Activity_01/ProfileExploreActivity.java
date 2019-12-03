package com.example.nutroapp.exploreactivity_Activity_01;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.content.ContextCompat;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

import com.example.nutroapp.R;
import com.example.nutroapp.exploresecondactivity_activity_02.ExploreChartActivity;
import com.example.nutroapp.profileeva_social_04.ProfileEvaActivity;
import com.example.nutroapp.recipes_activity_05.RecipesActivity;
import com.example.nutroapp.recipesweekly_activity_06.RecipesWeeklyActivity;
import com.google.android.material.navigation.NavigationView;

import java.util.ArrayList;
import java.util.List;

public class ProfileExploreActivity extends AppCompatActivity implements View.OnClickListener {

    private RecyclerView recyclerView;
    private RecyclerView recyclerCountView;
    private List<ItemImageModelIcon> itemImageModelIconList;
    private Button buttonViewExplore;

    //drawer component
    private DrawerLayout drawerLayout;
    private ActionBarDrawerToggle toggle;
    private NavigationView navigationView;
    private AppCompatImageView menuImageView;
    private AppCompatImageView searchmenu;
    private AppCompatButton buttoncontinue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setTheme(R.style.AppTheme);
        setContentView(R.layout.activity_explore);

        // Transparent action bar define ... ##
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            getWindow()
                    .getDecorView()
                    .setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
        }

        setStatusBarColor(this, R.color.white);



       /* // use for transparent ... ##
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);*/

        //find a view .. ##
        recyclerView = findViewById(R.id.recycler_explore_second_id);
        recyclerCountView = findViewById(R.id.recycler_explore_fast_count_id);
        buttonViewExplore = findViewById(R.id.button_explore_id);

        buttonViewExplore.setOnClickListener(this);

        // find id nav
        searchmenu = findViewById(R.id.searchtoolbar_id);
        searchmenu.setOnClickListener(this);
        navigationView = findViewById(R.id.navigation);
        drawerLayout = findViewById(R.id.actvity_drawer_id);

        //menu create... ##
        toggle = new ActionBarDrawerToggle(this, drawerLayout, R.string.open,
                R.string.close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        //getActionBar().setDisplayHomeAsUpEnabled(true);

        //menu image find .. ##
        menuImageView = findViewById(R.id.menubar_id);


        // menu item click listner..
        menuImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // image start to drawer.
                drawerLayout.openDrawer(GravityCompat.START);
            }
        });


        // navigation view listner
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

                int id = menuItem.getItemId();

                switch (id) {

                    case R.id.nutrition_nav_id:
                        startActivity(new Intent(ProfileExploreActivity.this,
                                ExploreChartActivity.class));
                        break;

                    case R.id.activity_nav_id:
                        startActivity(new Intent(ProfileExploreActivity.this,
                                RecipesActivity.class));
                        break;

                    case R.id.account_nav_id:
                        startActivity(new Intent(ProfileExploreActivity.this,
                                ProfileEvaActivity.class));
                        break;

                    case R.id.setting_nav_id:
                        startActivity(new Intent(ProfileExploreActivity.this,
                                RecipesWeeklyActivity.class));

                        break;

                    default:
                        return true;
                }
                drawerLayout.closeDrawers();
                return true;
            }
        });


        // adapter initialize to Count .. ##
        RecyclerViewAdapterCount adapterCount = new RecyclerViewAdapterCount(this);
        recyclerCountView.setLayoutManager(new LinearLayoutManager(this,
                LinearLayoutManager.HORIZONTAL, false));
        recyclerCountView.setAdapter(adapterCount);


        // adapter initialize to Icon .. ##
        RecyclerViewAdapterIcon adapterIcon = new RecyclerViewAdapterIcon(this,
                itemImageModelIconList);
        recyclerView.setLayoutManager(new GridLayoutManager
                (ProfileExploreActivity.this, 3));
        recyclerView.setAdapter(adapterIcon);


        // create a arrayList all view adding ... ##
        List<ItemImageModelIcon> list = new ArrayList<>();
        list.add(new ItemImageModelIcon(R.drawable.ic_explore_1));
        list.add(new ItemImageModelIcon(R.drawable.ic_explore_2));
        list.add(new ItemImageModelIcon(R.drawable.ic_explore_3));
        list.add(new ItemImageModelIcon(R.drawable.ic_explore_9));
        list.add(new ItemImageModelIcon(R.drawable.ic_explore_5));
        list.add(new ItemImageModelIcon(R.drawable.ic_explore_6));
        list.add(new ItemImageModelIcon(R.drawable.ic_explore_7));
        list.add(new ItemImageModelIcon(R.drawable.ic_explore_8));
        list.add(new ItemImageModelIcon(R.drawable.ic_explore_9));


        // set an recycler adapter ... ##
        RecyclerViewAdapterIcon adapter = new RecyclerViewAdapterIcon(this, list);
        recyclerView.setAdapter(adapter);


    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if (toggle.onOptionsItemSelected(item)) {

            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void setStatusBarColor(Activity activity, int colorResourceId) {

        Window window = activity.getWindow();
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);

        window.setStatusBarColor(
                ContextCompat.getColor(activity, colorResourceId));


    }

    @Override
    public void onClick(View view) {

        // go to another activity... ##
        if (view.getId() == R.id.button_explore_id) {
            startActivity(new Intent(ProfileExploreActivity.this,
                    ExploreChartActivity.class));

        }

        // go to search activity from menu... ##
        if (view.getId() == R.id.searchtoolbar_id) {

            /*startActivity(new Intent(ProfileExploreActivity.this,
                    DietaryHardingeActivity.class));*/
        }


    }
}
