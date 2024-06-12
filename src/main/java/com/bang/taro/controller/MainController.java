package com.bang.taro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    /**
     * 메인 페이지
     * @return
     */
    @GetMapping("/")
    public String MainPage(){
        return "main";
    }

}
