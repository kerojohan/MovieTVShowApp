package com.joancaparros.movietvshowapp.view.recycler;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
import com.joancaparros.movietvshowapp.model.Movie;
import com.joancaparros.movietvshowapp.R;

/**
 * Created by root on 5/02/17.
 */

public class ListHolder extends RecyclerView.ViewHolder {
    private TextView mItemTitle;
    private TextView mItemYear;
    private TextView mItemDirector;

    public ListHolder(View itemView) {
        super(itemView);
        mItemTitle = (TextView) itemView.findViewById(
                R.id.list_movie_cell_title);
        mItemYear = (TextView) itemView.findViewById(
                R.id.list_movie_cell_Year);
        mItemDirector = (TextView) itemView.findViewById(
                R.id.list_movie_cell_director);
    }

    public void setItemText(Movie movie) {
        mItemTitle.setText(movie.getName());
        mItemYear.setText(movie.getYear());
        mItemDirector.setText(movie.getDirector());
    }
}
