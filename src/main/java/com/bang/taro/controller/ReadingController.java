package com.bang.taro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ReadingController {
    @GetMapping("/reading/question")
    public String question(){
        return "/reading/question";
    }

    @GetMapping("/reading/cardSelect")
    public String cardSelect(){
        return "/reading/cardSelect";
    }

    @GetMapping("/reading/result")
    public String result(){
        return "/reading/result";
    }
}
