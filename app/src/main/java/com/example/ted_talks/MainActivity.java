package com.example.ted_talks;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import com.example.ted_talks.child_fragment.MostViewed_Frag;
import com.example.ted_talks.child_fragment.Newest_Frag;
import com.example.ted_talks.child_fragment.Trending_Frag;
import com.example.ted_talks.fragment.Discover_Frag;
import com.example.ted_talks.fragment.MyTed_Frag;
import com.example.ted_talks.fragment.Podcasts_Frag;
import com.example.ted_talks.fragment.Talks_Frag;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity implements Talks_Frag.OnFragmentInteractionListener, Newest_Frag.OnFragmentInteractionListener, Trending_Frag.OnFragmentInteractionListener, MostViewed_Frag.OnFragmentInteractionListener {
    ActionBar actionBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        actionBar = getSupportActionBar();
        BottomNavigationView nav = findViewById(R.id.navigation);
        nav.setOnNavigationItemSelectedListener(navListener);
        actionBar.setTitle("TED Talks");
        Fragment fraga = new Talks_Frag();
        LoadFragment(fraga);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.setting_menu, menu);
        return true;
    }

    private BottomNavigationView.OnNavigationItemSelectedListener navListener = new BottomNavigationView.OnNavigationItemSelectedListener() {
        Fragment frag;

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
            switch (menuItem.getItemId()) {
                case R.id.discover:
                    actionBar.setTitle("Discover");
                    frag = new Discover_Frag();
                    LoadFragment(frag);
                    return true;
                case R.id.podcasts:
                    actionBar.setTitle("Podcasts");
                    frag = new Podcasts_Frag();
                    LoadFragment(frag);
                    return true;
                case R.id.my_talks:
                    actionBar.setTitle("My Talks");
                    frag = new MyTed_Frag();
                    LoadFragment(frag);
                    return true;
                default:
                    actionBar.setTitle("TED Talks");
                    frag = new Talks_Frag();
                    LoadFragment(frag);
                    return true;
            }
        }
    };

    public void LoadFragment(Fragment frag) {
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.frame_container, frag);
        ft.addToBackStack(null);
        ft.commit();
    }

    @Override
    public void messageFromNewestFragment(Uri uri) {
        Log.i("TAG", "received communication from Newest fragment");
    }

    @Override
    public void messageFromTalksFragment(Uri uri) {
        Log.i("TAG", "received communication from Talks fragment");
    }
}