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
public class HausaNumbersFragments extends Fragment {


    public HausaNumbersFragments() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.list_cat, container, false);
        ArrayList<Words> words = new ArrayList<Words>();

        words.add(new Words("Daya","ONE",R.drawable.number_1));
        words.add(new Words("Biyu","TWO",R.drawable.number_2));
        words.add(new Words("Uku","THREE",R.drawable.number_3));
        words.add(new Words("Hudu","FOUR",R.drawable.number_4));
        words.add(new Words("Biyar","FIVE",R.drawable.number_5));
        words.add(new Words("Shida","SIX",R.drawable.number_6));
        words.add(new Words("Bakwai","SEVEN",R.drawable.number_7));
        words.add(new Words("Takwas","EIGHT",R.drawable.number_8));
        words.add(new Words("Tara","NINE",R.drawable.number_9));
        words.add(new Words("Goma","TEN",R.drawable.number_10));
        words.add(new Words("Goma sha Daya", "ELEVEN",R.drawable.number_11));
        words.add(new Words("Goma sha biyu", "TWELVE",R.drawable.number_12));
        words.add(new Words("Goma sha uku", "THIRTEEN",R.drawable.number_13));
        words.add(new Words("Goma sha huɗu", "FOURTEEN",R.drawable.number_14));
        words.add(new Words("Goma sha biyar", "FIFTEEN",R.drawable.number_15));
        words.add(new Words("Goma sha shida", "SIXTEEN",R.drawable.number_16));
        words.add(new Words("Goma sha bakwai", "SEVENTEEN",R.drawable.number_17));
        words.add(new Words("Goma sha takwas", "EIGHTEEN",R.drawable.number_18));
        words.add(new Words("Goma sha tara", "NINETEEN",R.drawable.number_19));
        words.add(new Words("Ashirin", "TWENTY",R.drawable.number_20));
        words.add(new Words("Ashirin da daya", "TWENTY-ONE",R.drawable.number_21));
        words.add(new Words("Ashirin da biyu", "TWENTY-TWO",R.drawable.number_22));
        words.add(new Words("Ashirin da uku", "TWENTY-THREE",R.drawable.number_23));
        words.add(new Words("Ashirin da hudu", "TWENTY-FOUR",R.drawable.number_24));
        words.add(new Words("Ashirin da biyar", "TWENTY-FIVE",R.drawable.number_25));
        words.add(new Words("Ashirin da shida", "TWENTY-SIX",R.drawable.number_26));
        words.add(new Words("Ashirin da bakwai", "TWENTY-SEVEN",R.drawable.number_27));
        words.add(new Words("Ashirin da takwas", "TWENTY-EIGHT",R.drawable.number_28));
        words.add(new Words("Ashirin da tara", "TWENTY-NINE",R.drawable.number_29));
        words.add(new Words("Talatin", "THIRTY",R.drawable.number_30));




        WordAdapter itemsAdapter = new WordAdapter(getActivity(),words,R.color.colorPrimary);

        // Get a reference to the ListView, and attach the adapter to the listView.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);
        return rootView;
    }

}
