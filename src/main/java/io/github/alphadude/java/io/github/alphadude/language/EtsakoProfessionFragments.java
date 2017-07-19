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
public class EtsakoProfessionFragments extends Fragment {


    public EtsakoProfessionFragments() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_cat, container, false);
        ArrayList<Words> words = new ArrayList<Words>();

        words.add(new Words("Oba","king",R.drawable.number_one));
        words.add(new Words("Usomine","Queen ",R.drawable.number_two));
        words.add(new Words("Oghie","Chief ",R.drawable.number_three));
        words.add(new Words("Amhoghie","Chief's wife",R.drawable.number_four));
        words.add(new Words("Enabo","Noble",R.drawable.number_five));
        words.add(new Words("Owole","Teacher",R.drawable.number_six));
        words.add(new Words("Obodano","Doctor",R.drawable.number_seven));
        words.add(new Words("Odanor","Nurse",R.drawable.number_eight));
        words.add(new Words("Odibosi","Pastor",R.drawable.number_nine));
        words.add(new Words("Kheada","Police",R.drawable.number_ten));
        words.add(new Words("Afia","Soldier",R.drawable.number_ten));
        words.add(new Words("Ogwime","Farmer",R.drawable.number_ten));
        words.add(new Words("Agiode","Hunter",R.drawable.number_ten));
        words.add(new Words("Oduaki","Trader",R.drawable.number_ten));
        words.add(new Words("Obo/Oboidane","Witchdoctor",R.drawable.number_ten));
        words.add(new Words("Adogo","Fisherman",R.drawable.number_ten));
        words.add(new Words("Okhaotha","Carpenter",R.drawable.number_ten));
        words.add(new Words("Osiesikwi","Mechanic",R.drawable.number_ten));
        words.add(new Words("Ogwoko","Driver",R.drawable.number_ten));


        WordAdapter itemsAdapter = new WordAdapter(getActivity(),words,R.color.colorPrimaryDark);

        // Get a reference to the ListView, and attach the adapter to the listView.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);
        return rootView;
    }

}
