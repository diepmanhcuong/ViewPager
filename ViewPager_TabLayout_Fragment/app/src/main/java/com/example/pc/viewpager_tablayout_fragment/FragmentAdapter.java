package com.example.pc.viewpager_tablayout_fragment;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class FragmentAdapter extends FragmentPagerAdapter {
    String[] title = {"FragmentA","FragmentB","FragmentC","FragmentD"};
    public FragmentAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;
        switch (position){
            case 0: fragment = new FragmentA();
            break;
            case 1: fragment = new FragmentB();
                break;
            case 2: fragment = new FragmentC();
                break;
            case 3: fragment = new FragmentD();
                break;
        }
        return fragment;
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {

        return title[position];
    }
}
