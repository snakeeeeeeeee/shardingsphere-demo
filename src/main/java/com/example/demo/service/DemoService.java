package com.example.demo.service;

import com.example.demo.dao.UserMapper;
import com.example.demo.domain.UserDemo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @version 1.0 created  on 2019/12/11 16:19
 */
@Service
@AllArgsConstructor
public class DemoService {

    private UserMapper userMapper;

    public UserDemo selectUser(Integer id){
        return userMapper.selectUser(id);
    }

    public void insert(UserDemo user){
        userMapper.insertUser(user);
    }
}
