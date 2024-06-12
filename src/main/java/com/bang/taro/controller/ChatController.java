package com.bang.taro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ChatController {
    @GetMapping("/chat/readerList")
    public String readerList(){
        return "/chat/readerList";
    }

    @GetMapping("/chat/chatting")
    public String chatting(){
        return "/chat/chatting";
    }
}
