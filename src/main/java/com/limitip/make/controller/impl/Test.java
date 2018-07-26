package com.limitip.make.controller.impl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("t")
public class Test {

    @RequestMapping("t")
    @ResponseBody
    public String t(){
        return "test";
    }
}
