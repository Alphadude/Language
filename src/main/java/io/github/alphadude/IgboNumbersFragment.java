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
public class IgboNumbersFragment extends Fragment {


    public IgboNumbersFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_cat, container, false);
        ArrayList<Words> words = new ArrayList<Words>();

        words.add(new Words("otu", "ONE",R.drawable.number_1));
        words.add(new Words("abụọ", "TWO",R.drawable.number_2));
        words.add(new Words("atọ", "THREE",R.drawable.number_3));
        words.add(new Words("anọ", "FOUR",R.drawable.number_4));
        words.add(new Words("ise", "FIVE",R.drawable.number_5));
        words.add(new Words("isii", "SIX",R.drawable.number_6));
        words.add(new Words("asaa", "SEVEN",R.drawable.number_7));
        words.add(new Words("asato", "EIGHT",R.drawable.number_8));
        words.add(new Words("itoolu", "NINE",R.drawable.number_9));
        words.add(new Words("iri", "TEN",R.drawable.number_10));
        words.add(new Words("iri na otu", "ELEVEN",R.drawable.number_11));
        words.add(new Words("iri na abụọ", "TWELVE",R.drawable.number_12));
        words.add(new Words("iri na atọ", "THIRTEEN",R.drawable.number_13));
        words.add(new Words("iri na anọ", "FOURTEEN",R.drawable.number_14));
        words.add(new Words("iri na ise", "FIFTEEN",R.drawable.number_15));
        words.add(new Words("iri na isii", "SIXTEEN",R.drawable.number_16));
        words.add(new Words("iri na asaa", "SEVENTEEN",R.drawable.number_17));
        words.add(new Words("iri na asato", "EIGHTEEN",R.drawable.number_18));
        words.add(new Words("iri na itoolu", "NINETEEN",R.drawable.number_19));
        words.add(new Words("ogụ", "TWENTY",R.drawable.number_20));
        words.add(new Words("ogụ na otu", "TWENTY-ONE",R.drawable.number_21));
        words.add(new Words("ogụ na abụọ", "TWENTY-TWO",R.drawable.number_22));
        words.add(new Words("ogụ na atọ", "TWENTY-THREE",R.drawable.number_23));
        words.add(new Words("ogụ na anọ", "TWENTY-FOUR",R.drawable.number_24));
        words.add(new Words("ogụ na ise", "TWENTY-FIVE",R.drawable.number_25));
        words.add(new Words("ogụ na isii", "TWENTY-SIX",R.drawable.number_26));
        words.add(new Words("ogụ na asaa", "TWENTY-SEVEN",R.drawable.number_27));
        words.add(new Words("ogụ na asato", "TWENTY-EIGHT",R.drawable.number_28));
        words.add(new Words("ogụ na itoolu", "TWENTY-NINE",R.drawable.number_29));
        words.add(new Words("iri", "THIRTY",R.drawable.number_30));



        WordAdapter itemsAdapter = new WordAdapter(getActivity(), words,R.color.colorPrimary);

        // Get a reference to the ListView, and attach the adapter to the listView.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);

        return rootView;
    }

}
