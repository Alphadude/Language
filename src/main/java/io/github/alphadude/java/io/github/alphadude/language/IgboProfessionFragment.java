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
public class IgboProfessionFragment extends Fragment {


    public IgboProfessionFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_cat, container, false);
        ArrayList<Words> words = new ArrayList<Words>();

        words.add(new Words("njinia","Engineer",R.drawable.number_two));
        words.add(new Words("dibia bekee/Dọkita","Doctor",R.drawable.number_three));
        words.add(new Words("Nnukwu ọka iwu","Judge",R.drawable.number_four));
        words.add(new Words("ọka ikpe","Lawyer",R.drawable.number_five));
        words.add(new Words("nọọsu","Nurse",R.drawable.number_six));
        words.add(new Words("kapinta","Carpenter",R.drawable.number_seven));
        words.add(new Words("ọkammuta","Professor",R.drawable.number_eight));
        words.add(new Words("Onye nkuzi","Teacher",R.drawable.number_nine));
        words.add(new Words("Onye nta akụkọ foto","Photo Journalist",R.drawable.number_ten));
        words.add(new Words("Onye ọlu ugbo","Farmer",R.drawable.number_seven));
        words.add(new Words("Onye nta akụkọ","Journalist",R.drawable.number_eight));
        words.add(new Words("Onye nese foto","Photographer",R.drawable.number_nine));
        words.add(new Words("Soja/Onye ụgu","Solider",R.drawable.number_ten));
        words.add(new Words("Onye uwe oji","Policeman",R.drawable.number_seven));
        words.add(new Words("Onye n'edezi eze","Dentist",R.drawable.number_eight));
        words.add(new Words("Onye ndọro ndọro","Politician",R.drawable.number_nine));
        words.add(new Words("Onye n'eti egwu","Musician",R.drawable.number_ten));
        words.add(new Words("Onye n'uru akpukwu","Cobbler",R.drawable.number_seven));
        words.add(new Words("Onye n'aru olụ/Ọru ulọ","Builder",R.drawable.number_eight));
        words.add(new Words("Onye n'edozi ugbọ Ala/Onye n'aru ugbọ ala","Mechanic",R.drawable.number_nine));
        words.add(new Words("Nwa akwụkwo","Student",R.drawable.number_ten));
        words.add(new Words("Onye isi","Leader/Ruler",R.drawable.number_ten));


        WordAdapter itemsAdapter = new WordAdapter(getActivity(),words,R.color.colorPrimary);

        // Get a reference to the ListView, and attach the adapter to the listView.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);
        return rootView;
    }

}
