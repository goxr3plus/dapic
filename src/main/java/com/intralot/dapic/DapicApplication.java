package com.intralot.dapic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class DapicApplication {

    public static void main(String[] args) {

        SpringApplication.run(DapicApplication.class, args);

    }
}
