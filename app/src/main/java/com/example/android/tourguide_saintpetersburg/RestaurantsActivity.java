package com.example.android.tourguide_saintpetersburg;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class RestaurantsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.title_list);

        // create a list of places
        final ArrayList<PlaceToVisit> restaurants = new ArrayList<PlaceToVisit>();

        // fill the list
        restaurants.add(new PlaceToVisit(R.string.restaurant_1, R.string.restaurant_1_description, R.drawable.restaurant_1));
        restaurants.add(new PlaceToVisit(R.string.restaurant_2, R.string.restaurant_2_description, R.drawable.restaurant_2));
        restaurants.add(new PlaceToVisit(R.string.restaurant_3, R.string.restaurant_3_description, R.drawable.restaurant_three));

        // Create a Place adapter, whose data source is a list of PlaceToVisit. The
        // adapter knows how to create list items for each item in the list.
        PlaceAdapter adapter = new PlaceAdapter(this, restaurants, R.color.colorRestaurants, R.color.colorRestaurants_brighter);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.

        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);
    }
}
