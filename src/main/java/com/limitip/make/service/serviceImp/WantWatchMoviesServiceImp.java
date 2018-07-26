package com.limitip.make.service.serviceImp;

import com.limitip.make.mapper.WantWatchMovieMapper;
import com.limitip.make.pojo.Movie;
import com.limitip.make.service.WantWatchMoviesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * User: hokitlee
 * Date: 2018/3/23
 * Time: 9:41
 * Description:
 */

@Service
public class WantWatchMoviesServiceImp implements WantWatchMoviesService {

    @Autowired
    WantWatchMovieMapper wantWatchMovieMapper;

    public void addMovie(Movie movie) {
        wantWatchMovieMapper.addMovie(movie);
    }

    public void deleteMovie(Movie movie) {
        wantWatchMovieMapper.deleteMovie(movie);

    }

    public List<Movie> findWantWatchMovie(Movie movie) {
       return wantWatchMovieMapper.findWantWatchMovie(movie);
    }
}