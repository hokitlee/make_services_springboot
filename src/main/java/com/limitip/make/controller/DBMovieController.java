package com.limitip.make.controller;


import com.limitip.make.pojo.DoubanMovie;
import com.limitip.make.pojo.Param;

import java.util.Map;

public interface DBMovieController {
    Map FindAllMovieByUser(Param param);
    Map addMovie(DoubanMovie doubanMovie);
}
