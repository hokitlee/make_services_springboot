package com.limitip.make.service;


import com.limitip.make.pojo.Movie;

import java.util.List;

public interface WatchedMoviesService {
    void addMovie(Movie movie);
    void deleteMovie(Movie movie);
    List<Movie> findWatchedMovie(Movie movie);
}
