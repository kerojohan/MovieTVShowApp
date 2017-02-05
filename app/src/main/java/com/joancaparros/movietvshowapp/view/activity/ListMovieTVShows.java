package com.joancaparros.movietvshowapp.view.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.joancaparros.movietvshowapp.R;
import com.joancaparros.movietvshowapp.view.recycler.ListAdapter;

public class ListMovieTVShows extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_movie_tvshows);


        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.my_recycler_view_movie_list);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new ListAdapter(this));
    }
}
