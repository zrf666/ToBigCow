package com.zrf.picturebed.controller;

import com.zrf.picturebed.entity.Users;
import com.zrf.picturebed.service.impl.UsersServiceImpl;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author fafa
 * @version 1.0
 */
@RestController
public class UsersController {
    @Autowired
    private UsersServiceImpl usersService;

    @GetMapping("/getusers")
    public Users getUsers(){
        return usersService.getUsers();
    }

    @GetMapping("/insert")
    public int insert(){
        return usersService.insert();
    }

    @PostMapping("/register")
    public int register(Users newUser){
        return usersService.register(newUser);
    }
}
