package com.joancaparros.movietvshowapp.manager;

import com.joancaparros.movietvshowapp.model.Movie;

/**
 * Created by root on 5/02/17.
 */

public class ListMovieManager {
    public Movie getItemInPosition(int position) {
        //TODO: this should absolutely go into a data specific class, ok Ian?

        if(position %2 == 0)
        {
            return new Movie("title1","3232","joan");
        }
        else
        {
            return new Movie("title2","3232","joan");
        }

    }

    public int getItemCount() {
        return 100;
    }
}
