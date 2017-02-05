package com.joancaparros.movietvshowapp.view.recycler;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import com.joancaparros.movietvshowapp.R;
import com.joancaparros.movietvshowapp.manager.ListMovieManager;
import com.joancaparros.movietvshowapp.model.Movie;

/**
 * Created by root on 5/02/17.
 */

public class ListAdapter extends RecyclerView.Adapter<ListHolder> {
    private Activity mActivity;
    private ListMovieManager mManager;


    public ListAdapter(Activity activity) {
        mActivity = activity;
        mManager = new ListMovieManager();
    }

    @Override
    public ListHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = mActivity.getLayoutInflater().inflate(
                R.layout.list_movie_cell,
                parent,
                false);

        ListHolder holder = new ListHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(ListHolder holder, int position) {
        Movie movie = mManager.getItemInPosition(position);
        holder.setItemText(movie);
    }

    @Override
    public int getItemCount() {
        return mManager.getItemCount();
    }
}
