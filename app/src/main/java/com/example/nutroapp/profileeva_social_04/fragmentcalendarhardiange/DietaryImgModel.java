package com.example.nutroapp.profileeva_social_04.fragmentcalendarhardiange;

import com.example.nutroapp.R;

import java.util.ArrayList;
import java.util.List;

public class DietaryImgModel {

    private int image;

    public DietaryImgModel(int image) {
        this.image = image;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }



    public static List<DietaryImgModel> getDietaryImgModelList(){

        List<DietaryImgModel> list = new ArrayList<>();
        list.add(new DietaryImgModel(R.drawable.profile_eva_olson_1));
        list.add(new DietaryImgModel(R.drawable.profile_eva_olson_2));
        list.add(new DietaryImgModel(R.drawable.profile_eva_ollson_3));
        list.add(new DietaryImgModel(R.drawable.profile_eva_olson_2));
        list.add(new DietaryImgModel(R.drawable.profile_eva_olson_1));
        list.add(new DietaryImgModel(R.drawable.profile_eva_ollson_3));
        list.add(new DietaryImgModel(R.drawable.profile_eva_olson_2));
        list.add(new DietaryImgModel(R.drawable.profile_eva_olson_1));
        list.add(new DietaryImgModel(R.drawable.profile_eva_ollson_3));

        return list;
    }

}
