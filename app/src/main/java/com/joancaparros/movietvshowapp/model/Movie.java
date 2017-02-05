package com.joancaparros.movietvshowapp.model;

/**
 * Created by root on 3/02/17.
 */

public class Movie {

    private String name;
    private String director;
    private String Year;

    public Movie() {
    }

    public Movie(String name, String director, String year) {
        this.name = name;
        this.director = director;
        Year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getYear() {
        return Year;
    }

    public void setYear(String year) {
        Year = year;
    }
}
