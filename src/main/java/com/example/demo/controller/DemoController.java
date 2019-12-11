package com.example.demo.controller;

import com.example.demo.domain.UserDemo;
import com.example.demo.service.DemoService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @version 1.0 created  on 2019/12/11 16:21
 */
@RestController
@AllArgsConstructor
public class DemoController {
    private DemoService demoService;

    @GetMapping("/demo/{uid}")
    public UserDemo selectUser(@PathVariable("uid") Integer uid) {
        return demoService.selectUser(uid);
    }

    @PostMapping("/demo/insert")
    public void insert(UserDemo user){
        demoService.insert(user);
    }
}
