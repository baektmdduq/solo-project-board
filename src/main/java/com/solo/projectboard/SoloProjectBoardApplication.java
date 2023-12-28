package com.solo.projectboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@ConfigurationPropertiesScan
@SpringBootApplication
public class SoloProjectBoardApplication {

    public static void main(String[] args) {
        SpringApplication.run(SoloProjectBoardApplication.class, args);
    }

}
