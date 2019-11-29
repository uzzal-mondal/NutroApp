package com.example.nutroapp.schedule_activity_03;

public class MonthModel {

    private int id;
    private String monthName;

    public MonthModel() {
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
