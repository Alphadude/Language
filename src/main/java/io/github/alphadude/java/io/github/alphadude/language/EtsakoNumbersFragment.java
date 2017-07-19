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
public class EtsakoNumbersFragment extends Fragment {


    public EtsakoNumbersFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_cat, container, false);

        ArrayList<Words> words = new ArrayList<Words>();

        words.add(new Words("OKPA", "ONE",R.drawable.number_1));
        words.add(new Words("EVA", "TWO",R.drawable.number_2));
        words.add(new Words("ELA", "THREE",R.drawable.number_3));
        words.add(new Words("EJE", "FOUR",R.drawable.number_4));
        words.add(new Words("ISE", "FIVE",R.drawable.number_5));
        words.add(new Words("ESA", "SIX",R.drawable.number_6));
        words.add(new Words("SEVHA", "SEVEN",R.drawable.number_7));
        words.add(new Words("ELEI", "EIGHT",R.drawable.number_8));
        words.add(new Words("ITHI", "NINE",R.drawable.number_9));
        words.add(new Words("IGBE", "TEN",R.drawable.number_10));
        words.add(new Words("GBELO", "ELEVEN",R.drawable.number_11));
        words.add(new Words("GBEGEVA", "TWELVE",R.drawable.number_12));
        words.add(new Words("GBEGELA", "THIRTEEN",R.drawable.number_13));
        words.add(new Words("GBEGEJE", "FOURTEEN",R.drawable.number_14));
        words.add(new Words("GBEGISE", "FIFTEEN",R.drawable.number_15));
        words.add(new Words("GBEGESA", "SIXTEEN",R.drawable.number_16));
        words.add(new Words("GBEGISEVHA", "SEVENTEEN",R.drawable.number_17));
        words.add(new Words("GBEGELEI", "EIGHTEEN",R.drawable.number_18));
        words.add(new Words("GBEGITHI", "NINETEEN",R.drawable.number_19));
        words.add(new Words("GBEEVA", "TWENTY",R.drawable.number_20));
        words.add(new Words("GBEEVA OKPA", "TWENTY-ONE",R.drawable.number_21));
        words.add(new Words("GBEEVA EVA", "TWENTY-TWO",R.drawable.number_22));
        words.add(new Words("GBEEVA ELA", "TWENTY-THREE",R.drawable.number_23));
        words.add(new Words("GBEEVA EJE", "TWENTY-FOUR",R.drawable.number_24));
        words.add(new Words("GBEEVA ISE", "TWENTY-FIVE",R.drawable.number_25));
        words.add(new Words("GBEEVA ESA", "TWENTY-SIX",R.drawable.number_26));
        words.add(new Words("GBEEVA SEVHA", "TWENTY-SEVEN",R.drawable.number_27));
        words.add(new Words("GBEEVA ELEI", "TWENTY-EIGHT",R.drawable.number_28));
        words.add(new Words("GBEEVA ITHI", "TWENTY-NINE",R.drawable.number_29));
        words.add(new Words("GBEELA", "THIRTY",R.drawable.number_30));



        WordAdapter itemsAdapter = new WordAdapter(getActivity(), words,R.color.colorPrimaryDark);

        // Get a reference to the ListView, and attach the adapter to the listView.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);

        return rootView;
    }

}
