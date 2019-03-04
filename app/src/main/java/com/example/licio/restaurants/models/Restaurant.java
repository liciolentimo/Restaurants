package com.example.licio.restaurants.models;

import java.util.ArrayList;
import org.parceler.Parcel;

@Parcel
public class Restaurant {
    private String mName;
    private String mPhone;
    private String mWebsite;
    private double mRating;
    private String mImageUrl;
    private ArrayList<String> mAddress = new ArrayList<>();
    private double mLatitude;
    private double mLongitude;
    private ArrayList<String> mCategories = new ArrayList<>();

    public Restaurant() {}

    public Restaurant(String name, String phone, String website,
                      double rating, String imageUrl, ArrayList<String> address,
                      double latitude, double longitude, ArrayList<String> categories){

        this.mName = name;
        this.mPhone = phone;
        this.mWebsite = website;
        this.mRating = rating;
        this.mImageUrl = imageUrl;
        this.mAddress = address;
        this.mLatitude = latitude;
        this.mLongitude = longitude;
        this.mCategories = categories;

//        mImageUrl = getLargeImageUrl(imageUrl);

    }

//    public String getLargeImageUrl(String imageUrl) {
//        String largeImageUrl = imageUrl.substring(0, imageUrl.length() - 6).concat("o.jpg");
//        return largeImageUrl;
//    }

    public String getName() {
        return mName;
    }

    public String getPhone() {
        return mPhone;
    }

    public String getWebsite() {
        return mWebsite;
    }

    public double getRating() {
        return mRating;
    }

    public String getImageUrl() {
        return mImageUrl;
    }

    public ArrayList<String> getAddress() {
        return mAddress;
    }

    public double getLatitude() {
        return mLatitude;
    }

    public double getmLongitude() {
        return mLongitude;
    }

    public ArrayList<String> getCategories() {
        return mCategories;
    }


}