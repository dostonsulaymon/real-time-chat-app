package com.chat.controller;

import com.chat.model.ChatMessage;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ChatController {

    @MessageMapping("/sendMessage")
    @SendTo("/topic/messages")
    public ChatMessage sendMessage(ChatMessage chatMessage) {
        System.out.println("Received message: " + chatMessage.getContent());
        return chatMessage;
    }

    @GetMapping("/chat")
    public String chatPage() {
        return "chat";
    }
}