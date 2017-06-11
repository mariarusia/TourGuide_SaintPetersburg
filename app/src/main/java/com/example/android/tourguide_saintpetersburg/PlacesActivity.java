package com.example.android.tourguide_saintpetersburg;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PlacesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.title_list);

        final ArrayList<PlaceToVisit> places = new ArrayList<PlaceToVisit>();

        // fill the list
        places.add(new PlaceToVisit(R.string.palace_square, R.string.palace_square_description, R.drawable.palace_square_1));
        places.add(new PlaceToVisit(R.string.peterhof, R.string.peterhof_description, R.drawable.peterhof_1));
        places.add(new PlaceToVisit(R.string.fortress, R.string.fortress_descripton, R.drawable.fortress_1));
        places.add(new PlaceToVisit(R.string.palace_bridge, R.string.palace_bridge_description, R.drawable.palace_bridge_1));


        // Create a Place adapter, whose data source is a list of PlaceToVisit. The
        // adapter knows how to create list items for each item in the list.
        PlaceAdapter adapter = new PlaceAdapter(this, places, R.color.colorPlaces, R.color.colorPlaces_brighter);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.

        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);
    }
}
