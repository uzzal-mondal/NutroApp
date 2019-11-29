package com.example.nutroapp.statsoverview_stats_04;

public class OverviewModel {

    private int progressRecp;
    private String dayRecp;

    public OverviewModel(int progressRecp) {
        this.progressRecp = progressRecp;

    }

    public OverviewModel(String dayRecp) {
        this.dayRecp = dayRecp;
    }

    public OverviewModel(int progressRecp, String dayRecp) {
        this.progressRecp = progressRecp;
        this.dayRecp = dayRecp;
    }

    public int getProgressRecp() {
        return progressRecp;
    }

    public void setProgressRecp(int progressRecp) {
        this.progressRecp = progressRecp;
    }

    public String getDayRecp() {
        return dayRecp;
    }

    public void setDayRecp(String dayRecp) {
        this.dayRecp = dayRecp;
    }
}
