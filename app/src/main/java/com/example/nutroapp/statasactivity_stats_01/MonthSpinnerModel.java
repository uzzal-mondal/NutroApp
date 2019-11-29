package com.example.nutroapp.statasactivity_stats_01;

public class MonthSpinnerModel {

    private int id;
    private String monthName;

    public MonthSpinnerModel() {
        this.id = 0;
        this.monthName = "";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMonthName() {
        return monthName;
    }

    public void setMonthName(String monthName) {
        this.monthName = monthName;
    }
}
