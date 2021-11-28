package com.offcn.content;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@MapperScan("com.offcn.content.dao")
@EnableDiscoveryClient
public class UContentApplication {

    public static void main(String[] args) {
        SpringApplication.run(UContentApplication.class, args);
    }

}
