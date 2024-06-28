package com.bang.taro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    /**
     * 인덱스 페이지
     * @return 인덱스 페이지
     */
    @GetMapping("/")
    public String Index(Model model){
        model.addAttribute("title", "Index");
        return "index";
    }

    /**
     * 메인 페이지
     * @return 메인 페이지
     */
    @GetMapping("/main")
    public String MainPage(Model model){
        model.addAttribute("title", "MainPage");
        return "main";
    }

}
