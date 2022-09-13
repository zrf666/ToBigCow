package com.zrf.picturebed.service.impl;

import com.zrf.picturebed.dao.UsersDAO;
import com.zrf.picturebed.entity.Users;
import com.zrf.picturebed.service.UsersService;
import com.zrf.picturebed.utils.Sex;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author fafa
 * @version 1.0
 */
@Service
public class UsersServiceImpl implements UsersService {
    @Autowired
    private UsersDAO usersDAO;


    @Override
    public Users getUsers() {
        return usersDAO.getUsers();
    }

    @Override
    public Users getUserById(int id) {
        return usersDAO.getUserById(id);
    }

    @Override
    public int insert() {
        Users newUsers = new Users(1, "linin", Sex.MAN, "2323346772");
        if(usersDAO.existsById(1)){
            return 0;
        }
        return usersDAO.insert(newUsers).getId();
    }

    @Override
    public int register(Users newUser) {
        if(usersDAO.existsByName(newUser.getName())){
            return 0;
        }
        usersDAO.insert(newUser);
        return newUser.getId();
    }
}
