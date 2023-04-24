package com.hbnu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {
    @RequestMapping("/{pageName}")//restful风格接收请求参数
    public String page(@PathVariable String pageName){
        return pageName;
    }
}
