package com.example.nutroapp.recipes_activity_05;

public class RecipesModel {

    private int headerImg;
    private int subImg;

    private String goodText;
    private int wishImg;
    private int countLikes;
    private String likeText;

    private String calText;
    private int count;
    private String timer;

    public RecipesModel(int headerImg, int subImg, String goodText,
                        int wishImg, int countLikes, String likeText, String calText,
                        int count, String timer) {
        this.headerImg = headerImg;
        this.subImg = subImg;
        this.goodText = goodText;
        this.wishImg = wishImg;
        this.countLikes = countLikes;
        this.likeText = likeText;
        this.calText = calText;
        this.count = count;
        this.timer = timer;
    }

    public int getHeaderImg() {
        return headerImg;
    }

    public void setHeaderImg(int headerImg) {
        this.headerImg = headerImg;
    }

    public int getSubImg() {
        return subImg;
    }

    public void setSubImg(int subImg) {
        this.subImg = subImg;
    }

    public String getGoodText() {
        return goodText;
    }

    public void setGoodText(String goodText) {
        this.goodText = goodText;
    }

    public int getWishImg() {
        return wishImg;
    }

    public void setWishImg(int wishImg) {
        this.wishImg = wishImg;
    }

    public int getCountLikes() {
        return countLikes;
    }

    public void setCountLikes(int countLikes) {
        this.countLikes = countLikes;
    }

    public String getLikeText() {
        return likeText;
    }

    public void setLikeText(String likeText) {
        this.likeText = likeText;
    }

    public String getCalText() {
        return calText;
    }

    public void setCalText(String calText) {
        this.calText = calText;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getTimer() {
        return timer;
    }

    public void setTimer(String timer) {
        this.timer = timer;
    }
}
