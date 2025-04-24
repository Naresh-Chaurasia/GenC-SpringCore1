package com.injections;

import org.springframework.stereotype.Service;

@Service
public class MessageServiceImpl implements MessageService {
    @Override
    public String getMessage() {
        return "Hello from Spring Core!";
    }
}