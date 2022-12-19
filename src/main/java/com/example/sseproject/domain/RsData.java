package com.example.sseproject.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Builder
@AllArgsConstructor
@Getter
public class RsData<T> {

    private T resultCode;
    private String message;

    public static <T> RsData<T> success(T resultCode) {
        return new RsData<>(resultCode, "SUCCESS");
    }
}
