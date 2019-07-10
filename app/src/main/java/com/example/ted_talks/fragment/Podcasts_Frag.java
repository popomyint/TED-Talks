package com.example.ted_talks.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.example.ted_talks.R;

public class Podcasts_Frag extends Fragment {
    public Podcasts_Frag(){
        // empty constructor
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View v = inflater.inflate(R.layout.discover_layout, container, false);
        return v;
    }
}
