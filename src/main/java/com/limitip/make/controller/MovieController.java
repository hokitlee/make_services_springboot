package com.limitip.make.controller;

import com.limitip.make.pojo.Movie;

import java.io.Serializable;
import java.util.Map;

public interface MovieController {
    Map<String, Serializable> WatchedMovieAdd(Movie movie);
    Map<String, Serializable> DeletWatchedMovie(Movie movie);
    Map<String, Serializable> findWatchedMovie(Movie movie);
    Map<String, Serializable> WantWatchMovieAdd(Movie movie);
    Map<String, Serializable> DeletWantWatchMovie(Movie movie);
    Map<String, Serializable> findWantWatchMovie(Movie movie);

}
