package com.limitip.make.controller.impl;

import com.limitip.make.controller.LoginController;
import com.limitip.make.pojo.User;
import com.limitip.make.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping(value = "user")
public class LoginControllerImpl implements LoginController {

    @Autowired
    UserService userService;

    @RequestMapping(value = "register")
    @ResponseBody
    public Map<String, Serializable> register(@RequestBody User user) {
        Map<String,Serializable> resultMap = new HashMap<>();
        if (userService.findByUsername(user)) {
            resultMap.put("msg","Success");
            userService.addUser(user);
        }
        else {
            resultMap.put("msg", "Fail");
        }
        return resultMap;
    }

    @RequestMapping(value = "login")
    @ResponseBody
    public Map<String, Serializable> login(@RequestBody User user) {
        Map<String,Serializable> resultMap = new HashMap<>();
        User fUser = new User();
        resultMap = userService.findUserByNameAndPsd(user);
        return resultMap;
    }

    @RequestMapping(value = "queryAllUser")
    @ResponseBody
    public Map<String, Serializable> queryAllUser() {
        Map<String,Serializable> resultMap = new HashMap<>();
        resultMap.put("userList", (Serializable) userService.findAllUser());
        return resultMap;
    }

//    @RequestMapping(value = "my")
//    public String mytest() {
//        return "my";
//    }
}
