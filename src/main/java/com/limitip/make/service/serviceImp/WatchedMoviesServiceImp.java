package com.limitip.make.service.serviceImp;

import com.limitip.make.mapper.WatchedMoviesMapper;
import com.limitip.make.pojo.Movie;
import com.limitip.make.service.WatchedMoviesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * User: hokitlee
 * Date: 2018/3/21
 * Time: 15:29
 * Description:
 */

@Service
public class WatchedMoviesServiceImp implements WatchedMoviesService {

    @Autowired
    WatchedMoviesMapper watchedMoviesMapper;

    public void addMovie(Movie movie) {
        watchedMoviesMapper.addMovie(movie);
    }

    public void deleteMovie(Movie movie) {
        watchedMoviesMapper.deleteMovie(movie);
    }

    public List<Movie> findWatchedMovie(Movie movie) {
        return watchedMoviesMapper.findMovie(movie);
    }
}