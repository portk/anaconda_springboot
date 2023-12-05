package com.example.demosecond;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.exam.demosecond")
public class BeanConfig {
    @Bean
    public String bean1() {
        return new String("Bean 1");
    }
}
