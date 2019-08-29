package com.zwh.config;

import com.zwh.service.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by ${zwh} on 2019/8/21.
 */
@Configuration
public class MyAppConfig {

    @Bean
    public HelloService helloService(){

        System.out.println("添加组件到容器");
        return new HelloService();
    }

}
