package com.limitip.make.mapper;

import com.limitip.make.pojo.Movie;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * User: hokitlee
 * Date: 2018/3/23
 * Time: 9:33
 * Description:
 */
public interface WantWatchMovieMapper {
    void addMovie(Movie movie);
    void deleteMovie(Movie movie);
    List<Movie> findWantWatchMovie(Movie movie);
}