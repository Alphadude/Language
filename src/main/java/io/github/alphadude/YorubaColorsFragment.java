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
public class YorubaColorsFragment extends Fragment {


    public YorubaColorsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_cat, container, false);
        ArrayList<Words> words = new ArrayList<Words>();

        words.add(new Words("dúdu", "Black/dark",R.drawable.color_black));
        words.add(new Words("àwö sánmà", "BLUE",R.drawable.color_white));
        words.add(new Words("àwö ara", "BROWN",R.drawable.color_brown));
        words.add(new Words("àwö ewéko / aligà", "GREEN",R.drawable.color_green));
        words.add(new Words("àwö eléérú", "GREY",R.drawable.color_gray));
        words.add(new Words("PUPA", "RED",R.drawable.color_red));
        words.add(new Words("funfun", "WHITE",R.drawable.color_white));
        words.add(new Words("ìyèyè", "YELLOW",R.drawable.color_mustard_yellow));
        words.add(new Words("wúrà", "GOLD",R.drawable.color_dusty_yellow));
        words.add(new Words("fàdákà", "SILVER",R.drawable.color_gray));
        words.add(new Words("àwö elésè àlùkò", "PURPLE",R.drawable.color_white));
        words.add(new Words("pupa fêêrê", "PINK",R.drawable.color_dusty_yellow));



        WordAdapter itemsAdapter = new WordAdapter(getActivity(), words,R.color.colorAccent);

        // Get a reference to the ListView, and attach the adapter to the listView.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);
        return rootView;
    }

}
