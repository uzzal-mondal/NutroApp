package com.example.nutroapp.statsdays_activity_05;

public class DaySpinnerModel {

    private int id;
    private String statDayName;

    public DaySpinnerModel() {
        this.id = 0;
        this.statDayName = "";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStatDayName() {
        return statDayName;
    }

    public void setStatDayName(String statDayName) {
        this.statDayName = statDayName;
    }
}
