package com.limitip.make.service;


import com.limitip.make.pojo.DoubanMovie;
import com.limitip.make.pojo.User;

import java.util.List;

public interface DoubanMovieService {
    List findByUser(User user, int status);
    int addDBMoive(DoubanMovie doubanMovie);
    int deleteByUser(DoubanMovie doubanMovie, User user);
    int updateDBMovie(DoubanMovie doubanMovie, User user);

}
