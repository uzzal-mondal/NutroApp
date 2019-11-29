package com.example.nutroapp.profileeva_social_04;

public class ProfileItemModel {

    private int profileImage;

    // create a constructor
    public ProfileItemModel(int profileImage) {
        this.profileImage = profileImage;
    }


    // then private mehtods are setter and getter
    public int getProfileImage() {
        return profileImage;
    }

    public void setProfileImage(int profileImage) {
        this.profileImage = profileImage;
    }
}
