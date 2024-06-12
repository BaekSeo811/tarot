package com.bang.taro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyPageController {

    @GetMapping("/mypage/myInfo")
    public String myInfo(){
        return "/mypage/myInfo";
    }

    @GetMapping("/mypage/myInfoModify")
    public String myInfoModify(){
        return "/mypage/myInfoModify";
    }

    @GetMapping("/mypage/myPoint")
    public String myPoint(){
        return "/mypage/myPoint";
    }

    @GetMapping("/mypage/myFavorite")
    public String myFavorite(){
        return "/mypage/myFavorite";
    }

    @GetMapping("/mypage/myPost")
    public String myPost(){
        return "/mypage/myPost";
    }


}
