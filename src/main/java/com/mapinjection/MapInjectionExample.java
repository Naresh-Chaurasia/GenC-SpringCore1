package com.mapinjection;

import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class MapInjectionExample {

    private Map<String, String> keyValueMap;

    public MapInjectionExample(Map<String, String> keyValueMap) {
        this.keyValueMap = keyValueMap;
    }

    public void printMap() {
        System.out.println("Injected Map:");
        keyValueMap.forEach((key, value) -> System.out.println(key + " -> " + value));
    }
}

