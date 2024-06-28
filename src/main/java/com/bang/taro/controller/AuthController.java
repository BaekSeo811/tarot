package com.bang.taro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AuthController {

    /**
     * 로그인 페이지 이동
     * @return 로그인 페이지
     */
    @GetMapping("/auth/login")
    public String login(Model model){
        model.addAttribute("title", "login");
        return "/auth/login";
    }

    /**
     * 아이디 찾기 페이지 이동
     * @return 아이디 찾기 페이지
     */
    @GetMapping("/auth/idInquiry")
    public String idInquiry(Model model){
        model.addAttribute("title", "idInquiry");
        return "/auth/idInquiry";
    }

    /**
     * 비밀번호 찾기 페이지 이동
     * @return 비밀번호 찾기 페이지
     */
    @GetMapping("/auth/pwInquiry")
    public String pwInquiry(Model model){
        model.addAttribute("title", "pwInquiry");
        return "/auth/pwInquiry";
    }

    /**
     * 회원가입 페이지 이동
     * @return 회원가입 페이지
     */
    @GetMapping("/auth/join")
    public String join(Model model){
        model.addAttribute("title", "join");
        return "/auth/join";
    }
}
