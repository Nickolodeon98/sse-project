package com.example.sseproject.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class WriteMessageResponse {
    private long id;

    public static WriteMessageResponse of(ChatMessage chatMessage) {
        return new WriteMessageResponse(chatMessage.getId());
    }
}
