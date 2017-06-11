package com.example.android.tourguide_saintpetersburg;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class MuseumsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.title_list);

        // create a list of places
        final ArrayList<PlaceToVisit> places = new ArrayList<PlaceToVisit>();

        // fill the list
        places.add(new PlaceToVisit(R.string.hermitage, R.string.hermitage_description, R.drawable.hermitage));
        places.add(new PlaceToVisit(R.string.russian_museum, R.string.russian_museum_description, R.drawable.russian));
        places.add(new PlaceToVisit(R.string.st_isaac, R.string.st_isaacs_description, R.drawable.isaacs));
        places.add(new PlaceToVisit(R.string.spas_na_krovi, R.string.st_isaacs_description, R.drawable.saviour_on_blood));


        // Create a Place adapter, whose data source is a list of PlaceToVisit. The
        // adapter knows how to create list items for each item in the list.
        PlaceAdapter adapter = new PlaceAdapter(this, places, R.color.colorMuseums, R.color.colorMuseums_brighter);


        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.

        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);

    }
}
