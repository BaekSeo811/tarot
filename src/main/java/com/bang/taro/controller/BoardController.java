package com.bang.taro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BoardController {

    /**
     * 게시판 페이지 이동
     * @return 게시판 페이지
     */
    @GetMapping("/board")
    public String board(Model model){
        model.addAttribute("title", "board");
        return "/board/board";
    }

    /**
     * 게시글 페이지 이동
     * @return 게시글 페이지
     */
    @GetMapping("/board/post")
    public String post(Model model){
        model.addAttribute("title", "post");
        return "/board/post";
    }

    /**
     * 게시글 작성 페이지 이동
     * @return 게시글 작성 페이지
     */
    @GetMapping("/board/postCreate")
    public String postCreate(Model model){
        model.addAttribute("title", "posting");
        return "/board/postCreate";
    }

    /**
     * 게시글 수정 페이지 이동
     * @return 게시글 수정
     */
    @GetMapping("/board/postUpdate")
    public String postUpdate(Model model){
        model.addAttribute("title", "posting update");
        return "/board/postUpdate";
    }
}
