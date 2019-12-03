package com.example.nutroapp.profileeva_social_04.fragmenttodaywish;

import com.example.nutroapp.R;

import java.util.ArrayList;
import java.util.List;

public class SecondTodayWishModel {

    private int image;

    public SecondTodayWishModel(int image) {
        this.image = image;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }


    public static List<SecondTodayWishModel> getsecondtodaymodel(){


        List<SecondTodayWishModel> list = new ArrayList<>();
        list.add(new SecondTodayWishModel(R.drawable.profile_eva_olson_1));
        list.add(new SecondTodayWishModel(R.drawable.profile_eva_olson_2));
        list.add(new SecondTodayWishModel(R.drawable.profile_eva_olson_3));
        list.add(new SecondTodayWishModel(R.drawable.profile_eva_olson_1));
        list.add(new SecondTodayWishModel(R.drawable.profile_eva_olson_2));
        list.add(new SecondTodayWishModel(R.drawable.profile_eva_olson_3));
        list.add(new SecondTodayWishModel(R.drawable.profile_eva_olson_1));
        list.add(new SecondTodayWishModel(R.drawable.profile_eva_olson_2));
        list.add(new SecondTodayWishModel(R.drawable.profile_eva_olson_3));

        return list;

    }
}
