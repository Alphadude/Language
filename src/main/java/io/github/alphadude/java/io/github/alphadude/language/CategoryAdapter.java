package io.github.alphadude.language;

/**
 * Created by alphadude on 7/14/17.
 */
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class CategoryAdapter extends FragmentPagerAdapter {
//THIS IS WHERE THE YORUBA ADAPTER WAS MADE here
    public CategoryAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new YorubaNumberFragment();
        } else if (position == 1) {
            return new YorubaColorsFragment();
        } else {
            return new YorubaProfessionsfragments();
        }
    }

    @Override
    public int getCount() {
        return 3;
    }


}
