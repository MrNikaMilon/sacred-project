package dev.sacred.springproject;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

public class Coffee {

    @Getter
    private final String id;
    @Getter @Setter
    private String name;

    public Coffee (String name) {
        this.id = UUID.randomUUID().toString();
        this.name = name;
    }
}
