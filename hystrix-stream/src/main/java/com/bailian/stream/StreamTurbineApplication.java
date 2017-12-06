package com.bailian.stream;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.turbine.stream.EnableTurbineStream;

@SpringBootApplication
@EnableTurbineStream
public class StreamTurbineApplication {

    public static void main(String[] args){
        SpringApplication.run(StreamTurbineApplication.class,args);
    }
}
