package com.xiaosong456.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Description 启动类
 * @author lixiaosong
 * @ClassName PaymentMain8001
 * @Date 2020/4/29 0:09
 **/
@SpringBootApplication
@EnableEurekaClient
public class PaymentMain8002 {

    public static void main(String[] args){
        SpringApplication.run(PaymentMain8002.class,args);
    }
}
