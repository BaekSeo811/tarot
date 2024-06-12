package com.bang.taro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BoardController {

    @GetMapping("/board")
    public String board(){
        return "/board/board";
    }

    @GetMapping("/board/post")
    public String post(){
        return "/board/post";
    }

    @GetMapping("/board/postCreate")
    public String postCreate(){
        return "/board/postCreate";
    }

    @GetMapping("/board/postUpdate")
    public String postUpdate(){
        return "/board/postUpdate";
    }
}
