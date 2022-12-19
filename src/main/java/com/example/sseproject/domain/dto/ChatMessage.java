package com.example.sseproject.domain.dto;

import com.example.sseproject.service.ChatMessageIdGenerator;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDateTime;

@AllArgsConstructor
@Getter
public class ChatMessage {

    private long id;

    @JsonFormat()
    private LocalDateTime createdAt;

    private String authorName;
    private String content;

    public ChatMessage(String authorName, String content) {
        this(ChatMessageIdGenerator.generateId(), LocalDateTime.now(), authorName, content);
    }
}
