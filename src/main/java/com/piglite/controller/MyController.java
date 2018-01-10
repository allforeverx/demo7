package com.piglite.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by liz on 2018/1/2.
 */
@Controller
@RequestMapping("/demo7")
public class MyController {
    @RequestMapping("/welcome")
    public String welcome() {
        return "welcome";
    }
}
