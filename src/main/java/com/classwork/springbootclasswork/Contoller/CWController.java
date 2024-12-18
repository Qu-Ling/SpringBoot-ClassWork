package com.classwork.springbootclasswork.Contoller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CWController {
    /**
     * 登入 界面渲染
     */
    @GetMapping("/login")
    public String show() {
        return "login";
    }

    @GetMapping("/demo")
    public String demo() {
        return "demo";
    }
}


