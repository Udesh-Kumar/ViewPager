package com.example.cc.pagerviewer;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class SampleFragmentAdapter extends FragmentPagerAdapter {

    public SampleFragmentAdapter(FragmentManager fm) {

        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        if (i == 0) {
            return new First_fragments();
        } else if (i == 1) {
            return new Second_fragment();

        }else if (i==2){
            return new AndroidButtonSelector();


        } else

            return new ThirdFragments();
        }

@Override
public CharSequence getPageTitle(int i){

        switch (i){
            case 0:

                return "First";

            case 1:
                return "Second";

                case 2:

                    return "ButtonSelector";

            case 3:
                return "Third";


                    default:
                        return null;

        }
}


    @Override
    public int getCount() { //no of fragments
        return 4;
    }
}
