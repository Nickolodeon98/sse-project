package com.example.sseproject.service;

public class ChatMessageIdGenerator {

    public static long id = 0;

    public static long generateId() {
        return ++id;
    }
}
