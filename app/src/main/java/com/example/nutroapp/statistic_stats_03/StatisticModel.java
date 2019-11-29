package com.example.nutroapp.statistic_stats_03;

public class StatisticModel {

    private int progress;
    private String month;


    public StatisticModel(int progress) {
        this.progress = progress;
    }

    public StatisticModel(String month) {
        this.month = month;
    }

    public StatisticModel(int progress, String month) {
        this.progress = progress;
        this.month = month;
    }

    public int getProgress() {
        return progress;
    }

    public void setProgress(int progress) {
        this.progress = progress;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }
}
