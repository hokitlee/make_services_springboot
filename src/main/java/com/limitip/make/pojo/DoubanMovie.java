package com.limitip.make.pojo;

import java.io.Serializable;

public class DoubanMovie implements Serializable {
    private Integer id;

    private Integer movieid;

    private Integer status;

    private Integer userid;

    private String title;

    private String subtype;

    private String year;

    private String images;

    private String genres;

    public DoubanMovie(Integer id, Integer movieid, Integer status, Integer userid, String title, String subtype, String year, String images, String genres) {
        this.id = id;
        this.movieid = movieid;
        this.status = status;
        this.userid = userid;
        this.title = title;
        this.subtype = subtype;
        this.year = year;
        this.images = images;
        this.genres = genres;
    }

    public DoubanMovie() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMovieid() {
        return movieid;
    }

    public void setMovieid(Integer movieid) {
        this.movieid = movieid;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getSubtype() {
        return subtype;
    }

    public void setSubtype(String subtype) {
        this.subtype = subtype == null ? null : subtype.trim();
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year == null ? null : year.trim();
    }

    public String getImages() {
        return images;
    }

    public void setImages(String images) {
        this.images = images == null ? null : images.trim();
    }

    public String getGenres() {
        return genres;
    }

    public void setGenres(String genres) {
        this.genres = genres == null ? null : genres.trim();
    }
}