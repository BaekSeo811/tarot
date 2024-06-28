package com.bang.taro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ReadingController {
    /**
     * 질문 입력 페이지 이동
     * @return 질문 입력 페이지
     */
    @GetMapping("/reading/question")
    public String question(Model model){
        model.addAttribute("title", "question");
        return "/reading/question";
    }

    /**
     * 카드 선택 페이지 이동
     * @return 카드 선택 페이지
     */
    @GetMapping("/reading/cardSelect")
    public String cardSelect(Model model){
        model.addAttribute("title", "cardSelect");
        return "/reading/cardSelect";
    }

    /**
     * 결과 조회 페이지 이동
     * @return 결과 조회 페이지
     */
    @GetMapping("/reading/result")
    public String result(Model model){
        model.addAttribute("title", "reading");
        return "/reading/result";
    }
}
