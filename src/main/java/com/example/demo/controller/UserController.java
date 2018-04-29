package com.example.demo.controller;

import com.example.demo.dao.UserMapper;
import com.example.demo.model.UserData;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by fucheng on 2018/4/29.
 */
//证明是controller层并且返回json
@RestController
public class UserController {

    @Autowired
    private  UserService userService;

    @Autowired
    private UserMapper userMapper;

    @RequestMapping(value = "/user")
    public UserData selectUserByName() {

        return userService.getUserInfo("小明");
    }



}