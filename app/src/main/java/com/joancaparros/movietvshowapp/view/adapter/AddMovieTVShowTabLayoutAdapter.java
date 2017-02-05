package com.joancaparros.movietvshowapp.view.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.joancaparros.movietvshowapp.view.fragment.AddMovie;
import com.joancaparros.movietvshowapp.view.fragment.AddTVShow;

/**
 * Created by root on 3/02/17.
 */
public class AddMovieTVShowTabLayoutAdapter extends FragmentPagerAdapter {
    private int numberTabs=2;

    public AddMovieTVShowTabLayoutAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0: // Fragment # 0 - This will show FirstFragment
                return AddMovie.newInstance();
            case 1: // Fragment # 0 - This will show FirstFragment different title
                return AddTVShow.newInstance();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return this.numberTabs;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0: // Fragment # 0 - This will show movie title
                return "Movies";
            case 1: // Fragment # 0 - This will show tvshow title
                return "TV Shows";
            default:
                return null;
        }
    }
}
