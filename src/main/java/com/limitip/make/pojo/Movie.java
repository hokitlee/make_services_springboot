package com.limitip.make.pojo;

import java.io.Serializable;

/**
 * User: hokitlee
 * Date: 2018/3/21
 * Time: 15:06
 * Description:
 */
public class Movie implements Serializable {
    private int id;
    private String movieName;
    private String movieType;
    private int userId;

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getMovieType() {
        return movieType;
    }

    public void setMovieType(String movieType) {
        this.movieType = movieType;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

}