package com.example.nutroapp.statsdays_activity_05;

public class SpinnerStatsModel {

    private int id;
    private String statsmonthName;

    public SpinnerStatsModel() {
        this.id = 0;
        this.statsmonthName = "";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStatsmonthName() {
        return statsmonthName;
    }

    public void setStatsmonthName(String statsmonthName) {
        this.statsmonthName = statsmonthName;
    }
}
