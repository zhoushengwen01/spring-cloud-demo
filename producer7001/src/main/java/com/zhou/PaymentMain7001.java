package com.zhou;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author wsk
 * @date 2020/3/23 10:21
 */
@SpringBootApplication
@EnableDiscoveryClient
public class PaymentMain7001 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentMain7001.class, args);
    }
}