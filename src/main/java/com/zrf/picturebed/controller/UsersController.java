package com.zrf.picturebed.controller;

import com.zrf.picturebed.entity.Users;
import com.zrf.picturebed.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author fafa
 * @version 1.0
 */
@RestController
public class UsersController {
    @Autowired
    private UsersService usersService;

    @GetMapping("/getusers")
    //@ResponseBody
    public Users getUsers(){
        return usersService.getUsers();
    }
}
