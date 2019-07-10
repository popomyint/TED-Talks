package com.example.ted_talks;

import android.content.Context;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.ted_talks.fragment.Discover_Frag;
import com.example.ted_talks.fragment.MyTed_Frag;
import com.example.ted_talks.fragment.Podcasts_Frag;

public class MyAdapter extends FragmentPagerAdapter {
    Context myContext;
    int id;

    public MyAdapter(FragmentManager fm, Context context, int id) {
        super(fm);
        myContext = context;
        this.id = id;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                Discover_Frag tFrag = new Discover_Frag();
                return tFrag;
            case 1:
                Discover_Frag dFrag = new Discover_Frag();
                return dFrag;
            case 2:
                Podcasts_Frag pFrag = new Podcasts_Frag();
                return pFrag;
            case 3:
                MyTed_Frag mFrag = new MyTed_Frag();
                return mFrag;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return id;
    }
}
