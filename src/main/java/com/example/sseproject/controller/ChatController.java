package com.example.sseproject.controller;

import com.example.sseproject.domain.RsData;
import com.example.sseproject.domain.dto.ChatMessage;
import com.example.sseproject.domain.dto.WriteMessageRequest;
import com.example.sseproject.domain.dto.WriteMessageResponse;
import com.example.sseproject.service.MessageService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/chat")
@RequiredArgsConstructor
public class ChatController {

    private final MessageService messageService;

    @PostMapping("/writeMessage")
    public String sendChat() {
        return "메시지가 작성되었습니다.";
    }

    @PostMapping("/chatMessage")
    @ResponseBody
    public RsData<WriteMessageResponse> chatInitialize(@RequestBody WriteMessageRequest writeMessageRequest) {
        ChatMessage message = writeMessageRequest.toMessage();

//        messageService.(message);

        return new RsData<>(WriteMessageResponse.of(message), "메시지를 작성했습니다.");
    }
}
