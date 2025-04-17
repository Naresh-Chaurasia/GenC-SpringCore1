package com.autowiringxml;

import org.springframework.stereotype.Service;

@Service
public class MessageServiceImpl implements MessageService {

    @Override
    public void sendMessage() {
        System.out.println("Hello, this is a message from the MessageService!");
    }
}