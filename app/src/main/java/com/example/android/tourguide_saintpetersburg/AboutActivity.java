package com.example.android.tourguide_saintpetersburg;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class AboutActivity extends AppCompatActivity {
    //an activity, which start the "about the city layout". Nothing is supposed to be added to te page, so it is not an item list
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about_activity);
    }
}
