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
public class HausaColorsFragments extends Fragment {


    public HausaColorsFragments() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_cat, container, false);
        ArrayList<Words> words = new ArrayList<Words>();

        words.add(new Words("bak'i", "BLACK",R.drawable.color_black));
        words.add(new Words("fari", "WHITE",R.drawable.color_white));
        words.add(new Words("ja", "RED",R.drawable.color_red));
        words.add(new Words("ja-ja", "PINK",R.drawable.color_dusty_yellow));
        words.add(new Words("kore", "GREEN",R.drawable.color_green));
        words.add(new Words("launin jar garura", "PURPLE",R.drawable.color_mustard_yellow));
        words.add(new Words("mai ruwan k'asa", "BROWN",R.drawable.color_brown));
        words.add(new Words("mai ruwan lemo", "ORANGE",R.drawable.color_dusty_yellow));
        words.add(new Words("mai ruwan toka-toka", "GREY",R.drawable.color_gray));
        words.add(new Words("rawaye", "YELLOW",R.drawable.color_mustard_yellow));
        words.add(new Words("shud'i", "BLUE",R.drawable.color_white));



        WordAdapter itemsAdapter = new WordAdapter(getActivity(), words,R.color.colorPrimary);

        // Get a reference to the ListView, and attach the adapter to the listView.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);
        return rootView;
    }

}
