package com.picshop.serviceregistry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer // для возможности запуска реестра
@SpringBootApplication
public class PicShopServiceRegistryApplication {

    public static void main(String[] args) {
        SpringApplication.run(PicShopServiceRegistryApplication.class, args);
    }

}
