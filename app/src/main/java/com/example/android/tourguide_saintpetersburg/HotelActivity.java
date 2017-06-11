package com.example.android.tourguide_saintpetersburg;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class HotelActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.title_list);

        final ArrayList<PlaceToVisit> hotels = new ArrayList<PlaceToVisit>();

        // fill the list
        hotels.add(new PlaceToVisit(R.string.hotel_1, R.string.hotel_1_address, R.drawable.hotel_1));
        hotels.add(new PlaceToVisit(R.string.hotel_2, R.string.hotel_2_description, R.drawable.hotel_2));

        // Create a Place adapter, whose data source is a list of PlaceToVisit. The
        // adapter knows how to create list items for each item in the list.
        PlaceAdapter adapter = new PlaceAdapter(this, hotels, R.color.hotelColor, R.color.hotelColor_brighter);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.

        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);
    }
}
