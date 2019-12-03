package com.example.nutroapp.profileeva_social_04.fragmentcalendarhardiange;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.Spinner;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.nutroapp.R;
import com.example.nutroapp.profileeva_social_04.fragmentcalendarhardiange.DietaryImgModel;
import com.example.nutroapp.profileeva_social_04.fragmentcalendarhardiange.DietaryRecyclerAdapter;
import com.example.nutroapp.profileeva_social_04.fragmentcalendarhardiange.DietarySpinnerAdapter;
import com.example.nutroapp.profileeva_social_04.fragmentcalendarhardiange.DietarySpinnerModel;

import java.util.List;

public class FragmentCalendarHardiange extends Fragment {


    private RecyclerView dietaryRecyclerView;
    private List<DietaryImgModel>  imgModelList;
    private AppCompatTextView textView;
    private AppCompatImageView backImage;

    private Spinner spinner;
    DietarySpinnerAdapter spinnerAdapter;
    private DietaryRecyclerAdapter dietaryRecyclerAdapter;
    private Context context;

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        this.context = context;

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_calendar_pro,container,false);


    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        dietaryRecyclerView = view.findViewById(R.id.recycler);
        textView = view.findViewById(R.id.hardinagetext);
        spinner = view.findViewById(R.id.spinner_id);

        //menu find id ..##
        backImage = view.findViewById(R.id.imagebackcreate_id);
       /* backImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               // onBackPressed();
            }
        });*/

        // go to another acitivity... ##
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        dietaryRecyclerAdapter = new
                DietaryRecyclerAdapter(context,DietaryImgModel.getDietaryImgModelList());

        dietaryRecyclerView.setLayoutManager(new GridLayoutManager(context,3));
        dietaryRecyclerView.setAdapter(dietaryRecyclerAdapter);



        // spinner adapter..
        // spinner details design in android..
        DietarySpinnerModel[] models = new DietarySpinnerModel[6];

        models[0] = new DietarySpinnerModel();
        models[0].setId(1);
        models[0].setVegName("Vegetarian");

        models[1] = new DietarySpinnerModel();
        models[1].setId(2);
        models[1].setVegName("Vegetarian");

        models[2] = new DietarySpinnerModel();
        models[2].setId(3);
        models[2].setVegName("Vegetarian");

        models[3] = new DietarySpinnerModel();
        models[3].setId(4);
        models[3].setVegName("Vegetarian");

        models[4] = new DietarySpinnerModel();
        models[4].setId(5);
        models[4].setVegName("Vegetarian");

        models[5] = new DietarySpinnerModel();
        models[5].setId(6);
        models[5].setVegName("Vegetarian");

        //set a spinner adapter ... ##
        /*spinnerAdapter = new SpinnerAdapter(DietaryHardingeActivity.this,
                R.layout.support_simple_spinner_dropdown_item,models);*/

        spinnerAdapter = new DietarySpinnerAdapter(context,
                R.layout.support_simple_spinner_dropdown_item,models);
       spinner.setAdapter(spinnerAdapter);

        //spinner set to listner ... ##
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView,
                                       View view, int position, long l) {

                DietarySpinnerModel spinnerModel = spinnerAdapter.getItem(position);
               /* Toast.makeText(ScheduleActivity.this,
                        "Id: " + monthModel.getId() + " \nname: " +
                        monthModel.getMonthName(), Toast.LENGTH_SHORT).show();*/
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {


            }
        });

    }
    // set status bar color ...
    public void setStatusBarColor(Activity activity, int colorResourceId){

        Window window = activity.getWindow();
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);

        window.setStatusBarColor(
                ContextCompat.getColor(activity,colorResourceId));


    }


}
