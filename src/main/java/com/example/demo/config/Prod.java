package com.example.demo.config;

import com.example.demo.vehicles.SteeringWheel;
import com.example.demo.vehicles.Wheel;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("prod")
public class Prod {
    @Value("${prod.app.name}")
    private String appName;
    @Value("${spring.profiles.active}")
    private String configName;
    @Value("${prod.wheel.size}")
    private Integer wheelSize;
    @Value("${prod.steeringwheel.size}")
    private Integer steeringWheelSize;

    @Bean
    public Wheel wheel(){
        return new Wheel(wheelSize){
            @Override
            public void Roll(){
                System.out.println("Wheels are spinning greatly!");
            }
        };
    }
    @Bean
    public SteeringWheel steeringWheel(){
        return new SteeringWheel(steeringWheelSize){
            @Override
            public void Roll(){
                System.out.println("Steering wheel is spinning very cool!");
            }
        };
    }
    @Bean String appName(){
        return appName;
    }
    @Bean String configName(){
        return configName;
    }
}
