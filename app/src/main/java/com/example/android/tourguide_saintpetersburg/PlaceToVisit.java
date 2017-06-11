package com.example.android.tourguide_saintpetersburg;

/**
 * Created by maria on 08.06.2017.
 * A class which describes a place to visit in a city (i.e. a restaurant, museum, some other place of interest
 */

public class PlaceToVisit {
    private int mNameResource;
    private int mDescriptionResource;
    private int mImageResource;

    //constructor, takes the name, description, image (resources)
    public PlaceToVisit(int nameResource, int descriptionResource, int imageResource) {
        mNameResource = nameResource;
        mImageResource = imageResource;
        mDescriptionResource = descriptionResource;
    }

    public int getDescriptionResource() {
        return mDescriptionResource;
    }

    public int getImageResource() {
        return mImageResource;
    }

    public int getName() {
        return mNameResource;
    }
}
