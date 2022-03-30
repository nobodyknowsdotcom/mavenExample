package com.example.demo.vehicles;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
@Getter
public class Wheel implements IRollable{
    private final int size;
    @Override
    public void Roll() {
        System.out.println("Wheels are rolling!");
    }
}