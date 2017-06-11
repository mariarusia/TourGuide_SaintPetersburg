package com.example.android.tourguide_saintpetersburg;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by maria on 08.06.2017.
 */

public class PlaceAdapter extends ArrayAdapter<PlaceToVisit> {

    //two colors to distinguish between elements of a list
    private int mColorResource;
    private int mColorResourceSecond;

    public PlaceAdapter(Activity context, ArrayList<PlaceToVisit> places, int colorResource, int colorResourceSecond) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.

        super(context, 0, places);
        mColorResource = colorResource;
        mColorResourceSecond = colorResourceSecond;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        LinearLayout linearLayout = (LinearLayout) listItemView.findViewById(R.id.layout);

        //the odd and even elements of a list should have a different color
        if (position % 2 == 0) {
            linearLayout.setBackgroundResource(mColorResource);
        } else {
            linearLayout.setBackgroundResource(mColorResourceSecond);
        }

        // Get the PlaceToVisit object located at this position in the list
        PlaceToVisit currentPlace = getItem(position);

        TextView textView = (TextView) listItemView.findViewById(R.id.place);
        textView.setText(currentPlace.getName());

        TextView descriptionView = (TextView) listItemView.findViewById(R.id.description);
        descriptionView.setText(currentPlace.getDescriptionResource());

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
        imageView.setImageResource(currentPlace.getImageResource());
        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }
}
