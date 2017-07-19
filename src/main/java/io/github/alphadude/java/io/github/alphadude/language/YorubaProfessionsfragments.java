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
public class YorubaProfessionsfragments extends Fragment {


    public YorubaProfessionsfragments() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.list_cat, container, false);
        ArrayList<Words> words = new ArrayList<Words>();

        words.add(new Words("ọba","KING",R.drawable.number_one));
        words.add(new Words("olóyè/ijoyè ","chief/title holder",R.drawable.number_two));
        words.add(new Words("alágbẹjọ́rò","lawyer",R.drawable.number_three));
        words.add(new Words("olùkọ́ ","teacher",R.drawable.number_four));
        words.add(new Words("àgbẹ̀ ","farmer",R.drawable.number_five));
        words.add(new Words("oníṣòwò","trader",R.drawable.number_six));
        words.add(new Words("òǹkọ̀wé","author",R.drawable.number_seven));
        words.add(new Words("ọdẹ","hunter",R.drawable.number_eight));
        words.add(new Words("aláwàdà ","comedian",R.drawable.number_nine));
        words.add(new Words("yọyínyọyín","dentist",R.drawable.number_ten));
        words.add(new Words("akẹ́kọ̀ọ́ ","student",R.drawable.number_ten));
        words.add(new Words("onílù","drummer",R.drawable.number_ten));
        words.add(new Words("oníṣègùn ","herbalist",R.drawable.number_ten));
        words.add(new Words("ajagun","soldier",R.drawable.number_ten));
        words.add(new Words("ọlọ́pàá","police officer",R.drawable.number_ten));
        words.add(new Words("babaláwo ","diviner/healer",R.drawable.number_ten));
        words.add(new Words("akọrin","singer",R.drawable.number_ten));
        words.add(new Words("òṣèré","actor",R.drawable.number_ten));
        words.add(new Words("ọ̀jọ̀gbọ́n ","professor",R.drawable.number_ten));
        words.add(new Words("aṣòfin","law maker",R.drawable.number_ten));
        words.add(new Words("olùránṣọ","tailor/seamstress",R.drawable.number_ten));

//adapter

        WordAdapter itemsAdapter = new WordAdapter(getActivity(),words,R.color.colorAccent);

        // Get a reference to the ListView, and attach the adapter to the listView.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);
        return rootView;
    }

}
