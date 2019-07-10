package com.example.ted_talks;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.ted_talks.child_fragment.MostViewed_Frag;
import com.example.ted_talks.child_fragment.Newest_Frag;
import com.example.ted_talks.child_fragment.Trending_Frag;
import com.example.ted_talks.fragment.Talks_Frag;

public class TabAdapter extends FragmentPagerAdapter {
    Talks_Frag myContext;
    int tid;

    public TabAdapter(FragmentManager fm, Talks_Frag talks_frag, int tabCount) {
        super(fm);
        myContext = talks_frag;
        this.tid = tabCount;

    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                Newest_Frag nFrag = new Newest_Frag();
                return nFrag;
            case 1:
                Trending_Frag tFrag = new Trending_Frag();
                return tFrag;
            case 2:
                MostViewed_Frag mvFrag = new MostViewed_Frag();
                return mvFrag;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return tid;
    }
}
