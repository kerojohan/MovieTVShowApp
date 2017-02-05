package com.joancaparros.movietvshowapp.model;

/**
 * Created by root on 3/02/17.
 */

public class TVShow {

    private String name;
    private Integer nSeasons;
    private Integer startYear;

    public TVShow() {
    }

    public TVShow(Integer startYear, Integer nSeasons, String name) {
        this.startYear = startYear;
        this.nSeasons = nSeasons;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getnSeasons() {
        return nSeasons;
    }

    public void setnSeasons(Integer nSeasons) {
        this.nSeasons = nSeasons;
    }

    public Integer getStartYear() {
        return startYear;
    }

    public void setStartYear(Integer startYear) {
        this.startYear = startYear;
    }
}
