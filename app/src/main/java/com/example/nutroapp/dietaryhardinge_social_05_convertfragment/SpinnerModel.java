package com.example.nutroapp.dietaryhardinge_social_05_convertfragment;

public class SpinnerModel {

    private int id;
    private String vegName;

    public SpinnerModel() {
        this.id = 0;
        this.vegName = "";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getVegName() {
        return vegName;
    }

    public void setVegName(String vegName) {
        this.vegName = vegName;
    }
}
