package com.limitip.make.service;


import com.limitip.make.pojo.Movie;

import java.util.List;

public interface WantWatchMoviesService {
    void addMovie(Movie movie);
    void deleteMovie(Movie movie);
    List<Movie> findWantWatchMovie(Movie movie);
}
