package com.example.myProject.controller;

import com.example.myProject.domain.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {
   @RequestMapping("/hello")
   public String index(){
        return "HelloWorld";
    }

    @RequestMapping("/getUser")
    public User getUser(){
        User user = new User();
        user.setAge(90);
        user.setName("雪琰");
        return user;
    }
}
