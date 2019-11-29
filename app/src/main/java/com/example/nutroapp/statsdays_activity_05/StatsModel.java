package com.example.nutroapp.statsdays_activity_05;

public class StatsModel {

    private int vSlide;
    private int countDayNum;

    public StatsModel(int vSlide, int countDayNum) {
        this.vSlide = vSlide;
        this.countDayNum = countDayNum;
    }

    public int getvSlide() {
        return vSlide;
    }

    public void setvSlide(int vSlide) {
        this.vSlide = vSlide;
    }

    public int getCountDayNum() {
        return countDayNum;
    }

    public void setCountDayNum(int countDayNum) {
        this.countDayNum = countDayNum;
    }
}