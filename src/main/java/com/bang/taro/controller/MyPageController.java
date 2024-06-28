package com.bang.taro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyPageController {

    /**
     * 내 정보 조회 페이지 이동
     * @return 내 정보 조회 페이지
     */
    @GetMapping("/mypage/myInfo")
    public String myInfo(Model model){
        model.addAttribute("title", "myInfo");
        return "/mypage/myInfo";
    }

    /**
     * 내 정보 수정 페이지 이동
     * @return 내 정보 수정 페이지
     */
    @GetMapping("/mypage/myInfoModify")
    public String myInfoModify(Model model){
        model.addAttribute("title", "myInfoModify");
        return "/mypage/myInfoModify";
    }

    /**
     * 내 포인트 조회 페이지 이동
     * @return 내 포인트 조회 페이지
     */
    @GetMapping("/mypage/myPoint")
    public String myPoint(Model model){
        model.addAttribute("title", "myPoint");
        return "/mypage/myPoint";
    }

    /**
     * 내 좋아요 관리 페이지 이동
     * @return 내 좋아요 관리 페이지
     */
    @GetMapping("/mypage/myFavorite")
    public String myFavorite(Model model){
        model.addAttribute("title", "myFavorite");
        return "/mypage/myFavorite";
    }

    /**
     * 내 게시글 관리 페이지 이동
     * @return 내 게시글 관리 페이지
     */
    @GetMapping("/mypage/myPost")
    public String myPost(Model model){
        model.addAttribute("title", "myPost");
        return "/mypage/myPost";
    }


}
