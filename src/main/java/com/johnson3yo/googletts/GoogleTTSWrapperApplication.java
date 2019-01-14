package com.johnson3yo.googletts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class GoogleTTSWrapperApplication {

    public static void main(String[] args) {
        SpringApplication.run(GoogleTTSWrapperApplication.class, args);
    }


}
