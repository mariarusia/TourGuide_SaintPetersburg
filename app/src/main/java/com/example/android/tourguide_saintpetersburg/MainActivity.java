/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.tourguide_saintpetersburg;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // Find the View that shows the about category
        TextView about = (TextView) findViewById(R.id.about);

        // Set a click listener on that View
        about.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent aboutIntent = new Intent(MainActivity.this, AboutActivity.class);
                startActivity(aboutIntent);
            }
        });

        //find places view
        TextView places = (TextView) findViewById(R.id.places);

        // Set a click listener on that View
        places.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the colors View is clicked on.
            @Override
            public void onClick(View view) {
                Intent placesIntent = new Intent(MainActivity.this, PlacesActivity.class);
                startActivity(placesIntent);
            }
        });

        //find museums view
        TextView museums = (TextView) findViewById(R.id.museums);

        // Set a click listener on that View
        museums.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent museumsIntent = new Intent(MainActivity.this, MuseumsActivity.class);
                startActivity(museumsIntent);
            }
        });

        //find restaurants View
        TextView restaurants = (TextView) findViewById(R.id.bars);

        // Set a click listener on that View
        restaurants.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent restaurantsIntent = new Intent(MainActivity.this, RestaurantsActivity.class);
                startActivity(restaurantsIntent);
            }
        });

        //find restaurants View
        TextView hotels = (TextView) findViewById(R.id.hotels);

        // Set a click listener on that View
        hotels.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent hotelsIntent = new Intent(MainActivity.this, HotelActivity.class);
                startActivity(hotelsIntent);
            }
        });
    }
}
