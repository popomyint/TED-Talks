package com.example.ted_talks.child_fragment;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import com.example.ted_talks.R;
import com.example.ted_talks.detail.Cfive;
import com.example.ted_talks.detail.Cfour;
import com.example.ted_talks.detail.Cone;
import com.example.ted_talks.detail.Cthree;
import com.example.ted_talks.detail.Ctwo;

public class Newest_Frag extends Fragment {
    CardView cOne;
    CardView cTwo;
    CardView cThree;
    CardView cFour;
    CardView cFive;
    private OnFragmentInteractionListener newestLitsner;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View v = inflater.inflate(R.layout.newest_layout, container, false);
        cOne = v.findViewById(R.id.cOne);
        cTwo = v.findViewById(R.id.cTwo);
        cThree = v.findViewById(R.id.cThree);
        cFour = v.findViewById(R.id.cFour);
        cFive = v.findViewById(R.id.cFive);
        cOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1 = new Intent(getActivity(), Cone.class);
                startActivity(i1);
            }
        });
        cTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i2 = new Intent(getActivity(), Ctwo.class);
                startActivity(i2);
            }
        });
        cThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i3 = new Intent(getActivity(), Cthree.class);
                startActivity(i3);
            }
        });
        cFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i4 = new Intent(getActivity(), Cfour.class);
                startActivity(i4);
            }
        });
        cFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i5 = new Intent(getActivity(), Cfive.class);
                startActivity(i5);
            }
        });
        return v;
    }

    public void onAttach(Context context){
        super.onAttach(context);
        if(context instanceof OnFragmentInteractionListener){
            newestLitsner = (OnFragmentInteractionListener) context;
        }
    }

    public void onDetach() {
        super.onDetach();
        newestLitsner = null;
    }

    public interface OnFragmentInteractionListener{
        void messageFromNewestFragment(Uri uri);
    }
}
