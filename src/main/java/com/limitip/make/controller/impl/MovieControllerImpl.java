package com.limitip.make.controller.impl;

import com.limitip.make.controller.MovieController;
import com.limitip.make.pojo.Movie;
import com.limitip.make.pojo.ResultMap;
import com.limitip.make.service.WantWatchMoviesService;
import com.limitip.make.service.WatchedMoviesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * User: hokitlee
 * Date: 2018/3/21
 * Time: 16:01
 * Description:
 */
@Controller
@RequestMapping(value = "movie")

public class MovieControllerImpl implements MovieController {
    ResultMap resultMap = new ResultMap();

    @Autowired
    WatchedMoviesService watchedMoviesService;

    @Autowired
    WantWatchMoviesService wantWatchMoviesService;

    @RequestMapping(value = "watchedMovieAdd")
    @ResponseBody
    public Map<String, Serializable> WatchedMovieAdd(Movie movie){
        Map<String,Serializable> resultMap = new HashMap<>();
        watchedMoviesService.addMovie(movie);
        return resultMap;
    }

    @RequestMapping(value = "deletWachedMovie")
    @ResponseBody
    public Map<String, Serializable> DeletWatchedMovie(Movie movie){
        Map<String,Serializable> resultMap = new HashMap<>();
        watchedMoviesService.deleteMovie(movie);
        return resultMap;
    }

    @RequestMapping(value = "findWatchedMovie")
    @ResponseBody
    public Map<String, Serializable> findWatchedMovie(Movie movie){
        Map<String,Serializable> resultMap = new HashMap<>();
        resultMap.put("movieList", (Serializable) watchedMoviesService.findWatchedMovie(movie));
        return resultMap;
    }

    @RequestMapping(value = "wantWatchMovieAdd")
    @ResponseBody
    public Map<String, Serializable> WantWatchMovieAdd(Movie movie){
        Map<String,Serializable> resultMap = new HashMap<>();
        wantWatchMoviesService.addMovie(movie);
        return resultMap;
    }

    @RequestMapping(value = "deletWantWatchMovie")
    @ResponseBody
    public Map<String, Serializable> DeletWantWatchMovie(Movie movie){
        Map<String,Serializable> resultMap = new HashMap<>();
        wantWatchMoviesService.deleteMovie(movie);
        return resultMap;
    }

    @RequestMapping(value = "findWantWatchMovie")
    @ResponseBody
    public Map<String, Serializable> findWantWatchMovie(Movie movie){
        Map<String,Serializable> resultMap = new HashMap<>();
        System.out.println("1111111");
        resultMap.put("movieList", (Serializable) wantWatchMoviesService.findWantWatchMovie(movie));
        return resultMap;
    }
}