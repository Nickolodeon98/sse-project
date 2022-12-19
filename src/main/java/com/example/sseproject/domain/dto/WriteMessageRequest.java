package com.example.sseproject.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class WriteMessageRequest {

    private String authorName;
    private String message;

    public ChatMessage toMessage() {
        return new ChatMessage(this.authorName, this.message);
    }
}
