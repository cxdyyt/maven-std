package com.jh.controller;

import com.jh.dao.UserDao;
import com.jh.domain.UserEntity;
import com.jh.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("/all")
    @ResponseBody
    public List<UserEntity> getAllUser(){
        List<UserEntity> userEntityList= userService.getAllUser();
        return userEntityList;
    }
    @ResponseBody
    @RequestMapping(value = "/saveOne",method= RequestMethod.POST)
    public String saveOne(@RequestBody UserEntity userEntity){
        String res = userService.saveOne(userEntity).toString();
        return res;
    }
}
