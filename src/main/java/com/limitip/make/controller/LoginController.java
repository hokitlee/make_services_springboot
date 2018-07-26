package com.limitip.make.controller;

import com.limitip.make.pojo.User;
import org.springframework.web.bind.annotation.RequestBody;

import java.io.Serializable;
import java.util.Map;

public interface LoginController {
    Map<String, Serializable> register(@RequestBody User user);
    Map<String, Serializable> login(@RequestBody User user);
    Map<String, Serializable> queryAllUser();
}
