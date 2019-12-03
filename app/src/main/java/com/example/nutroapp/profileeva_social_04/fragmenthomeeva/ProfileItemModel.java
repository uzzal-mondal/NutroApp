package com.example.nutroapp.profileeva_social_04.fragmenthomeeva;

import com.example.nutroapp.R;

import java.util.ArrayList;
import java.util.List;

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

    public static List<ProfileItemModel> getProfileItemModellist(){

        List<ProfileItemModel> models = new ArrayList<>();
        models.add(new ProfileItemModel(R.drawable.profile_eva_olson_1));
        models.add(new ProfileItemModel(R.drawable.profile_eva_olson_2));
        models.add(new ProfileItemModel(R.drawable.profile_eva_olson_3));
        models.add(new ProfileItemModel(R.drawable.profile_eva_olson_1));
        models.add(new ProfileItemModel(R.drawable.profile_eva_olson_2));
        models.add(new ProfileItemModel(R.drawable.profile_eva_olson_3));
        models.add(new ProfileItemModel(R.drawable.profile_eva_olson_1));
        models.add(new ProfileItemModel(R.drawable.profile_eva_olson_2));
        models.add(new ProfileItemModel(R.drawable.profile_eva_olson_3));
        models.add(new ProfileItemModel(R.drawable.profile_eva_olson_1));
        models.add(new ProfileItemModel(R.drawable.profile_eva_olson_2));
        models.add(new ProfileItemModel(R.drawable.profile_eva_olson_3));
        models.add(new ProfileItemModel(R.drawable.profile_eva_olson_1));

        return models;
    }
}
