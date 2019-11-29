package com.example.nutroapp.exploresecondactivity_activity_02;

public class StrokeTimeModel {

    private String timeshows;
    private int strokeImage;

    public StrokeTimeModel(String timeshows, int strokeImage) {
        this.timeshows = timeshows;
        this.strokeImage = strokeImage;
    }

    public String getTimeshows() {
        return timeshows;
    }

    public void setTimeshows(String timeshows) {
        this.timeshows = timeshows;
    }

    public int getStrokeImage() {
        return strokeImage;
    }

    public void setStrokeImage(int strokeImage) {
        this.strokeImage = strokeImage;
    }
}
