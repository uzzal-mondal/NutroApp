package com.example.nutroapp.recipesweekly_activity_06;

public class RecipesWeeklyModels {

    private int progress;
    private String day;

    public RecipesWeeklyModels(int progress, String day) {
        this.progress = progress;
        this.day = day;
    }


    public int getProgress() {
        return progress;
    }

    public void setProgress(int progress) {
        this.progress = progress;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }
}
