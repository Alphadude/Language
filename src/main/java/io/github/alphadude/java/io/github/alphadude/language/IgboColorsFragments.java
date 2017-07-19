package io.github.alphadude.language;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class IgboColorsFragments extends Fragment {


    public IgboColorsFragments() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_cat, container, false);
        ArrayList<Words> words = new ArrayList<Words>();

        words.add(new Words("UHIE", "RED",R.drawable.color_red));
        words.add(new Words("OROMA/UHIEDO", "ORANGE",R.drawable.color_dusty_yellow));
        words.add(new Words("EDO", "YELLOW",R.drawable.color_mustard_yellow));
        words.add(new Words("NDU NDU", "GREEN",R.drawable.color_green));
        words.add(new Words("ANUNU", "BLUE",R.drawable.color_white));
        words.add(new Words("UGO", "PURPLE",R.drawable.color_green));
        words.add(new Words("UHIE OCHA", "PINK",R.drawable.color_dusty_yellow));
        words.add(new Words("URI", "BROWN",R.drawable.color_brown));
        words.add(new Words("OJI", "BLACK",R.drawable.color_black));
        words.add(new Words("UCHA NZU", "GREY",R.drawable.color_gray));
        words.add(new Words("OCHA", "WHITE",R.drawable.color_white));
        words.add(new Words("OLAEDO", "GOLD",R.drawable.color_mustard_yellow));
        words.add(new Words("OLAOCHA", "SILVER",R.drawable.color_gray));



        WordAdapter itemsAdapter = new WordAdapter(getActivity(), words,R.color.colorPrimary);

        // Get a reference to the ListView, and attach the adapter to the listView.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);
        return rootView;
    }

}
