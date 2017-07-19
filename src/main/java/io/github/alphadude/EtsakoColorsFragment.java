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
public class EtsakoColorsFragment extends Fragment {


    public EtsakoColorsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.list_cat, container, false);

        ArrayList<Words> words = new ArrayList<Words>();

        words.add(new Words("FO", "WHITE",R.drawable.color_white));
        words.add(new Words("BIE", "BLACK",R.drawable.color_black));
        words.add(new Words("VHE", "RED",R.drawable.color_red));
        words.add(new Words("RHUE", "YELLOW",R.drawable.color_mustard_yellow));
        words.add(new Words("EZIDE", "PINK",R.drawable.color_dusty_yellow));
        words.add(new Words("BUU", "BLUE",R.drawable.color_gray));
        words.add(new Words("ABE", "GREEN",R.drawable.color_green));
        words.add(new Words("VHISI", "BROWN",R.drawable.color_brown));



        WordAdapter itemsAdapter = new WordAdapter(getActivity(), words,R.color.colorPrimaryDark);

        // Get a reference to the ListView, and attach the adapter to the listView.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);
        return rootView;
    }

}
