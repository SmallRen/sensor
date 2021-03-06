package com.sensor;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.sensor.mapper")
public class SensorApplication {

    public static void main(String[] args) {
        SpringApplication.run(SensorApplication.class, args);
    }

}
