package io.github.alphadude.language;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;


public class HausaProfessionFragments extends Fragment {


    public HausaProfessionFragments() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_cat, container, false);


        ArrayList<Words> words = new ArrayList<Words>();

        words.add(new Words("Aikin Watsalaburi","News Anchor",R.drawable.number_one));
        words.add(new Words("Aikin Jarida","Journalism",R.drawable.number_two));
        words.add(new Words("Fawa","Butcher",R.drawable.number_three));
        words.add(new Words("Kasuwanci","Business Man",R.drawable.number_four));
        words.add(new Words("Mawaki","Singer",R.drawable.number_five));
        words.add(new Words("Malunta","Teacher",R.drawable.number_six));
        words.add(new Words("Likita","Doctor",R.drawable.number_seven));
        words.add(new Words("Kira","BlackSmith",R.drawable.number_eight));
        words.add(new Words("Dafa Abinci","Cook",R.drawable.number_nine));
        words.add(new Words("Dan Sanda","Police",R.drawable.number_ten));
        words.add(new Words("Marabuci","Writer",R.drawable.number_ten));
        words.add(new Words("Farauta","Hunter",R.drawable.number_ten));
        words.add(new Words("Wasan Kwaikwayo","Actor",R.drawable.number_ten));
        words.add(new Words("Sumunkiti","Fisherman",R.drawable.number_ten));
        words.add(new Words("Raino","Maid",R.drawable.number_ten));
        words.add(new Words("Siyasa","Politician",R.drawable.number_ten));
        words.add(new Words("Lauya","Lawyer",R.drawable.number_ten));



        WordAdapter itemsAdapter = new WordAdapter(getActivity(),words,R.color.colorPrimary);

        // Get a reference to the ListView, and attach the adapter to the listView.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);
        return rootView;
    }
}


