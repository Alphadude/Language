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
public class YorubaNumberFragment extends Fragment {


    public YorubaNumberFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_cat, container, false);
        ArrayList<Words> words = new ArrayList<Words>();

        words.add(new Words("ọ̀kan", "ONE", R.drawable.number_1));
        words.add(new Words("èjì", "TWO", R.drawable.number_2));
        words.add(new Words("ẹ̀ta", "THREE", R.drawable.number_3));
        words.add(new Words("ẹ̀rin", "FOUR", R.drawable.number_4));
        words.add(new Words("àrún", "FIVE", R.drawable.number_5));
        words.add(new Words("ẹ̀fà", "SIX", R.drawable.number_6));
        words.add(new Words("èje", "SEVEN", R.drawable.number_7));
        words.add(new Words("ẹ̀jọ", "EIGHT", R.drawable.number_8));
        words.add(new Words("ẹ̀sán", "NINE", R.drawable.number_9));
        words.add(new Words("ẹ̀wá", "TEN", R.drawable.number_10));
        words.add(new Words("mokanla", "ELEVEN",R.drawable.number_11));
        words.add(new Words("mejila", "TWELVE",R.drawable.number_12));
        words.add(new Words("metala", "THIRTEEN",R.drawable.number_13));
        words.add(new Words("merinla", "FOURTEEN",R.drawable.number_14));
        words.add(new Words("medogun", "FIFTEEN",R.drawable.number_15));
        words.add(new Words("merindilogun", "SIXTEEN",R.drawable.number_16));
        words.add(new Words("metadilogun", "SEVENTEEN",R.drawable.number_17));
        words.add(new Words("mejidilogun", "EIGHTEEN",R.drawable.number_18));
        words.add(new Words("mokandilogun", "NINETEEN",R.drawable.number_19));
        words.add(new Words("ogun", "TWENTY",R.drawable.number_20));
        words.add(new Words("mokanlelogun", "TWENTY-ONE",R.drawable.number_21));
        words.add(new Words("mejilelogun", "TWENTY-TWO",R.drawable.number_22));
        words.add(new Words("metalelogun", "TWENTY-THREE",R.drawable.number_23));
        words.add(new Words("merinlelogun", "TWENTY-FOUR",R.drawable.number_24));
        words.add(new Words("medogbon", "TWENTY-FIVE",R.drawable.number_25));
        words.add(new Words("merindilogbon", "TWENTY-SIX",R.drawable.number_26));
        words.add(new Words("metadilogbon", "TWENTY-SEVEN",R.drawable.number_27));
        words.add(new Words("mejidilogbon", "TWENTY-EIGHT",R.drawable.number_28));
        words.add(new Words("mokandilogbon", "TWENTY-NINE",R.drawable.number_29));
        words.add(new Words("ogbon", "THIRTY",R.drawable.number_30));

//adapter
        WordAdapter itemsAdapter = new WordAdapter(getActivity(), words, R.color.colorAccent);

        // Get a reference to the ListView, and attach the adapter to the listView.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);

        return rootView;
    }

}