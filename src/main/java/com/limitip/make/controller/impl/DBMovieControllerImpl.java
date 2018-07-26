package com.limitip.make.controller.impl;

import com.limitip.make.controller.DBMovieController;
import com.limitip.make.pojo.DoubanMovie;
import com.limitip.make.pojo.Param;
import com.limitip.make.pojo.User;
import com.limitip.make.service.DoubanMovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping(value = "movieapi")

public class DBMovieControllerImpl implements DBMovieController {
    //
    @Autowired
    DoubanMovieService doubanMovieService;


    //subjects
    @RequestMapping(value = "findId")
    @ResponseBody
    public Map FindAllMovieByUser(@RequestBody Param param) {
        Map<String, Serializable> result = new HashMap<>();
        result.put("subjects", (Serializable) doubanMovieService.findByUser(param.getUser(), param.getStatus()));
        return result;
    }

    @RequestMapping(value = "add")
    @ResponseBody
    public Map addMovie(@RequestBody DoubanMovie doubanMovie) {
        Map<String, Serializable> result = new HashMap<>();
        if (doubanMovieService.addDBMoive(doubanMovie) == 0) {
            result.put("msg", "Fail");
        } else {
            result.put("msg", "Success");
        }
        return result;
    }


    @RequestMapping(value = "delete")
    @ResponseBody
    public Map deleteMovie(@RequestBody Param param) {
        Map<String, Serializable> map = new HashMap<>();
        DoubanMovie doubanMovie = param.getDoubanMovie();
        doubanMovie.setStatus(param.getStatus());
        User user = param.getUser();
        if (doubanMovieService.deleteByUser(doubanMovie, user) > 0) {
            map.put("msg", "Success");
        } else {
            map.put("msg", "Fail");
        }
        return map;
    }

    @RequestMapping(value = "a")
    public String addMovie1(User user) {
        System.out.println(user.getId());
        return "1";
    }
}
