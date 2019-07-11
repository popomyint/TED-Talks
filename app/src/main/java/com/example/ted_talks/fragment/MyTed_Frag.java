package com.example.ted_talks.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.example.ted_talks.R;

public class MyTed_Frag extends Fragment {
    public MyTed_Frag(){
        // empty constructor
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View v = inflater.inflate(R.layout.myted_layout, container, false);
        return v;
    }
}
