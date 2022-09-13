package com.zrf.picturebed.service;

import com.zrf.picturebed.entity.Users;

public interface UsersService {
    Users getUsers();

    Users getUserById(int id);

    int insert();

    int register(Users newUser);
}
