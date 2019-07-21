package com.example.zwd.springcloudclientA.controller;

import com.example.zwd.springcloudclientA.model.User;
import org.springframework.web.bind.annotation.*;

@RestController
public class ConsumerController {

    @GetMapping(value = "hello/{name}")
    public String hello(@PathVariable String name) throws Exception {

        if(name.equals("exception")){
            throw new Exception("不能使用这个参数");
        }

        System.out.println( "hello "+name+"!");

        return "success";
    }

    @PostMapping(value = "hello/json")
    public User helloJson(@RequestBody User user) throws Exception {

        if(user.getName().equals("exception")){
            throw new Exception("exception");
        }

        System.out.println( "hello "+user.getName()+"!");

        return user;
    }

    @PostMapping(value = "hello/form")
    public String helloForm(User user) throws Exception {

        if(user.getName().equals("exception")){
            throw new Exception("exception");
        }

        System.out.println( "hello "+user.getName()+"!");

        return "success";
    }

}
