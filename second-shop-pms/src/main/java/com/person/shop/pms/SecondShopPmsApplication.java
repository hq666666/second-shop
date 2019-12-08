package com.person.shop.pms;
import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@EnableDubbo
@MapperScan("com.person.shop.pms.mapper")
@SpringBootApplication
public class SecondShopPmsApplication {

    public static void main(String[] args) {
        SpringApplication.run(SecondShopPmsApplication.class, args);
    }

}
