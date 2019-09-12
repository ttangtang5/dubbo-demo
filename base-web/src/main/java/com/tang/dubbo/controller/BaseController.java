package com.tang.dubbo.controller;

import com.tang.dubbo.api.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Description
 * @Author tang
 * @Date 2019-05-15 22:26
 * @Version 1.0
 **/
@Controller
@RequestMapping("base")
public class BaseController {

    @Autowired
    private BaseService baseService;

    @RequestMapping("hello")
    @ResponseBody
    public void hello() {
        baseService.hello();
    }
}
