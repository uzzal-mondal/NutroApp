package com.example.nutroapp.profileeva_social_04.fragmenttodaywish;

import com.example.nutroapp.R;

import java.util.ArrayList;
import java.util.List;

public class TodayWishModel {

    private int mainImg;
    private String timeTv;

    public TodayWishModel(int mainImg, String timeTv) {
        this.mainImg = mainImg;
        this.timeTv = timeTv;
    }

    public int getMainImg() {
        return mainImg;
    }

    public void setMainImg(int mainImg) {
        this.mainImg = mainImg;
    }

    public String getTimeTv() {
        return timeTv;
    }

    public void setTimeTv(String timeTv) {
        this.timeTv = timeTv;
    }


    public static List<TodayWishModel> getTodayModelList(){

        List<TodayWishModel> modelList = new ArrayList<>();
        modelList.add(new TodayWishModel(R.drawable.item_recipes_long_1,
                "10 min"));

        modelList.add(new TodayWishModel(R.drawable.item_recipes_long_3,
                "30 min"));

        modelList.add(new TodayWishModel(R.drawable.item_recipes_long_4,
                "40 min"));

        modelList.add(new TodayWishModel(R.drawable.item_recipes_long_3,
                "30 min"));

        return modelList;
    }
}
