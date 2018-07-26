package com.limitip.make.mapper;


import com.limitip.make.pojo.Movie;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * User: hokitlee
 * Date: 2018/3/21
 * Time: 15:11
 * Description:
 */

public interface WatchedMoviesMapper {
    void addMovie(Movie movie);
    void deleteMovie(Movie movie);
    List<Movie> findMovie(Movie movie);
}