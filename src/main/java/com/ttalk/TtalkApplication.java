package com.ttalk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
public class TtalkApplication {

    public static void main(String[] args) {
        SpringApplication.run(TtalkApplication.class, args);
    }
}
