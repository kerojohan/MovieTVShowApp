package com.joancaparros.movietvshowapp.view.activity;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.joancaparros.movietvshowapp.R;
import com.joancaparros.movietvshowapp.view.adapter.AddMovieTVShowTabLayoutAdapter;

public class AddMovieTVShows extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_movie_tvshows);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.activity_add_movie_tshows_tablayout);
        ViewPager viewPager = (ViewPager) findViewById(R.id.activity_add_movie_tshows_view_pager);

        viewPager.setAdapter(new AddMovieTVShowTabLayoutAdapter(getSupportFragmentManager()));
        tabLayout.setupWithViewPager(viewPager);

    }
}
