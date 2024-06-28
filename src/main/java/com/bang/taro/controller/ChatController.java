package com.bang.taro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ChatController {
    /**
     * 채팅 목록 페이지 이동
     * @return 채팅 목록 페이지
     */
    @GetMapping("/chat/readerList")
    public String readerList(Model model){
        model.addAttribute("title", "reader");
        return "/chat/readerList";
    }

    /**
     * 채팅 페이지 이동
     * @return 채팅 페이지
     */
    @GetMapping("/chat/chatting")
    public String chatting(Model model){
        model.addAttribute("title", "chatting");
        return "/chat/chatting";
    }
}
