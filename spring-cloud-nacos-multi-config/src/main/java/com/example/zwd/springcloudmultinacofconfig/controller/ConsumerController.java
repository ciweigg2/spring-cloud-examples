package com.example.zwd.springcloudmultinacofconfig.controller;

import com.example.zwd.springcloudmultinacofconfig.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RefreshScope
public class ConsumerController {

    @Value("${app.user.cache}")
    private boolean cache;

    @Autowired
    RestTemplate restTemplate;

    @Autowired
    private RedisTemplate redisTemplate;

    @Autowired
    private User user;

    @GetMapping(value = "ribbon")
    public String add() {
        redisTemplate.opsForSet().add("spring-cloud-nacos" ,"测试一下呀");
        return restTemplate.getForEntity("http://eureka-client-a/hello/zwd",String.class).getBody();
    }
}
